/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String field_e;
    static MouseInputHandler field_g;
    private long field_f;
    private DualLinkNode[] field_j;
    private int field_a;
    private DualLinkNode field_b;
    private int field_d;
    static int field_h;
    private DualLinkNode field_c;
    static String field_m;
    static hl field_i;
    static String field_k;
    static int field_l;

    final DualLinkNode c(int param0) {
        DualLinkNode var3 = null;
        int var4 = TetraLink.field_J;
        if (null == this.field_b) {
          return null;
        }
        DualLinkNode var2 = this.field_j[(int)(this.field_f & (long)(-1 + this.field_a))];
        while (var2 != this.field_b) {
          if (~this.field_b.secondaryKey == ~this.field_f) {
            var3 = this.field_b;
            this.field_b = this.field_b.secondaryNext;
            return var3;
          }
          this.field_b = this.field_b.secondaryNext;
        }
        this.field_b = null;
        if (param0 < 121) {
          return (DualLinkNode) null;
        }
        return null;
    }

    final void a(long param0, DualLinkNode param1, int param2) {
        DualLinkNode var5 = null;
        try {
          if (param1.secondaryPrevious != null) {
            param1.unlinkSecondary(0);
          }
          if (param2 < 94) {
            kd.a(-121, 28, (byte) -36);
          }
          var5 = this.field_j[(int)(param0 & (long)(this.field_a - 1))];
          param1.secondaryNext = var5;
          param1.secondaryPrevious = var5.secondaryPrevious;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
          param1.secondaryKey = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "kd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2) {
        SpriteState.field_G = param0;
        ta.field_a = param0;
        ik.field_a = param1;
        ta.field_b = param1;
        if (param2 != -121) {
          return;
        }
        vn.a(param0, param1);
    }

    public static void a(int param0) {
        field_e = null;
        field_i = null;
        int var1 = -52 / ((-5 - param0) / 51);
        field_g = null;
        field_k = null;
        field_m = null;
    }

    final DualLinkNode a(long param0, int param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        var6 = TetraLink.field_J;
        this.field_f = param0;
        var4 = this.field_j[(int)((long)(this.field_a - param1) & param0)];
        this.field_b = var4.secondaryNext;
        while (true) {
          if (this.field_b == var4) {
            this.field_b = null;
            return null;
          }
          if (this.field_b.secondaryKey != param0) {
            this.field_b = this.field_b.secondaryNext;
            continue;
          }
          break;
        }
        var5 = this.field_b;
        this.field_b = this.field_b.secondaryNext;
        return var5;
    }

    final DualLinkNode b(int param0) {
        this.field_d = 0;
        int var2 = 31 / ((param0 - 38) / 43);
        return this.d(-1);
    }

    final DualLinkNode d(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var8;
        var3 = TetraLink.field_J;
        if (param0 <= ~this.field_d) {
          do {
            if (this.field_a <= this.field_d) {
              return null;
            }
            fieldTemp$1 = this.field_d;
            this.field_d = this.field_d + 1;
            var4 = this.field_j[fieldTemp$1].secondaryNext;
          } while (this.field_j[this.field_d - 1] == var4);
          this.field_c = var4.secondaryNext;
          return var4;
        }
        if (this.field_c != this.field_j[-1 + this.field_d]) {
          var8 = this.field_c;
          this.field_c = var8.secondaryNext;
          return var8;
        }
        do {
          if (this.field_a <= this.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var5 = this.field_j[fieldTemp$0].secondaryNext;
        } while (this.field_j[this.field_d - 1] == var5);
        this.field_c = var5.secondaryNext;
        return var5;
    }

    kd(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_d = 0;
        this.field_j = new DualLinkNode[param0];
        this.field_a = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_j[var2] = dupTemp$1;
          var3.secondaryNext = var3;
          var3.secondaryPrevious = var3;
        }
    }

    static {
        field_e = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_g = new MouseInputHandler();
        field_m = "Spectate";
        field_k = "<%0> has entered a game.";
    }
}
