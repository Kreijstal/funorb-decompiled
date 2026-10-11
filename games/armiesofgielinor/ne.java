/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne implements uo {
    int field_h;
    private ha field_d;
    static dn field_f;
    jd field_c;
    boolean field_b;
    int field_g;
    boolean field_l;
    int field_a;
    int field_j;
    ca field_n;
    int[] field_k;
    int field_m;
    static boolean[] field_e;
    static int field_i;

    public static void g(int param0) {
        field_f = null;
        if (param0 >= -19) {
          return;
        }
        field_e = null;
    }

    final static void a(hd param0, Object param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        aa var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (null == param0.field_j) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param0.field_j.peekEvent()) {
              nu.a(1L, 0);
              continue;
            }
            break;
          }
          try {
            if (null != param1) {
              param0.field_j.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          if (!param2) {
            var5 = (aa) null;
            ne.a(-21, (aa) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ne.T(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -114) {
          return false;
        }
        stackIn_6_0 = (this.field_n != null) && (0 != (4 & this.field_n.field_c));
        return stackIn_6_0;
    }

    final boolean h(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1) {
          this.field_l = false;
        }
        stackIn_6_0 = (this.field_n != null) && ((this.field_n.field_c & 2) != 0);
        return stackIn_6_0;
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param2.equals("unit")) {
            if (param0 > 0) {
              this.field_c = a.a(param0, 32, param1);
            }
          } else {
            if (param2.equals("own")) {
              if (param0 > 0) {
                this.field_a = (int)tn.a(false, param0, param1);
              }
            } else {
              if (!param2.equals("type")) {
                if (param2.equals("mod") &&
                  param0 > 0) {
                  this.field_n = ui.a(param1, param0, 80);
                }
              } else {
                if (param0 > 0) {
                  this.field_h = (int)tn.a(false, param0, param1);
                }
              }
            }
          }
          if (param3 != 37) {
            this.field_c = (jd) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ne.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        if (null == this.field_n) {
          this.field_n = new ca();
        }
        if (!param0) {
          return;
        }
        this.field_n.field_d = param1;
    }

    final boolean k(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 12) {
          this.l(-61);
        }
        stackIn_6_0 = (this.field_n != null) && ((1 & this.field_n.field_c) != 0);
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int stackIn_10_0 = 0;
        ha stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        ha stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        ha stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        ha stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_103_2 = 0;
        ha stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_116_2 = 0;
        ha stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int stackIn_126_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var5Lifetime1;
        int var7Lifetime1;
        int var5Lifetime1Lifetime1;
        int var5Lifetime1Lifetime2;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_d.field_K != null &&
          param2 != this.field_a) {
          return;
        }
        if (this.field_c != null) {
          stackIn_10_0 = (!this.field_d.c(this.field_c.field_O, -16985, param2)) ? 1 : 0;
        } else {
          stackIn_10_0 = 0;
        }
        var6 = stackIn_10_0;
        if (param3 > ~this.field_a) {
          var7 = this.field_h;
          if (7 != var7) {
            if (var7 != 8) {
              if (var7 == 14 ||
                var7 == 9) {
                stackIn_29_0 = this.field_d;
                stackIn_29_1 = param2;
                if (var6 != 0) {
                  stackIn_30_2 = 37;
                } else {
                  stackIn_30_2 = 75;
                }
                var5 = ((ha) (Object) stackIn_29_0).d(stackIn_29_1, stackIn_30_2, 6);
                dupTemp$0 = this.field_d.o(this.field_a, -1);
                this.field_d.field_S[dupTemp$0] = this.field_d.field_S[dupTemp$0] + 75;
              }
            } else {
              stackIn_25_0 = this.field_d;
              stackIn_25_1 = param2;
              if (var6 != 0) {
                stackIn_26_2 = 12;
              } else {
                stackIn_26_2 = 25;
              }
              var5 = ((ha) (Object) stackIn_25_0).d(stackIn_25_1, stackIn_26_2, 6);
              dupTemp$1 = this.field_d.o(this.field_a, -1);
              this.field_d.field_S[dupTemp$1] = this.field_d.field_S[dupTemp$1] + 25;
            }
          } else {
            stackIn_21_0 = this.field_d;
            stackIn_21_1 = param2;
            if (var6 != 0) {
              stackIn_22_2 = 25;
            } else {
              stackIn_22_2 = 50;
            }
            var5 = ((ha) (Object) stackIn_21_0).d(stackIn_21_1, stackIn_22_2, 6);
            dupTemp$2 = this.field_d.o(this.field_a, -1);
            this.field_d.field_S[dupTemp$2] = this.field_d.field_S[dupTemp$2] + 50;
          }
        }
        if (!this.field_d.c(this.field_a, -16985, param2)) {
          return;
        }
        if (!this.field_d.field_F) {
          stackIn_39_0 = (param2 == this.field_d.field_sb) ? 1 : 0;
        } else {
          stackIn_39_0 = 1;
        }
        var7Lifetime1 = stackIn_39_0;
        if (this.field_c != null) {
          stackIn_45_0 = (this.field_d.c(this.field_c.field_O, -16985, this.field_a)) ? 1 : 0;
        } else {
          stackIn_45_0 = 0;
        }
        var8 = stackIn_45_0;
        if (this.field_c != null) {
          if (var8 != 0) {
            if (this.field_c.field_O != param2) {
              stackIn_55_0 = (null != this.field_d.field_K) ? 0 : 1;
            } else {
              stackIn_55_0 = 0;
            }
          } else {
            stackIn_55_0 = 0;
          }
        } else {
          stackIn_55_0 = 0;
        }
        var9 = stackIn_55_0;
        if (this.field_c != null) {
          if (var8 != 0) {
            stackIn_62_0 = (this.field_c.field_t <= this.field_c.field_Y) ? 0 : 1;
          } else {
            stackIn_62_0 = 0;
          }
        } else {
          stackIn_62_0 = 0;
        }
        var10 = stackIn_62_0;
        if (this.field_c != null) {
          if (var8 == 0) {
            if (this.field_a != -1) {
              stackIn_71_0 = (this.field_c.i(-21428)) ? 0 : 1;
            } else {
              stackIn_71_0 = 0;
            }
          } else {
            stackIn_71_0 = 0;
          }
        } else {
          stackIn_71_0 = 0;
        }
        var11 = stackIn_71_0;
        if (this.field_c != null) {
          if (var8 != 0) {
            if (this.field_c.field_t > this.field_c.field_Y) {
              stackIn_80_0 = (this.field_c.a(23072)) ? 0 : 1;
            } else {
              stackIn_80_0 = 0;
            }
          } else {
            stackIn_80_0 = 0;
          }
        } else {
          stackIn_80_0 = 0;
        }
        var12 = stackIn_80_0;
        var13 = this.field_h;
        if (var13 != 11) {
          if (var13 == 7) {
            if (var10 != 0) {
              this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
              if (-1 + this.field_c.field_t > this.field_c.field_Y) {
                this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
              }
              this.field_d.e(14, param1, this.field_a, param0);
            }
            if (var11 != 0) {
              this.field_d.field_l.a((byte) -119, (tc) (new nw(this.field_c, 3, false)));
            }
            if (var9 != 0) {
              this.field_d.field_l.a((byte) -119, (tc) (new as(this.field_c, param2, true)));
            }
            stackIn_102_0 = this.field_d;
            stackIn_102_1 = param2;
            if (var6 == 0) {
              stackIn_103_2 = 50;
            } else {
              stackIn_103_2 = 25;
            }
            var5Lifetime1 = ((ha) (Object) stackIn_102_0).d(stackIn_102_1, stackIn_103_2, 6);
            if (var7Lifetime1 != 0) {
              this.field_d.field_l.a((byte) -119, (tc) (new vp(0, var5Lifetime1, param2)));
              return;
            }
            this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5Lifetime1;
            if (1000000000 < this.field_d.field_H[param2]) {
              this.field_d.field_H[param2] = 1000000000;
            }
            dupTemp$3 = this.field_d.o(param2, -1);
            this.field_d.field_fb[dupTemp$3] = this.field_d.field_fb[dupTemp$3] + var5Lifetime1;
            if (this.field_d.field_fb[this.field_d.o(param2, -1)] <= 1000000000) {
              return;
            }
            this.field_d.field_fb[this.field_d.o(param2, -1)] = 1000000000;
            return;
          }
          if (var13 == 8) {
            if (var12 != 0) {
              this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
              this.field_d.e(14, param1, this.field_a, param0);
            }
            stackIn_115_0 = this.field_d;
            stackIn_115_1 = param2;
            if (var6 == 0) {
              stackIn_116_2 = 25;
            } else {
              stackIn_116_2 = 12;
            }
            var5Lifetime1Lifetime1 = ((ha) (Object) stackIn_115_0).d(stackIn_115_1, stackIn_116_2, param3 ^ 6);
            if (var7Lifetime1 != 0) {
              this.field_d.field_l.a((byte) -119, (tc) (new vp(2, var5Lifetime1Lifetime1, param2)));
              return;
            }
            this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5Lifetime1Lifetime1;
            dupTemp$4 = this.field_d.o(param2, -1);
            this.field_d.field_fb[dupTemp$4] = this.field_d.field_fb[dupTemp$4] + var5Lifetime1Lifetime1;
            if (this.field_d.field_fb[this.field_d.o(param2, -1)] <= 1000000000) {
              return;
            }
            this.field_d.field_fb[this.field_d.o(param2, param3 - 1)] = 1000000000;
            return;
          }
          if (var13 != 14 &&
            var13 != 9) {
            return;
          }
          if (var12 != 0) {
            this.field_d.field_l.a((byte) -119, (tc) (new st(this.field_c, 1)));
            this.field_d.e(param3 + 14, param1, this.field_a, param0);
          }
          stackIn_125_0 = this.field_d;
          stackIn_125_1 = param2;
          if (var6 == 0) {
            stackIn_126_2 = 75;
          } else {
            stackIn_126_2 = 37;
          }
          var5Lifetime1Lifetime2 = ((ha) (Object) stackIn_125_0).d(stackIn_125_1, stackIn_126_2, 6);
          if (var7Lifetime1 != 0) {
            this.field_d.field_l.a((byte) -119, (tc) (new vp(1, var5Lifetime1Lifetime2, param2)));
            return;
          }
          this.field_d.field_H[param2] = this.field_d.field_H[param2] + var5Lifetime1Lifetime2;
          dupTemp$5 = this.field_d.o(param2, -1);
          this.field_d.field_fb[dupTemp$5] = this.field_d.field_fb[dupTemp$5] + var5Lifetime1Lifetime2;
          if (this.field_d.field_fb[this.field_d.o(param2, -1)] <= 1000000000) {
            return;
          }
          this.field_d.field_fb[this.field_d.o(param2, -1)] = 1000000000;
        } else {
          if (var11 != 0) {
            this.field_d.field_l.a((byte) -119, (tc) (new nw(this.field_c, 3, false)));
          }
          if (var9 != 0) {
            this.field_d.field_l.a((byte) -119, (tc) (new as(this.field_c, param2, true)));
            return;
          }
        }
        return;
    }

    final int b(byte param0) {
        if (!this.c((byte) -79)) {
          return -1;
        }
        if (param0 > -19) {
          this.field_m = -105;
        }
        if (this.field_n.field_b == 255) {
          return -1;
        }
        return this.field_n.field_b;
    }

    final boolean d(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 > -12) {
          this.field_g = 34;
        }
        stackIn_7_0 = (this.field_h == 11) || (7 == this.field_h);
        return stackIn_7_0;
    }

    final String f(byte param0) {
        String var2;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = "";
        if (this.field_n != null &&
          this.field_n.field_e != null) {
          var2 = this.field_n.field_e;
        } else {
          if (jj.field_a.length > this.field_h) {
            if (null != this.field_d &&
              this.field_d.field_hb == 4) {
              var2 = dj.field_d[this.field_h];
            } else {
              var2 = jj.field_a[this.field_h];
            }
          }
        }
        if (this.e((byte) -120)) {
          var2 = var2 + " " + ce.field_P;
        }
        if (param0 < 30) {
          this.field_a = -35;
        }
        return var2;
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.field_a = -78;
        }
        return ck.a(this.field_h, -12);
    }

    private ne(int param0) {
        this();
        this.field_h = param0;
        this.field_m = this.e(10);
    }

    final void j(int param0) {
        int var2 = -2 % ((param0 - 5) / 44);
        if (this.field_h == 11) {
          this.field_g = this.field_n.field_g;
        }
    }

    final void a(int param0) {
        if (null == this.field_n) {
          this.field_n = new ca();
        }
        if (param0 < 62) {
          return;
        }
        this.field_n.field_c = this.field_n.field_c | 8;
    }

    final int e(int param0) {
        if (param0 != 10) {
          return 18;
        }
        if (this.field_h != 9 &&
          14 != this.field_h) {
          return 10;
        }
        return 15;
    }

    final void a(byte param0, ha param1) {
        String var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_d = param1;
          if (param0 != -68) {
            var4 = (String) null;
            this.a(-103, (bv) null, (String) null, (byte) 0);
          }
          if (param1 == null) {
            return;
          }
          this.field_k = new int[this.field_d.field_tb];
          if (this.field_c != null) {
            this.field_c.field_l = this.field_d;
            this.field_d.a(8288, this.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ne.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = 89 / ((20 - param0) / 41);
        stackIn_4_0 = (null != this.field_n) && (0 != (8 & this.field_n.field_c));
        return stackIn_4_0;
    }

    final boolean l(int param0) {
        if (param0 != -1) {
          this.field_c = (jd) null;
        }
        return this.field_m != this.e(10) ? true : false;
    }

    final int a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        if (this.field_k == null) {
          return 0;
        }
        var5 = 0;
        if (param0 != 97) {
          this.field_b = false;
        }
        while (this.field_k.length > var5) {
          if (param1 < 0) {
            var4 = var4 | this.field_k[var5];
          } else {
            if (param2 == var5) {
              var4 = var4 | 16 & this.field_k[var5];
            } else {
              var4 = var4 | 15 & this.field_k[var5];
            }
          }
          var5++;
        }
        return var4;
    }

    final boolean c(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -79) {
          this.field_j = -3;
        }
        stackIn_6_0 = (this.field_n != null) && (0 != (16 & this.field_n.field_c));
        return stackIn_6_0;
    }

    final void b(boolean param0, int param1) {
        if (this.field_n == null) {
          this.field_n = new ca();
        }
        if (!param0) {
          field_f = (dn) null;
        }
        this.field_n.field_b = param1;
        this.field_n.field_c = this.field_n.field_c | 16;
    }

    final void d(byte param0) {
        if (param0 < 42) {
          this.a(13, -128, -104, -117);
        }
        this.field_n.field_c = this.field_n.field_c & -2;
    }

    final void i(int param0) {
        if (this.field_n == null) {
          return;
        }
        this.field_n.field_c = this.field_n.field_c & -9;
        if (param0 != 14) {
          this.field_g = 118;
        }
    }

    final static te a(int param0, aa param1) {
        te var2 = null;
        RuntimeException var2_ref = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new te(param1, param1);
          bl.field_h.a((byte) -119, (tc) (var2));
          if (param0 > -35) {
            stackIn_2_0 = (te) null;
            return stackIn_2_0;
          }
          ig.field_n.a(param1);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ne.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 928) {
          return false;
        }
        stackIn_7_0 = (3 == this.field_h) || (this.field_h == 2);
        return stackIn_7_0;
    }

    final int a(byte param0) {
        if (param0 != -107) {
          this.field_j = -71;
        }
        if (this.field_n != null) {
          return this.field_n.field_d;
        }
        return 0;
    }

    final boolean a(int param0, byte param1) {
        if (param1 != 91) {
          this.field_l = true;
        }
        return this.field_d.c(this.field_a, param1 - 17076, param0);
    }

    final void a(int param0, int param1) {
        int var3 = -116 % ((-35 - param0) / 61);
        this.field_m = this.e(10);
        if (this.field_h != 11) {
          this.field_a = param1;
        } else {
          if (null != this.field_d.field_K) {
            this.field_b = true;
          }
          this.field_a = -1;
          this.field_h = 0;
        }
    }

    ne(int param0, ha param1) {
        this(param0);
        try {
          this.a((byte) -68, param1);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ne.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 != 19725) {
          this.d((byte) -22);
        }
        return !this.a(false) ? true : false;
    }

    ne() {
        this.field_l = false;
        this.field_b = false;
        this.field_a = -1;
        this.field_m = 10;
        this.field_c = null;
        this.field_g = -1;
        this.field_a = -1;
        this.field_d = null;
        this.field_j = 0;
        this.field_k = null;
    }

    static {
        field_i = -1;
    }
}
