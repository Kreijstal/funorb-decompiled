/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends gn {
    static String field_m;
    int field_f;
    static String field_e;
    static String field_n;
    int field_k;
    static int field_g;
    static int field_l;
    static String field_i;
    String field_h;
    tf field_j;

    final static void a(int param0, nu param1, int param2, nl param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        nl var7 = null;
        nl stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = (nl) (param3);
          if (param0 == 1) {
            stackIn_3_1 = 1;
          } else {
            stackIn_3_1 = -1;
          }
          stackIn_2_0.field_n = stackIn_3_1;
          param3.field_j = 0;
          param3.field_z = -hf.a(param0, param1, 27);
          var7 = param1.field_P[param0][-param3.field_z];
          var5 = var7.field_w;
          var6 = var7.field_M;
          if (param2 > -12) {
            return;
          }
          if (0 > var6) {
            var5 = 44040192;
            var6 = 29360128;
          }
          param3.field_h = uv.a(true, var5 - param3.field_w, var6 - param3.field_M);
          param3.a((byte) -31, 2);
          param3.field_L = param3.field_L + 25;
          if (15 <= param3.field_o) {
            return;
          }
          param3.field_o = param3.field_o + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("lk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        if (param0 != 0) {
          return;
        }
        field_n = null;
        field_i = null;
    }

    final li a(boolean param0, tm[] param1) throws dw, fi {
        int incrementValue$0 = 0;
        tf stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        li stackIn_10_0 = null;
        li stackIn_15_0 = null;
        li stackIn_18_0 = null;
        li stackIn_21_0 = null;
        li stackIn_23_0 = null;
        li stackIn_27_0 = null;
        li stackIn_30_0 = null;
        li stackIn_36_0 = null;
        li stackIn_40_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lk var5 = null;
        int var6 = 0;
        li[] var7 = null;
        li[] var8 = null;
        String var9 = null;
        var6 = Kickabout.field_G;
        try {
          try {
            if (this.field_k == vu.field_Ab) {
              stackIn_5_0 = this.field_j;
              stackIn_6_1 = !(param0);
              var7 = new li[((tf) (Object) stackIn_5_0).a(stackIn_6_1)];
              var8 = var7;
              var4 = 0;
              var5 = (lk) (this.field_j.g(24009));
              while (var5 != null) {
                incrementValue$0 = var4;
                var4++;
                var7[incrementValue$0] = var5.a(true, param1);
                var5 = (lk) (this.field_j.c(33));
              }
              stackIn_10_0 = lo.a(var8, false, param1, this.field_h);
              return stackIn_10_0;
            }
            if (this.field_k == pv.field_H) {
              var3_int = Character.toLowerCase(this.field_h.charAt(this.field_h.length() - 1));
              if (var3_int == 102) {
                stackIn_15_0 = new li(Float.valueOf(this.field_h).floatValue());
                return stackIn_15_0;
              }
              if (108 == var3_int) {
                stackIn_18_0 = new li(Long.parseLong(this.field_h.substring(0, -1 + this.field_h.length())));
                return stackIn_18_0;
              }
              if (-1 == this.field_h.indexOf('.')) {
                stackIn_23_0 = new li(Integer.parseInt(this.field_h));
                return stackIn_23_0;
              }
              stackIn_21_0 = new li(Double.valueOf(this.field_h).doubleValue());
              return stackIn_21_0;
            }
            if (this.field_k == ra.field_N) {
              stackIn_27_0 = new li(this.field_h.equals("true"));
              return stackIn_27_0;
            }
            if (!param0) {
              stackIn_30_0 = (li) null;
              return stackIn_30_0;
            }
            if (this.field_k == v.field_d) {
              var9 = this.field_h.substring(1, this.field_h.length() - 1);
              if (var9.length() != 1) {
                throw new dw("Invalid char value: " + var9);
              }
              stackIn_36_0 = new li(var9.charAt(0));
              return stackIn_36_0;
            }
            if (rb.field_Mb == this.field_k) {
              stackIn_40_0 = new li(this.field_h.substring(1, -1 + this.field_h.length()));
              return stackIn_40_0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (NumberFormatException) (Object) decompiledCaughtException;
            throw new dw("NumberFormatException on: " + this.field_h);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_46_0 = var3_ref;
          stackIn_46_1 = new StringBuilder().append("lk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    lk(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    public final String toString() {
        if (vu.field_Ab == this.field_k) {
          return "Method{" + this.field_h + "}";
        }
        if (pv.field_H == this.field_k) {
          return "Number{" + this.field_h + "}";
        }
        if (ra.field_N == this.field_k) {
          return "Boolean{" + this.field_h + "}";
        }
        if (this.field_k == v.field_d) {
          return "Char{" + this.field_h + "}";
        }
        if (this.field_k == rb.field_Mb) {
          return "String{" + this.field_h + "}";
        }
        if (si.field_g == this.field_k) {
          return "ArgStart";
        }
        if (this.field_k == og.field_c) {
          return "ArgEnd";
        }
        if (this.field_k == bp.field_Gb) {
          return "ArgComma";
        }
        return "Unknown";
    }

    lk(int param0, int param1, String param2) {
        try {
          this.field_k = param0;
          this.field_f = param1;
          this.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Invite only";
        field_e = "You have won this auction! The player now appears in your squad under the Management menu.";
        field_i = "ok";
        field_n = "Friends";
    }
}
