/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private oa[] field_b;
    static String field_e;
    private java.math.BigInteger field_a;
    private dk field_f;
    static String field_d;
    static String field_g;
    private java.math.BigInteger field_j;
    private sb field_i;
    private ub field_h;
    private jc field_c;

    public static void a(int param0) {
        if (param0 < 22) {
            field_g = (String) null;
        }
        field_g = null;
        field_e = null;
        field_d = null;
    }

    ha(dk param0, sb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, boolean param4, int param5, int param6, boolean param7, boolean param8, int param9) {
        int var10;
        int var11;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          if (param2) {
            break L0;
          } else {
            L1: {
              if (eb.field_f != df.field_e) {
                break L1;
              } else {
                if (df.field_f == f.field_b) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (ca.field_M.field_b != df.field_f) {
              break L0;
            } else {
              if (ca.field_M.field_c != df.field_e) {
                break L0;
              } else {
                if (null == wl.field_d) {
                  if (la.field_h != null) {
                    hm.a(true, true);
                    break L0;
                  } else {
                    id.b(-124);
                    break L0;
                  }
                } else {
                  hm.a(false, true);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (!param2) {
            oh.field_f = (-640 + eb.field_f) / 2;
            break L2;
          } else {
            oh.field_f = o.field_e;
            break L2;
          }
        }
        L3: {
          ca.b(param2, -116);
          if (0 < kh.field_d) {
            of.a(param0, false, param2, param8);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          jk.field_b.field_z = da.field_n.field_z;
          jk.field_b.field_lb = 1;
          if (-1 <= (hn.field_h ^ -1)) {
            break L4;
          } else {
            eb.a(false, param2, param0, param8);
            break L4;
          }
        }
        L5: {
          if (th.field_z <= 0) {
            break L5;
          } else {
            qk.a(param2, param0, (byte) 80, param8, param7);
            break L5;
          }
        }
        L6: {
          L7: {
            if (!ad.field_h) {
              break L7;
            } else {
              if (wl.field_d.field_ic >= wl.field_d.field_vc) {
                uf.field_j.field_Eb.field_V = oc.field_h;
                ij.field_m.field_Y = false;
                ak.a(16377, uf.field_j.field_Jb);
                break L6;
              } else {
                break L7;
              }
            }
          }
          uf.field_j.field_Eb.field_V = null;
          ij.field_m.field_Y = true;
          lb.a(param6, param0, uf.field_j, param1, 21547);
          break L6;
        }
        pi.a(param4, param6, param9, (byte) -106, param5, param0, param1);
        lb.a(param6, param0, wm.field_r, param1, 21547);
        var10 = 92 / ((24 - param3) / 45);
        rl.field_y = rl.field_y + 1;
    }

    final oa a(int param0, int param1, boolean param2, gl param3, gl param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        oa var9 = null;
        byte[] var13 = null;
        oa stackIn_9_0 = null;
        oa stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == this.field_c) {
              throw new RuntimeException();
            } else {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (this.field_b.length <= param1) {
                    break L1;
                  } else {
                    if (null == this.field_b[param1]) {
                      this.field_c.field_l = param0 * param1 + 6;
                      var6_int = this.field_c.d((byte) 120);
                      var7 = this.field_c.d((byte) 114);
                      var13 = new byte[64];
                      this.field_c.a(0, 64, true, var13);
                      var9 = new oa(param1, param4, param3, this.field_f, this.field_i, var6_int, var13, var7, param2);
                      this.field_b[param1] = var9;
                      stackIn_11_0 = (oa) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_9_0 = this.field_b[param1];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("ha.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 86 % ((param1 - 19) / 49);
        if (-1 == (param2 ^ -1)) {
            if (param0 == 0) {
                return 0;
            }
            if (0 <= param0) {
                return 2048;
            }
            return -2048;
        }
        if (0 > param2) {
            if (-1 == (param0 ^ -1)) {
                return 4096;
            }
            if (0 > param0) {
                return -4096 + ph.a(-param2, -param0, -1550172208);
            }
            return 4096 + -ph.a(-param2, param0, -1550172208);
        }
        if (0 == param0) {
            return 0;
        }
        if (param0 >= 0) {
            return ph.a(param2, param0, -1550172208);
        }
        return -ph.a(param2, -param0, -1550172208);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 39) {
                field_d = (String) null;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(og.a(-1, param1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        oa stackIn_13_0 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        if (null != this.field_b) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_b.length) {
              L1: {
                if (param0 <= -111) {
                  break L1;
                } else {
                  this.field_h = (ub) null;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_b.length) {
                  return;
                } else {
                  stackIn_13_0 = this.field_b[var2];
                  if (stackIn_13_0 != null) {
                    this.field_b[var2].b((byte) -28);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (this.field_b[var2] != null) {
                this.field_b[var2].c(0);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, da param1, byte param2) {
        hg var5 = null;
        int var4 = 0;
        try {
            var5 = gk.field_g;
            var5.g(param0, 8);
            var5.field_l = var5.field_l + 1;
            var4 = var5.field_l;
            var5.a(1, 84);
            var5.a(param1.field_p, 68);
            var5.c(param1.field_q, (byte) -102);
            if (param2 >= -22) {
                field_d = (String) null;
            }
            var5.a(param1.field_o, (byte) -42);
            var5.a(param1.field_l, (byte) -42);
            var5.a(param1.field_j, (byte) -42);
            var5.a(param1.field_m, (byte) -42);
            var5.b((byte) -111, var4);
            var5.b(var5.field_l + -var4, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ha.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        jc var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Virogrid.field_F ? 1 : 0;
        if (null == this.field_c) {
          L0: {
            if (null == this.field_h) {
              if (this.field_f.c((byte) 113)) {
                return false;
              } else {
                this.field_h = this.field_f.a((byte) 0, 255, true, -1150070304, 255);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_h.field_t) {
            L1: {
              var10 = new jc(this.field_h.b((byte) 39));
              var10.field_l = 5;
              var3 = var10.g(param0 + 11113);
              var10.field_l = var10.field_l + 72 * var3;
              if (param0 == 19) {
                break L1;
              } else {
                this.field_b = (oa[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var13 = new byte[var10.field_g.length + -var10.field_l];
                var11 = var13;
                var4 = var11;
                var10.a(0, var13.length, true, var13);
                if (this.field_j == null) {
                  break L3;
                } else {
                  if (this.field_a == null) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_j, this.field_a);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (-66 != (var5.length ^ -1)) {
              throw new RuntimeException();
            } else {
              var15 = ug.a(var10.field_g, var10.field_l - (var13.length - -5), 5, false);
              var7 = 0;
              L4: while (true) {
                if (64 <= var7) {
                  this.field_b = new oa[var3];
                  this.field_c = var10;
                  return true;
                } else {
                  if (var15[var7] == var5[1 + var7]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private ha(dk param0, sb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_a = param3;
            this.field_i = param1;
            this.field_f = param0;
            this.field_j = param2;
            if (!this.field_f.c((byte) 113)) {
                this.field_h = this.field_f.a((byte) 0, 255, true, -1150070304, 255);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Account created successfully!";
        field_g = "Enter multiplayer lobby";
        field_d = "Send private message to <%0>";
    }
}
