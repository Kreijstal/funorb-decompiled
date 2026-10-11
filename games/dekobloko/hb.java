/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends w {
    private w field_Nb;
    static String field_Pb;
    static ui field_Ub;
    private StringBuilder field_Xb;
    static int field_Wb;
    private w field_Sb;
    private int field_Rb;
    static String[][] field_Qb;
    static String field_Tb;
    static String field_Ob;
    static int[] field_Vb;

    final int a(byte param0, boolean param1) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4;
        var4 = client.field_A ? 1 : 0;
        this.a(false, param1);
        if (!param1) {
          this.field_Sb.field_Y = this.field_Xb.toString();
          if (param1 &&
            ig.field_Yb != 0 &&
            this.field_ob == 0) {
            this.field_Rb = 1;
          }
          if (param0 == -63) {
            return this.field_Rb;
          }
          field_Wb = 87;
          return this.field_Rb;
        }
        while (true) {
          if (!ab.$cfr$intArgs$c$a284cb190b53(-126)) {
            this.field_Sb.field_Y = this.field_Xb.toString();
            if (param1 &&
              ig.field_Yb != 0 &&
              this.field_ob == 0) {
              this.field_Rb = 1;
              if (param0 != -63) {
                field_Wb = 87;
              }
              return this.field_Rb;
            }
            if (param0 == -63) {
              return this.field_Rb;
            }
            field_Wb = 87;
            return this.field_Rb;
          }
          if (85 == wh.field_c &&
            this.field_Xb.length() > 0) {
            vf.a(this.field_Xb, -23510, -1 + this.field_Xb.length(), ' ');
          }
          if (re.a(param0 ^ 9, el.field_G, (CharSequence) ((Object) this.field_Xb))) {
            discarded$1 = this.field_Xb.append(el.field_G);
          } else {
            if (this.field_Xb.length() == 0 &&
              91 == el.field_G) {
              discarded$2 = this.field_Xb.append(el.field_G);
            } else {
              if (this.field_Xb.length() == 1 &&
                el.field_G == 35) {
                discarded$3 = this.field_Xb.append(el.field_G);
              } else {
                if (el.field_G == 93) {
                  discarded$4 = this.field_Xb.append(el.field_G);
                }
              }
            }
          }
          if (wh.field_c != 84) {
            if (wh.field_c != 13) {
              continue;
            }
            return 1;
          }
          break;
        }
        if (this.field_Xb.length() <= 0) {
          return 1;
        }
        this.field_Y = this.field_Xb.toString();
        return 2;
    }

    final boolean f(int param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var2;
        int var2Lifetime1;
        if (this.field_Rb != 0) {
          return false;
        }
        if (wh.field_c != 85) {
          if (this.field_Xb.length() < 12) {
            var2 = Character.toLowerCase(el.field_G);
            if (var2 == 32) {
              var2 = 95;
            }
            if (95 == var2 &&
              0 < this.field_Xb.length()) {
              discarded$6 = this.field_Xb.append((char) var2);
            }
            if (v.a((char) var2, -24380)) {
              discarded$7 = this.field_Xb.append((char) var2);
            } else {
              if (fl.a((char) var2, (byte) 23)) {
                discarded$8 = this.field_Xb.append((char) var2);
                if (wh.field_c == 84) {
                  if (this.field_Xb.length() > 0) {
                    this.field_Y = this.field_Xb.toString();
                    this.field_Rb = 2;
                  } else {
                    this.field_Rb = 1;
                  }
                }
                if (wh.field_c == 13) {
                  this.field_Rb = 1;
                }
                if (param0 == 261) {
                  return true;
                }
                this.a((byte) 13, false);
                return true;
              }
            }
          }
          if (wh.field_c == 84) {
            if (this.field_Xb.length() <= 0) {
              this.field_Rb = 1;
            } else {
              this.field_Y = this.field_Xb.toString();
              this.field_Rb = 2;
            }
          }
          if (wh.field_c == 13) {
            this.field_Rb = 1;
          }
          if (param0 != 261) {
            this.a((byte) 13, false);
          }
          return true;
        }
        if (this.field_Xb.length() <= 0) {
          if (this.field_Xb.length() < 12) {
            var2Lifetime1 = Character.toLowerCase(el.field_G);
            if (var2Lifetime1 == 32) {
              var2Lifetime1 = 95;
            }
            if (95 == var2Lifetime1 &&
              0 < this.field_Xb.length()) {
              discarded$3 = this.field_Xb.append((char) var2Lifetime1);
            }
            if (v.a((char) var2Lifetime1, -24380)) {
              discarded$4 = this.field_Xb.append((char) var2Lifetime1);
            } else {
              if (fl.a((char) var2Lifetime1, (byte) 23)) {
                discarded$5 = this.field_Xb.append((char) var2Lifetime1);
                if (wh.field_c == 84) {
                  if (this.field_Xb.length() > 0) {
                    this.field_Y = this.field_Xb.toString();
                    this.field_Rb = 2;
                  } else {
                    this.field_Rb = 1;
                  }
                }
                if (wh.field_c == 13) {
                  this.field_Rb = 1;
                }
                if (param0 != 261) {
                  this.a((byte) 13, false);
                }
                return true;
              }
            }
          }
          if (wh.field_c != 84) {
            if (wh.field_c == 13) {
              this.field_Rb = 1;
            }
            if (param0 != 261) {
              this.a((byte) 13, false);
            }
            return true;
          }
          if (this.field_Xb.length() <= 0) {
            this.field_Rb = 1;
            if (wh.field_c == 13) {
              this.field_Rb = 1;
            }
            if (param0 != 261) {
              this.a((byte) 13, false);
            }
            return true;
          }
          this.field_Y = this.field_Xb.toString();
          this.field_Rb = 2;
          if (wh.field_c != 13) {
            if (param0 != 261) {
              this.a((byte) 13, false);
            }
            return true;
          }
          this.field_Rb = 1;
        } else {
          vf.a(this.field_Xb, param0 ^ -23249, this.field_Xb.length() - 1, ' ');
          if (this.field_Xb.length() < 12) {
            var2Lifetime1 = Character.toLowerCase(el.field_G);
            if (var2Lifetime1 == 32) {
              var2Lifetime1 = 95;
            }
            if (95 == var2Lifetime1 &&
              0 < this.field_Xb.length()) {
              discarded$0 = this.field_Xb.append((char) var2Lifetime1);
            }
            if (v.a((char) var2Lifetime1, -24380)) {
              discarded$1 = this.field_Xb.append((char) var2Lifetime1);
            } else {
              if (fl.a((char) var2Lifetime1, (byte) 23)) {
                discarded$2 = this.field_Xb.append((char) var2Lifetime1);
                if (wh.field_c == 84) {
                  if (this.field_Xb.length() > 0) {
                    this.field_Y = this.field_Xb.toString();
                    this.field_Rb = 2;
                  } else {
                    this.field_Rb = 1;
                  }
                }
                if (wh.field_c == 13) {
                  this.field_Rb = 1;
                }
                if (param0 != 261) {
                  this.a((byte) 13, false);
                }
                return true;
              }
            }
          }
          if (wh.field_c != 84) {
            if (wh.field_c == 13) {
              this.field_Rb = 1;
              if (param0 != 261) {
                this.a((byte) 13, false);
              }
              return true;
            }
          } else {
            if (this.field_Xb.length() <= 0) {
              this.field_Rb = 1;
            } else {
              this.field_Y = this.field_Xb.toString();
              this.field_Rb = 2;
            }
            if (wh.field_c == 13) {
              this.field_Rb = 1;
            }
          }
        }
        if (param0 == 261) {
          return true;
        }
        this.a((byte) 13, false);
        return true;
    }

    final static void a(byte[] param0, int param1, pi[] param2, ji param3, String[] param4, int param5, int param6, ji param7, String[][] param8, ck[][] param9, boolean param10, int[] param11, ck[][] param12, byte[] param13, String[][] param14, ji param15, int param16, String[] param17, int[] param18, String[] param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          bb.a(false, param15, param2, param11, param7);
          la.a(param15, 32373);
          mf.a(param6, param19, param0, param15, -8894, param8, param9, param1, param14, param17, param4, param12, param16, param13, param18);
          if (param5 != 3) {
            hb.e(-36);
          }
          ua.a(46, param15, param10, param3);
          ge.a((byte) 123);
          tj.h((byte) -27);
          f.d(18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("hb.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param8 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param9 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param12 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param13 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param15 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param18 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param19 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_Vb = null;
        field_Qb = (String[][]) null;
        if (param0 < -48) {
          field_Ob = null;
          field_Pb = null;
          field_Ub = null;
          field_Tb = null;
          return;
        }
        field_Pb = (String) null;
        field_Ob = null;
        field_Pb = null;
        field_Ub = null;
        field_Tb = null;
    }

    hb(int param0, int param1, int param2, int param3, String param4, w param5, w param6, w param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Rb = 0;
        try {
          this.field_Nb = new w(0L, param6, param4);
          this.a(this.field_Nb, -16834);
          this.field_Sb = new w(0L, param7);
          this.field_Sb.field_G = 16764006;
          this.a(this.field_Sb, -16834);
          this.field_Sb.field_T = "|";
          this.field_Xb = new StringBuilder(12);
          var9_int = this.field_Nb.a(true);
          this.field_Nb.a(var9_int, 0, 3, kf.field_O, 5);
          this.field_Sb.a(var9_int, 0, kf.field_O + 3, kf.field_O, 5);
          var10 = 10 + var9_int;
          var11 = 3 + (3 + 2 * kf.field_O);
          var12 = vh.a(param2, -18265, var10, param0);
          var13 = o.a(param3, 0, var11, param1);
          this.a(var10, 0, var13, var11, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("hb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Pb = "Players";
        field_Tb = "Please try changing the following settings:  ";
        field_Vb = new int[16384];
    }
}
