/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends ci {
    private ci field_Fb;
    private StringBuilder field_Jb;
    private int field_Gb;
    static String field_Eb;
    static int field_Hb;
    private ci field_Ib;

    public static void l(int param0) {
        if (param0 != -4403) {
          return;
        }
        field_Eb = null;
    }

    final int a(int param0, boolean param1) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4;
        var4 = Chess.field_G;
        this.a(param1, (byte) 88);
        if (param0 != 3) {
          return -12;
        }
        if (!param1) {
          this.field_Fb.field_db = this.field_Jb.toString();
          if (!param1) {
            return this.field_Gb;
          }
          if (th.field_d != 0) {
            if (this.field_L != 0) {
              return this.field_Gb;
            }
            this.field_Gb = 1;
          }
          return this.field_Gb;
        }
        while (true) {
          if (!kf.d(18954)) {
            this.field_Fb.field_db = this.field_Jb.toString();
            if (!param1) {
              return this.field_Gb;
            }
            if (th.field_d == 0) {
              return this.field_Gb;
            }
            if (this.field_L != 0) {
              return this.field_Gb;
            }
            this.field_Gb = 1;
            return this.field_Gb;
          }
          if (85 == vg.field_a &&
            this.field_Jb.length() > 0) {
            rb.a(' ', this.field_Jb, this.field_Jb.length() - 1, (byte) -105);
          }
          if (p.a((CharSequence) ((Object) this.field_Jb), d.field_Ib, -13)) {
            discarded$1 = this.field_Jb.append(d.field_Ib);
          } else {
            if (0 == this.field_Jb.length() &&
              d.field_Ib == 91) {
              discarded$2 = this.field_Jb.append(d.field_Ib);
            } else {
              if (this.field_Jb.length() == 1 &&
                35 == d.field_Ib) {
                discarded$3 = this.field_Jb.append(d.field_Ib);
              } else {
                if (93 == d.field_Ib) {
                  discarded$4 = this.field_Jb.append(d.field_Ib);
                }
              }
            }
          }
          if (vg.field_a != 84) {
            if (vg.field_a != 13) {
              continue;
            }
            return 1;
          }
          break;
        }
        if (this.field_Jb.length() <= 0) {
          return 1;
        }
        this.field_db = this.field_Jb.toString();
        return 2;
    }

    final boolean k(int param0) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var2;
        int var2Lifetime1;
        if (~this.field_Gb != param0) {
          return false;
        }
        if (85 != vg.field_a) {
          if (12 <= this.field_Jb.length()) {
            if (84 != vg.field_a) {
              if (13 != vg.field_a) {
                return true;
              }
              this.field_Gb = 1;
              return true;
            }
            if (0 >= this.field_Jb.length()) {
              this.field_Gb = 1;
            } else {
              this.field_db = this.field_Jb.toString();
              this.field_Gb = 2;
            }
            if (13 == vg.field_a) {
              this.field_Gb = 1;
            }
            return true;
          }
          var2 = Character.toLowerCase(d.field_Ib);
          if (var2 == 32) {
            var2 = 95;
          }
          if (var2 == 95 &&
            this.field_Jb.length() > 0) {
            discarded$5 = this.field_Jb.append((char) var2);
          }
          if (b.a((char) var2, (byte) 104)) {
            discarded$7 = this.field_Jb.append((char) var2);
            if (84 == vg.field_a) {
              if (0 >= this.field_Jb.length()) {
                this.field_Gb = 1;
              } else {
                this.field_db = this.field_Jb.toString();
                this.field_Gb = 2;
              }
            }
            if (13 == vg.field_a) {
              this.field_Gb = 1;
            }
            return true;
          }
          if (!di.a(param0 ^ 48, (char) var2)) {
            if (84 == vg.field_a) {
              if (0 >= this.field_Jb.length()) {
                this.field_Gb = 1;
              } else {
                this.field_db = this.field_Jb.toString();
                this.field_Gb = 2;
              }
            }
            if (13 != vg.field_a) {
              return true;
            }
            this.field_Gb = 1;
            return true;
          }
          discarded$6 = this.field_Jb.append((char) var2);
          if (84 == vg.field_a) {
            if (0 >= this.field_Jb.length()) {
              this.field_Gb = 1;
            } else {
              this.field_db = this.field_Jb.toString();
              this.field_Gb = 2;
            }
          }
          if (13 == vg.field_a) {
            this.field_Gb = 1;
          }
          return true;
        }
        if (this.field_Jb.length() > 0) {
          rb.a(' ', this.field_Jb, this.field_Jb.length() - 1, (byte) 116);
        }
        if (12 <= this.field_Jb.length()) {
          if (84 == vg.field_a) {
            if (0 >= this.field_Jb.length()) {
              this.field_Gb = 1;
            } else {
              this.field_db = this.field_Jb.toString();
              this.field_Gb = 2;
            }
          }
          if (13 != vg.field_a) {
            return true;
          }
          this.field_Gb = 1;
          return true;
        }
        var2Lifetime1 = Character.toLowerCase(d.field_Ib);
        if (var2Lifetime1 == 32) {
          var2Lifetime1 = 95;
        }
        if (var2Lifetime1 != 95) {
          if (b.a((char) var2Lifetime1, (byte) 104)) {
            discarded$3 = this.field_Jb.append((char) var2Lifetime1);
            if (84 != vg.field_a) {
              if (13 == vg.field_a) {
                this.field_Gb = 1;
              }
              return true;
            }
            if (0 >= this.field_Jb.length()) {
              this.field_Gb = 1;
            } else {
              this.field_db = this.field_Jb.toString();
              this.field_Gb = 2;
            }
            if (13 != vg.field_a) {
              return true;
            }
            this.field_Gb = 1;
            return true;
          }
          if (!di.a(param0 ^ 48, (char) var2Lifetime1)) {
            if (84 == vg.field_a) {
              if (0 >= this.field_Jb.length()) {
                this.field_Gb = 1;
              } else {
                this.field_db = this.field_Jb.toString();
                this.field_Gb = 2;
              }
            }
            if (13 == vg.field_a) {
              this.field_Gb = 1;
            }
            return true;
          }
          discarded$4 = this.field_Jb.append((char) var2Lifetime1);
          if (84 == vg.field_a) {
            if (0 >= this.field_Jb.length()) {
              this.field_Gb = 1;
            } else {
              this.field_db = this.field_Jb.toString();
              this.field_Gb = 2;
            }
          }
          if (13 == vg.field_a) {
            this.field_Gb = 1;
          }
          return true;
        }
        if (this.field_Jb.length() > 0) {
          discarded$0 = this.field_Jb.append((char) var2Lifetime1);
        }
        if (b.a((char) var2Lifetime1, (byte) 104)) {
          discarded$1 = this.field_Jb.append((char) var2Lifetime1);
          if (84 == vg.field_a) {
            if (0 >= this.field_Jb.length()) {
              this.field_Gb = 1;
            } else {
              this.field_db = this.field_Jb.toString();
              this.field_Gb = 2;
            }
          }
          if (13 != vg.field_a) {
            return true;
          }
          this.field_Gb = 1;
          return true;
        }
        if (!di.a(param0 ^ 48, (char) var2Lifetime1)) {
          if (84 == vg.field_a) {
            if (0 >= this.field_Jb.length()) {
              this.field_Gb = 1;
            } else {
              this.field_db = this.field_Jb.toString();
              this.field_Gb = 2;
            }
          }
          if (13 == vg.field_a) {
            this.field_Gb = 1;
          }
          return true;
        }
        discarded$2 = this.field_Jb.append((char) var2Lifetime1);
        if (84 == vg.field_a) {
          if (0 >= this.field_Jb.length()) {
            this.field_Gb = 1;
          } else {
            this.field_db = this.field_Jb.toString();
            this.field_Gb = 2;
          }
        }
        if (13 != vg.field_a) {
          return true;
        }
        this.field_Gb = 1;
        return true;
    }

    final static void a(byte param0, sn param1) {
        try {
          cg.field_c = param1;
          if (param0 != -90) {
            sn var3 = (sn) null;
            kd.a((byte) 123, (sn) null);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "kd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    kd(int param0, int param1, int param2, int param3, String param4, ci param5, ci param6, ci param7) {
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
        this.field_Gb = 0;
        try {
          this.field_Ib = new ci(0L, param6, param4);
          this.a((byte) 125, this.field_Ib);
          this.field_Fb = new ci(0L, param7);
          this.field_Fb.field_ib = 16764006;
          this.a((byte) 126, this.field_Fb);
          this.field_Fb.field_S = "|";
          this.field_Jb = new StringBuilder(12);
          var9_int = this.field_Ib.e((byte) 94);
          this.field_Ib.a(5, var9_int, -2147483648, fe.field_g, 3);
          this.field_Fb.a(5, var9_int, -2147483648, fe.field_g, 3 + fe.field_g);
          var10 = 5 + var9_int + 5;
          var11 = 3 + fe.field_g * 2 + 3;
          var12 = ao.a(var10, true, param0, param2);
          var13 = sg.a(param1, var11, param3, 0);
          this.a(var12, var10, -2147483648, var11, var13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("kd.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Eb = "If you are not, please change your password to something more obscure!";
    }
}
