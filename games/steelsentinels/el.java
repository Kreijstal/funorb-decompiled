/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends gh {
    static String field_Zb;
    static wk field_Ub;
    static wk field_ac;
    private int field_Yb;
    static byte[][] field_Sb;
    static String[] field_Vb;
    private gh field_Xb;
    private gh field_Tb;
    private StringBuilder field_Wb;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final boolean d(byte param0) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var2;
        int var2Lifetime1;
        if (param0 != 76) {
          return true;
        }
        if (this.field_Yb != 0) {
          return false;
        }
        if (ei.field_q != 85) {
          if (this.field_Wb.length() >= 12) {
            if (ei.field_q != 84) {
              if (13 != ei.field_q) {
                return true;
              }
              this.field_Yb = 1;
              return true;
            }
            if (0 >= this.field_Wb.length()) {
              this.field_Yb = 1;
            } else {
              this.field_S = this.field_Wb.toString();
              this.field_Yb = 2;
            }
          } else {
            var2 = Character.toLowerCase(de.field_c);
            if (var2 == 32) {
              var2 = 95;
            }
            if (95 == var2 &&
              this.field_Wb.length() > 0) {
              discarded$3 = this.field_Wb.append((char) var2);
            }
            if (kf.a((char) var2, (byte) 120)) {
              discarded$5 = this.field_Wb.append((char) var2);
              if (ei.field_q == 84) {
                if (0 < this.field_Wb.length()) {
                  this.field_S = this.field_Wb.toString();
                  this.field_Yb = 2;
                } else {
                  this.field_Yb = 1;
                }
              }
              if (13 == ei.field_q) {
                this.field_Yb = 1;
              }
              return true;
            }
            if (oa.a(-4278, (char) var2)) {
              discarded$4 = this.field_Wb.append((char) var2);
              if (ei.field_q == 84) {
                if (0 < this.field_Wb.length()) {
                  this.field_S = this.field_Wb.toString();
                  this.field_Yb = 2;
                } else {
                  this.field_Yb = 1;
                }
              }
              if (13 == ei.field_q) {
                this.field_Yb = 1;
              }
              return true;
            }
            if (ei.field_q == 84) {
              if (0 >= this.field_Wb.length()) {
                this.field_Yb = 1;
              } else {
                this.field_S = this.field_Wb.toString();
                this.field_Yb = 2;
              }
            }
          }
          if (13 == ei.field_q) {
            this.field_Yb = 1;
          }
          return true;
        }
        if (0 < this.field_Wb.length()) {
          dm.a(' ', 200, this.field_Wb, this.field_Wb.length() - 1);
        }
        if (this.field_Wb.length() >= 12) {
          if (ei.field_q == 84) {
            if (0 >= this.field_Wb.length()) {
              this.field_Yb = 1;
            } else {
              this.field_S = this.field_Wb.toString();
              this.field_Yb = 2;
            }
          }
          if (13 == ei.field_q) {
            this.field_Yb = 1;
          }
          return true;
        }
        var2Lifetime1 = Character.toLowerCase(de.field_c);
        if (var2Lifetime1 == 32) {
          var2Lifetime1 = 95;
        }
        if (95 == var2Lifetime1 &&
          this.field_Wb.length() > 0) {
          discarded$0 = this.field_Wb.append((char) var2Lifetime1);
        }
        if (kf.a((char) var2Lifetime1, (byte) 120)) {
          discarded$1 = this.field_Wb.append((char) var2Lifetime1);
          if (ei.field_q == 84) {
            if (0 < this.field_Wb.length()) {
              this.field_S = this.field_Wb.toString();
              this.field_Yb = 2;
            } else {
              this.field_Yb = 1;
            }
          }
          if (13 == ei.field_q) {
            this.field_Yb = 1;
          }
          return true;
        }
        if (!oa.a(-4278, (char) var2Lifetime1)) {
          if (ei.field_q == 84) {
            if (0 >= this.field_Wb.length()) {
              this.field_Yb = 1;
            } else {
              this.field_S = this.field_Wb.toString();
              this.field_Yb = 2;
            }
          }
          if (13 != ei.field_q) {
            return true;
          }
          this.field_Yb = 1;
          return true;
        }
        discarded$2 = this.field_Wb.append((char) var2Lifetime1);
        if (ei.field_q == 84) {
          if (0 >= this.field_Wb.length()) {
            this.field_Yb = 1;
            if (13 == ei.field_q) {
              this.field_Yb = 1;
            }
            return true;
          }
          this.field_S = this.field_Wb.toString();
          this.field_Yb = 2;
        }
        if (13 != ei.field_q) {
          return true;
        }
        this.field_Yb = 1;
        return true;
    }

    final int a(int param0, boolean param1) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4;
        var4 = SteelSentinels.field_G;
        this.a((byte) 108, param1);
        if (!param1) {
          if (param0 == -2) {
            this.field_Tb.field_S = this.field_Wb.toString();
            if (param1 &&
              lb.field_gc != 0 &&
              this.field_Eb == 0) {
              this.field_Yb = 1;
              return this.field_Yb;
            }
            return this.field_Yb;
          }
          field_Vb = (String[]) null;
          this.field_Tb.field_S = this.field_Wb.toString();
          if (!param1) {
            return this.field_Yb;
          }
          if (lb.field_gc == 0) {
            return this.field_Yb;
          }
          if (this.field_Eb != 0) {
            return this.field_Yb;
          }
          this.field_Yb = 1;
          return this.field_Yb;
        }
        while (true) {
          if (!dl.f(22759)) {
            if (param0 != -2) {
              field_Vb = (String[]) null;
              this.field_Tb.field_S = this.field_Wb.toString();
              if (param1 &&
                lb.field_gc != 0 &&
                this.field_Eb == 0) {
                this.field_Yb = 1;
              }
              return this.field_Yb;
            }
            this.field_Tb.field_S = this.field_Wb.toString();
            if (!param1) {
              return this.field_Yb;
            }
            if (lb.field_gc == 0) {
              return this.field_Yb;
            }
            if (this.field_Eb != 0) {
              return this.field_Yb;
            }
            this.field_Yb = 1;
            return this.field_Yb;
          }
          if (85 == ei.field_q &&
            this.field_Wb.length() > 0) {
            dm.a(' ', 200, this.field_Wb, -1 + this.field_Wb.length());
          }
          if (fj.a(de.field_c, (CharSequence) ((Object) this.field_Wb), -99)) {
            discarded$1 = this.field_Wb.append(de.field_c);
          } else {
            if (this.field_Wb.length() == 0 &&
              91 == de.field_c) {
              discarded$2 = this.field_Wb.append(de.field_c);
            } else {
              if (this.field_Wb.length() == 1 &&
                35 == de.field_c) {
                discarded$3 = this.field_Wb.append(de.field_c);
              } else {
                if (de.field_c == 93) {
                  discarded$4 = this.field_Wb.append(de.field_c);
                }
              }
            }
          }
          if (ei.field_q != 84) {
            if (13 != ei.field_q) {
              continue;
            }
            return 1;
          }
          break;
        }
        if (this.field_Wb.length() <= 0) {
          return 1;
        }
        this.field_S = this.field_Wb.toString();
        return 2;
    }

    el(int param0, int param1, int param2, int param3, String param4, gh param5, gh param6, gh param7) {
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
        this.field_Yb = 0;
        try {
          this.field_Xb = new gh(0L, param6, param4);
          this.a(this.field_Xb, 124);
          this.field_Tb = new gh(0L, param7);
          this.field_Tb.field_nb = 16764006;
          this.a(this.field_Tb, 123);
          this.field_Tb.field_Db = "|";
          this.field_Wb = new StringBuilder(12);
          var9_int = this.field_Xb.g(-2147483648);
          this.field_Xb.a(0, 3, db.field_b, 5, var9_int);
          this.field_Tb.a(0, 3 + db.field_b, db.field_b, 5, var9_int);
          var10 = var9_int + 10;
          var11 = 3 + (2 * db.field_b + 3);
          var12 = dl.a(param2, 127, param0, var10);
          var13 = ol.a(param1, 0, param3, var11);
          this.a(0, var13, var11, var12, var10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("el.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_Sb = (byte[][]) null;
        if (!param0) {
          return;
        }
        field_Zb = null;
        field_ac = null;
        field_Vb = null;
        field_Ub = null;
    }

    static {
        field_Zb = "Passwords must be between 5 and 20 characters long";
        field_Vb = new String[]{"YES", "NO"};
        field_Sb = new byte[][]{new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte)4, (byte)3, (byte) 2, (byte) 5, (byte) 1}, new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte)5, (byte)5, (byte) 2}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)2, (byte)3, (byte) 3, (byte) 6, (byte) 1}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)3, (byte)4, (byte) 5, (byte) 5, (byte) 2}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)2, (byte)4, (byte) 4, (byte) 7, (byte) 2}, new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte)2, (byte)3, (byte) 2, (byte) 4, (byte) 3, (byte) 7, (byte) 2}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)4, (byte)3, (byte) 1, (byte) 6, (byte) 2}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)4, (byte)3, (byte) 2, (byte) 6, (byte) 2}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)3, (byte)3, (byte) 3, (byte) 8, (byte) 3}, new byte[]{(byte) 0, (byte)2, (byte)2, (byte)4, (byte)3, (byte) 2, (byte) 5, (byte) 1}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)3, (byte)4, (byte) 5, (byte) 8, (byte) 1}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)4, (byte)3, (byte) 2, (byte) 5, (byte) 1}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)5, (byte)5, (byte) 2}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte)3, (byte)6, (byte) 1}, new byte[]{(byte) 0, (byte)4, (byte) 1, (byte)2, (byte)3, (byte) 1, (byte) 6, (byte) 2}, new byte[]{(byte) 0, (byte)4, (byte) 1, (byte)2, (byte)6, (byte) 2}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)3, (byte)4, (byte) 4, (byte) 5, (byte) 3}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)2, (byte)4, (byte) 3, (byte) 7, (byte) 2}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)2, (byte)3, (byte) 3, (byte) 4, (byte) 2, (byte) 7, (byte) 3}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)2, (byte)3, (byte) 4, (byte) 6, (byte) 3}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)2, (byte)3, (byte) 3, (byte) 6, (byte) 4}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte)4, (byte)4, (byte) 3, (byte) 8, (byte) 2}, new byte[]{}, new byte[]{}, new byte[]{}, new byte[]{}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte)5, (byte)5, (byte) 3}, new byte[]{(byte) 0, (byte)4, (byte) 1, (byte)3, (byte)3, (byte) 2, (byte) 6, (byte) 3}, new byte[]{(byte) 0, (byte)4, (byte) 1, (byte)2, (byte)3, (byte) 2, (byte) 6, (byte) 3}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)3, (byte)4, (byte) 3, (byte) 5, (byte) 4}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte) 1, (byte)4, (byte) 1, (byte) 7, (byte) 3}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte)2, (byte)3, (byte) 3, (byte) 4, (byte) 0, (byte) 7, (byte) 5}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte) 0, (byte)3, (byte) 5, (byte) 6, (byte) 5, (byte) 8, (byte) 4}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte) 1, (byte)3, (byte) 4, (byte) 6, (byte) 5}, new byte[]{(byte) 0, (byte)3, (byte)2, (byte) 1, (byte)3, (byte) 3, (byte) 6, (byte) 4}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte) 1, (byte)4, (byte) 2, (byte) 8, (byte) 5}};
    }
}
