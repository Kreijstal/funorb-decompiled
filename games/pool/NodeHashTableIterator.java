/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private IntrusiveNode field_i;
    private int field_o;
    private IntrusiveNode field_m;
    private IntrusiveNodeHashTable field_h;
    static long[] field_f;
    static IntrusiveDeque field_j;
    static String reloadgame;
    static String mpAcceptrematchUnrated;
    static String mouseYAxisInverted;
    static String createIneligible;
    static int field_l;
    static String createU13terms;
    static String createEmailvalid;
    static Sprite field_k;
    static int field_s;
    static String createPasswordvalid;
    static int field_a;
    static String instructions;
    static int field_e;

    final static Sprite[] a(int param0, Sprite param1) {
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite[] var3 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new Sprite[9];
          var2 = var3;
          var3[4] = param1;
          if (param0 != -32344) {
            field_l = -30;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("hb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        createIneligible = null;
        if (param0 != 0) {
          mouseYAxisInverted = (String) null;
        }
        instructions = null;
        mpAcceptrematchUnrated = null;
        mouseYAxisInverted = null;
        field_k = null;
        createU13terms = null;
        field_f = null;
        createPasswordvalid = null;
        createEmailvalid = null;
        field_j = null;
        reloadgame = null;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = Pool.field_O;
        if (this.field_h.buckets[-1 + this.field_o] != this.field_m) {
          var1 = this.field_m;
          this.field_i = var1;
          this.field_m = var1.previous;
          return var1;
        }
        do {
          if (this.field_h.bucketCount <= this.field_o) {
            return null;
          }
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          var1 = this.field_h.buckets[fieldTemp$0].previous;
        } while (this.field_h.buckets[this.field_o - 1] == var1);
        this.field_m = var1.previous;
        this.field_i = var1;
        return var1;
    }

    final static void a(int param0, UiComponent param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        PlayerContextMenu var11 = null;
        Sprite var12 = null;
        String var13 = null;
        PlayerContextMenu var14 = null;
        Sprite var15 = null;
        String var16 = null;
        PlayerContextMenu var17 = null;
        Sprite var18 = null;
        String var19 = null;
        PlayerContextMenu var20 = null;
        Sprite var21 = null;
        String var22 = null;
        PlayerContextMenu var23 = null;
        Sprite var24 = null;
        String var25 = null;
        PlayerContextMenu var26 = null;
        Sprite var27 = null;
        String var28 = null;
        PlayerContextMenu var29 = null;
        Sprite var30 = null;
        String var31 = null;
        PlayerContextMenu var32 = null;
        Sprite var33 = null;
        String var34 = null;
        PlayerContextMenu var35 = null;
        Sprite var36 = null;
        String var37 = null;
        PlayerContextMenu var38 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Sprite var30Lifetime1;
        Sprite var30Lifetime2;
        Sprite var30Lifetime3;
        Sprite var30Lifetime4;
        Sprite var30Lifetime5;
        Sprite var30Lifetime6;
        Sprite var30Lifetime7;
        Sprite var30Lifetime1Lifetime1;
        Sprite var30Lifetime1Lifetime2;
        Sprite var30Lifetime1Lifetime3;
        Sprite var30Lifetime1Lifetime4;
        Sprite var30Lifetime1Lifetime5;
        try {
          dr.openPlayerContextMenu((String) null, param2, 0L, -1, (ScrollPane) null, (String) null, 32540, param1, (int[]) null);
          if (0 == param2) {
            var11 = PlasmaBallSkin.field_m;
            var12 = ThemeSelectScreen.field_M[0];
            var30 = var12;
            var30Lifetime3 = var12;
            var13 = IntrusiveDeque.muChatLobbyShowAll;
            var11.field_n.addIconAction(11, (byte) 108, var12, var13);
            var14 = PlasmaBallSkin.field_m;
            var15 = ThemeSelectScreen.field_M[1];
            var30Lifetime4 = var15;
            var30Lifetime5 = var15;
            var16 = sa.muChatLobbyFriends;
            var14.field_n.addIconAction(12, (byte) -77, var15, var16);
            var17 = PlasmaBallSkin.field_m;
            var18 = ThemeSelectScreen.field_M[2];
            var30Lifetime6 = var18;
            var30Lifetime7 = var18;
            var19 = Pool.muChatLobbyHide;
            var17.field_n.addIconAction(13, (byte) -75, var18, var19);
          }
          if (param2 == 1) {
            var20 = PlasmaBallSkin.field_m;
            var21 = ThemeSelectScreen.field_M[0];
            var30Lifetime1 = var21;
            var30Lifetime1Lifetime1 = var21;
            var22 = ra.muChatGameShowAll;
            var20.field_n.addIconAction(11, (byte) -87, var21, var22);
            var23 = PlasmaBallSkin.field_m;
            var24 = ThemeSelectScreen.field_M[1];
            var30Lifetime1Lifetime2 = var24;
            var30Lifetime1Lifetime3 = var24;
            var25 = md.muChatGameFriends;
            var23.field_n.addIconAction(12, (byte) -119, var24, var25);
            var26 = PlasmaBallSkin.field_m;
            var27 = ThemeSelectScreen.field_M[2];
            var30Lifetime1Lifetime4 = var27;
            var30Lifetime1Lifetime5 = var27;
            var28 = TextLayout.muChatGameHide;
            var26.field_n.addIconAction(13, (byte) 82, var27, var28);
          }
          if (param2 == 2) {
            var29 = PlasmaBallSkin.field_m;
            var30Lifetime2 = ThemeSelectScreen.field_M[0];
            var31 = kp.muChatPmShowAll;
            var29.field_n.addIconAction(11, (byte) -122, var30Lifetime2, var31);
            var32 = PlasmaBallSkin.field_m;
            var33 = ThemeSelectScreen.field_M[1];
            var34 = rm.muChatPmFriends;
            var32.field_n.addIconAction(12, (byte) 122, var33, var34);
            var35 = PlasmaBallSkin.field_m;
            var36 = ThemeSelectScreen.field_M[2];
            var37 = EmailAvailabilityValidator.muChatInvisibleAndSilentMode;
            var35.field_n.addIconAction(13, (byte) 90, var36, var37);
          }
          var38 = PlasmaBallSkin.field_m;
          var4 = param1.screenX;
          var5 = param1.screenY;
          var6 = param1.width;
          var7 = param1.height;
          var38.field_n.layoutAtAnchor(var6, var7, var4, 0, var5);
          if (param0 != 27937) {
            mpAcceptrematchUnrated = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("hb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void remove() {
        if (null == this.field_i) {
          throw new IllegalStateException();
        }
        this.field_i.unlink((byte) -117);
        this.field_i = null;
    }

    private final void a(byte param0) {
        this.field_i = null;
        if (param0 != 43) {
          return;
        }
        this.field_m = this.field_h.buckets[0].previous;
        this.field_o = 1;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Pool.field_O;
        if (this.field_h.buckets[-1 + this.field_o] != this.field_m) {
          return true;
        }
        while (this.field_o < this.field_h.bucketCount) {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          if (this.field_h.buckets[fieldTemp$0].previous != this.field_h.buckets[this.field_o - 1]) {
            this.field_m = this.field_h.buckets[-1 + this.field_o].previous;
            return true;
          }
          this.field_m = this.field_h.buckets[this.field_o - 1];
        }
        return false;
    }

    NodeHashTableIterator(IntrusiveNodeHashTable param0) {
        this.field_i = null;
        try {
          this.field_h = param0;
          this.a((byte) 43);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_f = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_f[var2] = var0;
        }
        mpAcceptrematchUnrated = "Accept unrated rematch";
        mouseYAxisInverted = "Mouse Y-axis: Inverted";
        createIneligible = "Unfortunately you are not eligible to create an account.";
        createU13terms = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        reloadgame = "Reload game";
        field_j = new IntrusiveDeque();
        createEmailvalid = "Email is valid";
        createPasswordvalid = "Password is valid";
        field_s = -1;
        instructions = "Instructions";
        field_e = -1;
    }
}
