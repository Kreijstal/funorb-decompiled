/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends kc {
    static am field_Ib;
    static String field_Bb;
    private kc field_Cb;
    static String field_Hb;
    kc field_Eb;
    static kc field_Db;
    static kc field_Fb;
    static java.math.BigInteger field_Jb;
    static hb field_Gb;

    final static void b(int param0, int param1, int param2) {
        if (param1 != 19129) {
            return;
        }
        gi.field_c = param0;
        mf.field_c = param2;
        if (!(p.field_b == null)) {
            p.field_b.a(-118, param0, param2);
        }
    }

    final static hc f(byte param0) {
        if (param0 != 13) {
          field_Hb = (String) null;
          return new hc(k.a(param0 ^ 13), ga.b(3236));
        } else {
          return new hc(k.a(param0 ^ 13), ga.b(3236));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param3, param4, param5, param2, (byte) -120);
        this.a(param0, param6, false);
        if (param1 != 0) {
            this.a(38, -70, true);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = -36 % ((param2 - 17) / 45);
        int var4 = -param0;
        int var6 = -param0;
        if (null != this.field_Cb) {
            var4 = this.field_Cb.c(-25921);
        }
        if (!(this.field_Eb == null)) {
            var6 = this.field_Eb.c(-25921);
        }
        return param1 + (var6 + var4 + param1) + param0;
    }

    final static qb[] a(byte param0, eg param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 31) {
                break L1;
              } else {
                field_Hb = (String) null;
                break L1;
              }
            }
            var4_int = param1.c(param3, param0 ^ 65);
            var5 = param1.a(param2, (byte) 29, var4_int);
            stackIn_3_0 = om.a(var5, var4_int, (byte) -123, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("nl.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(int param0) {
        field_Ib = null;
        field_Bb = null;
        field_Fb = null;
        field_Db = null;
        field_Hb = null;
        field_Gb = null;
        field_Jb = null;
        if (param0 != -10765) {
            field_Jb = (java.math.BigInteger) null;
        }
    }

    nl(long param0, kc param1, kc param2, kc param3, qb param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_Cb = new kc(0L, param2);
                this.field_Cb.field_W = param4;
                this.a(this.field_Cb, 116);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_Eb = new kc(0L, param3, param5);
                this.a(this.field_Eb, 99);
                this.e((byte) 20);
                break L2;
              } else {
                this.e((byte) 20);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("nl.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        var4 = -param1;
        if (!param2) {
          L0: {
            var5 = -param1;
            if (this.field_Cb != null) {
              var4 = this.field_Cb.c(-25921);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (this.field_Eb == null) {
              break L1;
            } else {
              var5 = this.field_Eb.a(-var4 + (-param0 + (this.field_x + (-param1 - param0))), -123);
              break L1;
            }
          }
          L2: {
            var6 = var5 + (param1 + var4) + param0 - -param0;
            if (var6 <= this.field_x) {
              break L2;
            } else {
              var5 = var5 + (this.field_x - var6);
              var6 = this.field_x;
              break L2;
            }
          }
          L3: {
            if (this.field_X != 1) {
              break L3;
            } else {
              param0 = param0 + (-var6 + this.field_x) / 2;
              break L3;
            }
          }
          L4: {
            if (2 != this.field_X) {
              break L4;
            } else {
              param0 = param0 + (this.field_x + -var6);
              break L4;
            }
          }
          L5: {
            if (null != this.field_Cb) {
              this.field_Cb.a(var4, param0, 0, this.field_I, (byte) -120);
              this.field_Cb.field_gb = this.field_gb;
              break L5;
            } else {
              break L5;
            }
          }
          if (this.field_Eb != null) {
            this.field_Eb.a(var5, param1 + (var4 + param0), 0, this.field_I, (byte) -120);
            if (null == this.field_Cb) {
              this.field_Eb.field_X = this.field_X;
              this.field_Eb.field_gb = this.field_gb;
              return;
            } else {
              this.field_Eb.field_X = 0;
              this.field_Eb.field_gb = this.field_gb;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_Bb = "Offer unrated rematch";
        field_Hb = "Visit the Account Management section on the main site to view.";
        field_Ib = new am();
        field_Jb = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
