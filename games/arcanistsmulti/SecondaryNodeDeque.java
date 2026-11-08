/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static IndexedSprite[] field_c;
    static String field_b;
    DualLinkNode field_g;
    static byte[] field_d;
    static int field_f;
    static String field_e;
    static String field_a;

    final static void defineMenuScreens(byte param0) {
        MembershipOfferScreen.defineScreenLayout(29, new int[]{0, 1, 27, 5, 14, 4, 22, 15, 19}, param0 ^ -9, 0, 146, 577, 250);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{2, 20, 21, 5, 9}, 0, 1, 320, 288, 32);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{2, 20, 21, 5, 10, 11, 13}, 0, 2, 320, 288, 32);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{12, 13}, 0, 3, 32, 288, 32);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{2, 20, 21, 5, 13}, 0, 4, 320, 288, 32);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{29}, 0, 5, 410, 480, 160);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{23, 8}, 0, 6, 410, 480, 160);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{25, 8, 26}, param0 ^ -9, 7, 430, 540, 70);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{25, 8, 26, 23}, param0 ^ -9, 8, 400, 480, 160);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{7}, 0, 9, 400, 540, 290);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{7, 23}, 0, 10, 200, 540, 50);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{7, 28}, 0, 11, 430, 540, 110);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{7, 27}, param0 + 9, 12, 430, 540, 110);
        MembershipOfferScreen.defineScreenLayout(31, new int[]{7}, 0, 13, 430, 420, 220);
        if (param0 == -9) {
          MembershipOfferScreen.defineScreenLayout(31, new int[]{25, 26, 30, 29, 7}, 0, 14, 430, 420, 220);
          MembershipOfferScreen.defineScreenLayout(29, new int[]{20, 21, 6, 7}, 0, 15, 146, 577, 250);
          MembershipOfferScreen.defineScreenLayout(31, new int[]{7}, 0, 16, 200, 540, 50);
          return;
        }
    }

    final DualLinkNode removeFirst(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != 31) {
          field_a = (String) null;
          var2 = this.field_g.secondaryNext;
          if (var2 != this.field_g) {
            var2.unlinkSecondary((byte) 88);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_g.secondaryNext;
        if (var2Lifetime1 != this.field_g) {
          var2Lifetime1.unlinkSecondary((byte) 88);
          return var2Lifetime1;
        }
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final static String getSettingsCookie(java.applet.Applet param0, int param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          String stackIn_15_0 = null;
          String stackIn_17_0 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            if (param1 >= -119) {
              stackIn_3_0 = (String) null;
              return stackIn_3_0;
            }
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (JavaScriptBridge.callFunction(param0, 119, "getcookies"));
              var5 = ValidationState.split(false, ';', var4);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (MouseStateHelpers.field_b == null) {
              stackIn_17_0 = param0.getParameter("settings");
              return stackIn_17_0;
            }
            stackIn_15_0 = MouseStateHelpers.field_b;
            return stackIn_15_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("gb.C(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void sendTwoByteRequest(int param0, boolean param1) {
        CipherPacketBuffer var2 = null;
        if (param1) {
          var2 = StatusMessageHelpers.field_e;
          var2.writeOpcode((byte) -124, param0);
          var2.writeByte(1, (byte) -54);
          var2.writeByte(2, (byte) -47);
          return;
        }
    }

    final void addLast(byte param0, DualLinkNode param1) {
        if (null != param1.secondaryPrevious) {
          param1.unlinkSecondary((byte) 88);
        }
        param1.secondaryNext = this.field_g;
        param1.secondaryPrevious = this.field_g.secondaryPrevious;
        if (param0 != 37) {
          return;
        }
        try {
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "gb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    SecondaryNodeDeque() {
        this.field_g = new DualLinkNode();
        this.field_g.secondaryNext = this.field_g;
        this.field_g.secondaryPrevious = this.field_g;
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        int var1 = 2 % ((76 - param0) / 36);
        field_a = null;
    }

    final static void closeQuickChat(int param0) {
        LoginMethodHelpers.field_i = false;
        if (CacheEntry.field_q != null) {
          CacheEntry.field_q.clearTabStates(-111);
        }
        if (param0 != 14) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          SecondaryNodeDeque.getSettingsCookie((java.applet.Applet) null, 114);
          if (NameCheckHelpers.field_c != 0) {
            BattleStartHelpers.clearChatInput(10);
            TermsNoticePanel.field_K = 0;
            return;
          }
          TermsNoticePanel.field_K = 0;
          return;
        }
        if (NameCheckHelpers.field_c == 0) {
          TermsNoticePanel.field_K = 0;
          return;
        }
        BattleStartHelpers.clearChatInput(10);
        TermsNoticePanel.field_K = 0;
    }

    static {
        field_b = "Allow spectators?";
        field_a = "Return to lobby";
        field_e = "Click the mouse to summon the minion. You can only summon within the shown summoning circle and clear of the landscape. Minions are either living, arcane or undead.";
    }
}
