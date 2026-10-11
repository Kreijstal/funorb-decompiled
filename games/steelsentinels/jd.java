/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends ac implements ae {
    static String[] field_nb;
    private oa field_ob;
    static pm field_kb;
    static rf field_sb;
    static java.lang.reflect.Method field_rb;
    static String field_jb;
    static gk[] field_qb;
    static java.math.BigInteger field_ib;
    static String field_pb;
    static int[] field_lb;
    static String[] field_mb;

    final static void m(int param0) {
        qf.field_e = new ol(an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K);
        if (param0 != -6) {
          jd.a('{', -67);
        }
    }

    private final void c(boolean param0) {
        if (!param0) {
          field_lb = (int[]) null;
          if (!this.field_Q) {
            return;
          }
          this.field_Q = false;
          return;
        }
        if (!this.field_Q) {
          return;
        }
        this.field_Q = false;
    }

    jd(ka param0, hm param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh var4 = null;
        try {
          var3 = null;
          if (param1 == ra.field_a) {
            var3 = r.field_p;
          } else {
            if (wh.field_b == param1) {
              var3 = ff.field_gb;
              this.field_E = this.field_E + 10;
              if (ph.b(12412)) {
                this.field_E = this.field_E + 20;
                var3 = tm.field_a;
              }
            } else {
              if (im.field_a == param1) {
                this.field_E = this.field_E + 30;
                var3 = sl.field_q;
              }
            }
          }
          var4 = new lh((String) (var3), (tn) null);
          var4.field_o = 0;
          var4.field_z = 50;
          var4.field_E = 80;
          var4.field_x = this.field_x;
          var4.field_p = (qk) ((Object) new cn(rc.field_m, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var4, -107);
          this.field_ob = this.a((tn) (this), jf.field_cb, 104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("jd.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final oa a(tn param0, String param1, int param2) {
        oa var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        oa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new oa(param1, param0);
          var4.field_p = (qk) ((Object) new kh());
          var5 = this.field_E - 6;
          this.field_E = this.field_E + 38;
          var4.a(15, (byte) -127, var5, -14 + (this.field_x - 16), 30);
          this.a(var4, -113);
          if (param2 < 86) {
            this.c(true);
          }
          this.e((byte) 82);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("jd.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -73 / ((param1 + 85) / 36);
          if (param3 != this.field_ob) {
            return;
          }
          this.c(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("jd.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 != -33) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (param0 != 45) {
          return false;
        }
        return true;
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          if (param0 == null) {
            stackIn_4_0 = lk.field_Y;
            return stackIn_4_0;
          }
          var3_int = param0.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = ui.a(1, param0);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!jd.a(var4.charAt(0), -33) &&
                !jd.a(var4.charAt(var4.length() - 1), -33)) {
                var5 = 0;
                if (param2 < 81) {
                  stackIn_22_0 = (String) null;
                  return stackIn_22_0;
                }
                for (var6 = 0; param0.length() > var6; var6++) {
                  var7 = param0.charAt(var6);
                  if (!jd.a((char) var7, -33)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_32_0 = jb.field_Q;
                    return stackIn_32_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_37_0 = ad.field_g;
                return stackIn_37_0;
              }
              stackIn_19_0 = ad.field_g;
              return stackIn_19_0;
            }
            stackIn_14_0 = lk.field_Y;
            return stackIn_14_0;
          }
          stackIn_9_0 = lk.field_Y;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("jd.Q(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_pb = null;
        field_kb = null;
        field_sb = null;
        field_lb = null;
        field_qb = null;
        field_ib = null;
        field_rb = null;
        field_jb = null;
        field_mb = null;
        field_nb = null;
        if (param0 != 0) {
          CharSequence var2 = (CharSequence) null;
          jd.a((CharSequence) null, true, -55);
        }
    }

    static {
        field_nb = new String[]{"Fusion<nbsp>reaver", "EMP<nbsp>laceration", "Hammer<nbsp>strike"};
        field_sb = new rf();
        field_pb = "Options";
        field_lb = new int[8192];
        field_jb = "Save favourite";
        field_ib = new java.math.BigInteger("65537");
        field_mb = new String[]{"DESTINY!", "ROSEBUD!", "NOT YET!", "IS THIS ALL THERE IS?", "I THIRST!", "WHY?", "IT IS ALL TRUE!"};
    }
}
