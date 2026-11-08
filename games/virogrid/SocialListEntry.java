/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SocialListEntry extends SpriteWidget {
    static String field_Kb;
    String field_Pb;
    int field_Nb;
    String field_Jb;
    SpriteWidget field_Eb;
    static BufferedFile field_Ib;
    SpriteWidget field_Mb;
    String field_Hb;
    String field_Ob;
    static String field_Fb;
    static String hotseatoptionAilevelColon;
    SpriteWidget field_Gb;

    final static String formatGmtTimestamp(long param0, byte param1) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        QuickChatCategoryCache.field_l.setTime(new Date(param0));
        int var3 = QuickChatCategoryCache.field_l.get(7);
        int var4 = QuickChatCategoryCache.field_l.get(5);
        int var5 = QuickChatCategoryCache.field_l.get(2);
        int var6 = QuickChatCategoryCache.field_l.get(1);
        if (param1 > 74) {
          var7 = QuickChatCategoryCache.field_l.get(11);
          var8 = QuickChatCategoryCache.field_l.get(12);
          var9 = QuickChatCategoryCache.field_l.get(13);
          return LobbySessionHelpers.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + LobbySortHelpers.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    public static void releaseStatics(boolean param0) {
        hotseatoptionAilevelColon = null;
        field_Fb = null;
        field_Ib = null;
        field_Kb = null;
        if (param0) {
          SocialListEntry.releaseStatics(true);
        }
    }

    SocialListEntry() {
        super(0L, (SpriteWidget) null);
    }

    static {
        field_Kb = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        hotseatoptionAilevelColon = "AI: <%0>";
    }
}
