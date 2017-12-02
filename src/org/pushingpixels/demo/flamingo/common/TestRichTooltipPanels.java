package org.pushingpixels.demo.flamingo.common;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Address_book_new;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Help_browser;
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.internal.ui.common.JRichTooltipPanel;

public class TestRichTooltipPanels extends JFrame {
    public TestRichTooltipPanels() {
        RichTooltip rt = new RichTooltip();
        rt.setTitle("Main title that can go over multiple lines of text even exceeding the bigger");
        rt.addDescriptionSection(
                "Simple description that can go over multiple lines of text even exceeding the bigger");
        rt.addDescriptionSection(
                "Second paragraph that can be multiline as well to test this feature");
        rt.setMainImage(new Address_book_new(), new Dimension(32, 32));
        rt.setFooterIcon(Help_browser.of(32, 32));
        rt.addFooterSection(
                "Multiline footer description to provide a little bit more information on this subject");

        JRichTooltipPanel panel = new JRichTooltipPanel(rt);
        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            new TestRichTooltipPanels().setVisible(true);
        });
    }

}
