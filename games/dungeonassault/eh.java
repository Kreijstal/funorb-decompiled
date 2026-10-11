/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    int field_g;
    il[] field_l;
    int field_m;
    int[] field_k;
    int[] field_j;
    String field_b;
    static String[] field_e;
    nh field_d;
    static String field_a;
    private md field_n;
    int field_f;
    String field_i;
    static ed field_o;
    static int field_h;
    int field_c;

    final static boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 83) {
          field_o = (ed) null;
        }
        stackIn_6_0 = (il.field_c != null) && (il.field_c.b(-108));
        return stackIn_6_0;
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            eh.b(-91);
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_3_0 = nn.field_k.equals(jm.a((byte) 59, var3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("eh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        this.field_n = null;
        if (param0 != -19) {
          String var3 = (String) null;
          eh.a(true, (String) null);
        }
        this.field_l = null;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_o = null;
        if (param0 <= 49) {
          String var2 = (String) null;
          eh.a(false, (String) null);
        }
    }

    private final cn a(byte param0, int param1) {
        int var3_int = 0;
        cn var3;
        int var5;
        int var4;
        cn var4_ref_cn;
        cn var6;
        cn var3Lifetime1;
        var5 = DungeonAssault.field_K;
        if (this.field_l == null) {
          this.field_l = new il[this.field_c];
        }
        if (null != this.field_l[param1]) {
          var3 = this.field_l[param1].a(16);
          if (var3 != null) {
            return var3;
          }
        }
        for (var3_int = 0; var3_int < this.field_c; var3_int++) {
          if (this.field_k[var3_int] == this.field_k[param1] &&
            null != this.field_l[var3_int]) {
            var4_ref_cn = this.field_l[var3_int].a(16);
            if (var4_ref_cn != null) {
              this.field_l[param1] = this.field_l[var3_int];
              return var4_ref_cn;
            }
          }
        }
        var4 = -62 / ((56 - param0) / 55);
        var6 = ia.a(this.field_b, this.field_m, this.field_i, 2316, this.field_g, Integer.toString(this.field_k[param1]), this.field_d);
        var3Lifetime1 = var6;
        this.field_l[param1] = new il(var6);
        return var3Lifetime1;
    }

    final cn a(int param0, int param1, int param2, int param3) {
        fl var5;
        Object var6;
        int var7;
        cn var8;
        var7 = DungeonAssault.field_K;
        if (param0 == this.field_g &&
          this.field_m == param2) {
          return this.a((byte) -94, param1);
        }
        if (param3 != 0) {
          return (cn) null;
        }
        if (this.field_n == null) {
          this.field_n = new md();
        }
        var5 = (fl) (this.field_n.e(param3 ^ -24172));
        while (var5 != null) {
          if (var5.field_q != param0 ||
            param2 != var5.field_p) {
            var5 = (fl) (this.field_n.a(param3 ^ 4));
            continue;
          }
          break;
        }
        if (var5 == null) {
          var5 = new fl(param0, param2, this.field_c);
          this.field_n.a(var5, false);
        }
        var6 = null;
        if (var5.field_k[param1] != null) {
          var6 = var5.field_k[param1].a(param3 ^ 16);
        }
        if (var6 == null) {
          var8 = lc.a(-121, this.a((byte) -105, param1), param0, param2);
          var6 = var8;
          var5.field_k[param1] = new il(var8);
        }
        return (cn) (var6);
    }

    static {
        field_e = new String[]{"Guardians", "<%highlight>This is a guardian room</col> - similar to <%traps>, a <%guardian> may be triggered by a raider entering the room. Unlike traps, they will never injure raiders or prevent progress through the dungeon. Instead, a triggered <%guardian> <%highlight>alerts all monsters in the dungeon</col>, making it harder to get the first attack against them."};
        field_a = "Gold stolen: ";
        field_h = 0;
    }
}
