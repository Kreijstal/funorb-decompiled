/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    private int field_t;
    private int field_o;
    private bd field_e;
    private bd field_h;
    private be field_u;
    private int field_b;
    private String[] field_a;
    private int field_s;
    private boolean field_j;
    private String field_n;
    static int[] field_w;
    private int field_v;
    private int field_f;
    private pg[] field_p;
    static int[] field_y;
    private bd field_i;
    static int[] field_g;
    static String field_x;
    static String field_A;
    static bd field_d;
    static fk field_q;
    static int field_z;
    static String field_k;
    static int[] field_c;
    static String field_m;
    static b field_l;
    static bd field_r;

    final int a(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = HostileSpawn.field_I ? 1 : 0;
        this.field_s = this.field_s + 65536;
        L0: while (true) {
          if (ui.a(65535, q.field_d, this.field_s) < 65536) {
            L1: {
              var3 = param0;
              if (null != this.field_p) {
                var3 = this.field_p.length;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 == (var3 ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (this.field_f >= q.field_h) {
                    break L3;
                  } else {
                    L4: {
                      this.field_f = this.field_f + 1;
                      if (this.field_f <= q.field_k) {
                        break L4;
                      } else {
                        L5: {
                          if (null == this.field_p) {
                            break L5;
                          } else {
                            if (null != this.field_p[this.field_b]) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.field_f = this.field_f - 1;
                        break L3;
                      }
                    }
                    if (this.field_f < q.field_h) {
                      break L3;
                    } else {
                      if (null == this.field_p[(1 + this.field_b) % var3]) {
                        this.field_f = this.field_f - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L6: {
                  if (q.field_h <= this.field_f) {
                    this.field_o = this.field_b;
                    this.field_f = this.field_f - q.field_h;
                    if (!this.field_j) {
                      this.field_b = this.field_b - 1;
                      if (-1 >= (this.field_b ^ -1)) {
                        break L6;
                      } else {
                        this.field_b = this.field_b + var3;
                        break L6;
                      }
                    } else {
                      this.field_b = this.field_b + 1;
                      if (this.field_b < var3) {
                        break L6;
                      } else {
                        this.field_b = this.field_b - var3;
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                if (this.field_f <= q.field_k) {
                  break L2;
                } else {
                  this.field_j = true;
                  break L2;
                }
              }
            }
            L7: {
              if (jm.field_b != null) {
                L8: {
                  var4 = 0;
                  if (-1 == (pf.field_o ^ -1)) {
                    break L8;
                  } else {
                    if (257 >= rc.field_b) {
                      break L8;
                    } else {
                      if (rc.field_b >= 290) {
                        break L8;
                      } else {
                        L9: {
                          if (ec.field_a <= 9) {
                            break L9;
                          } else {
                            if (82 <= ec.field_a) {
                              break L9;
                            } else {
                              this.field_f = q.field_h;
                              var4 = 1;
                              this.field_j = false;
                              break L9;
                            }
                          }
                        }
                        if (558 >= ec.field_a) {
                          break L8;
                        } else {
                          if (ec.field_a < 631) {
                            var4 = 1;
                            this.field_f = q.field_h;
                            this.field_j = true;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  break L7;
                } else {
                  if (q.field_k >= this.field_f) {
                    break L7;
                  } else {
                    if (-258 <= (rc.field_b ^ -1)) {
                      break L7;
                    } else {
                      if ((rc.field_b ^ -1) <= -291) {
                        break L7;
                      } else {
                        L10: {
                          if (j.field_c <= 9) {
                            break L10;
                          } else {
                            if (j.field_c < 82) {
                              this.field_f = q.field_k;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if ((j.field_c ^ -1) >= -559) {
                          break L7;
                        } else {
                          if (631 > j.field_c) {
                            this.field_f = q.field_k;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            if (param1) {
              L11: {
                this.field_u.a((byte) -127, this.a(j.field_c, rb.field_m, -1300), this.a(ec.field_a, rc.field_b, -1300));
                var4 = 0;
                if (!this.field_u.b(0)) {
                  break L11;
                } else {
                  L12: {
                    if (0 == this.field_u.field_f) {
                      var4 = 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  if ((this.field_u.field_f ^ -1) == -2) {
                    return 2;
                  } else {
                    break L11;
                  }
                }
              }
              L13: {
                if (!o.field_e) {
                  break L13;
                } else {
                  L14: while (true) {
                    if (!jn.e((byte) -100)) {
                      break L13;
                    } else {
                      var5 = this.a(true);
                      if (var5 != 0) {
                        return var5;
                      } else {
                        continue L14;
                      }
                    }
                  }
                }
              }
              if (var4 == 0) {
                return 0;
              } else {
                this.b((byte) -36);
                return 3;
              }
            } else {
              return 0;
            }
          } else {
            this.field_v = this.field_v + 1;
            this.field_s = this.field_s - q.field_d;
            continue L0;
          }
        }
    }

    private final int a(boolean param0) {
        this.field_u.c(0);
        if (this.field_u.b(0)) {
            if (0 == this.field_u.field_f) {
                this.b((byte) -36);
                return 3;
            }
            if (this.field_u.field_f == 1) {
                return 1;
            }
        }
        if ((pj.field_e ^ -1) == -14) {
            return 1;
        }
        if (!param0) {
            return -53;
        }
        return 0;
    }

    public static void b(int param0) {
        field_q = null;
        field_g = null;
        field_y = null;
        int var1 = -97 % ((68 - param0) / 55);
        field_x = null;
        field_d = null;
        field_w = null;
        field_A = null;
        field_c = null;
        field_m = null;
        field_k = null;
        field_l = null;
        field_r = null;
    }

    private final void a(int param0, int[] param1, int param2, String param3, int param4, int param5, vm param6, int param7) {
        int discarded$0 = 0;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = HostileSpawn.field_I ? 1 : 0;
        try {
            pf.b(511);
            if (param4 != 1) {
                discarded$0 = this.a(false);
            }
            for (var9_int = param2; var9_int < param5; var9_int++) {
                si.d(param0, var9_int, param7, var9_int + 1);
                var10 = var9_int * param1.length / param5;
                var11 = param1[-1 + (param1.length - var10)];
                param6.a(param3, param0, param2, param7, param5, var11, -1, 1, 1, 0);
            }
            eh.b(false);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "e.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      var3 = nj.a(param1, true, var4).getFile();
                      a.a(param1, new Object[]{"home", var3 + "home.ws"}, "updatelinks", -13730);
                      a.a(param1, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks", param0 ^ -28622);
                      a.a(param1, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks", -13730);
                      a.a(param1, new Object[]{"options", var3 + "options.ws"}, "updatelinks", -13730);
                      if (param0 == 23148) {
                        break L2;
                      } else {
                        field_z = 29;
                        break L2;
                      }
                    }
                    a.a(param1, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks", -13730);
                    a.a(param1, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks", param0 + -36878);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("e.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0) {
        pg var2;
        int var3;
        int var4;
        int var5;
        pg var6;
        pg var7;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_p != null) {
          L0: {
            var6 = this.field_p[this.field_b];
            var2 = var6;
            if (var2 != null) {
              var6.a(9, 58);
              break L0;
            } else {
              if (mn.field_e == null) {
                break L0;
              } else {
                mn.field_e.a(l.field_e, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                break L0;
              }
            }
          }
          if (param0 == 9) {
            L1: {
              if (q.field_k > this.field_f) {
                var7 = this.field_p[this.field_o];
                var2 = var7;
                if (var2 != null) {
                  var3 = this.field_f * (var7.field_i - -60) / q.field_k;
                  var4 = var3 - 30;
                  if (!this.field_j) {
                    la.a(256 * (-var4 + var7.field_i) / 30, param0 + 108, var7, 9, var4 * -256 / 30, 58);
                    break L1;
                  } else {
                    la.a(var4 * -256 / 30, 126, var2, 9, 256 * (-var4 + var7.field_i) / 30, 58);
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L2: {
            if (mn.field_e == null) {
              break L2;
            } else {
              mn.field_e.a(l.field_e, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
              break L2;
            }
          }
          return;
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (null == im.field_g) {
            return -1;
        }
        if ((param0 ^ -1) <= -509 && -636 < (param0 ^ -1) && (param1 ^ -1) <= -300 && 386 > param1) {
            return 0;
        }
        if (param2 != -1300) {
            return -46;
        }
        if ((param0 ^ -1) <= -509 && 635 > param0 && -391 >= (param1 ^ -1)) {
            if (!((param1 ^ -1) <= -476)) {
                return 1;
            }
        }
        return -1;
    }

    private final void a(int param0, int param1, int[] param2, vm param3, int param4, String param5, float param6, int param7, bd param8, int param9) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        bd var13 = null;
        try {
          L0: {
            var11_int = (int)((float)param9 / param6);
            var12 = (int)((float)param1 / param6);
            var13 = new bd(var11_int, var12);
            sb.a(var13, param4 + -120);
            param8.a((int)((float)(-param7) / param6), (int)((float)(-param0) / param6), (int)((float)param8.field_z / param6), (int)((float)param8.field_A / param6));
            this.a(param4, param2, 0, param5, 1, var12, param3, var11_int);
            eh.b(false);
            sb.a(param8, -128);
            var13.c(param7, param0, param9, param1);
            eh.b(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var11);

            stackIn_4_1 = new StringBuilder().append("e.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ',' + param9 + ')');
        }
    }

    private final void b(byte param0) {
        try {
            if (param0 != -36) {
                vm var3 = (vm) null;
                this.a(-82, (int[]) null, -17, (String) null, -50, 44, (vm) null, 100);
            }
            HostileSpawn.a(bn.c(param0 ^ 35), -53);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final void a(pg[] param0, String param1, String[] param2, java.applet.Applet param3, int param4, boolean param5) {
        String var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var7 = param3.getParameter("currency");
                if (var7 == null) {
                  break L2;
                } else {
                  if (sf.a((byte) 90, (CharSequence) ((Object) var7))) {
                    this.field_t = hi.a(87, (CharSequence) ((Object) var7));
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_t = 2;
              break L1;
            }
            L3: {
              this.field_n = param1;
              this.field_u = new be(2);
              this.field_p = param0;
              var8 = 22 % ((28 - param4) / 47);
              this.field_a = param2;
              if (this.field_p == null) {
                break L3;
              } else {
                if (-4 >= (this.field_p.length ^ -1)) {
                  o.field_e = param5;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var7_ref);

            stackIn_13_1 = new StringBuilder().append("e.I(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_23_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        this.field_s = 0;
        this.field_b = 0;
        this.field_f = q.field_k;
        this.field_v = 0;
        if (param0 > -37) {
            java.applet.Applet var4 = (java.applet.Applet) null;
            e.a(103, (java.applet.Applet) null);
        }
        this.field_u.a(param1, 0, this.a(j.field_c, rb.field_m, -1300), -1);
    }

    private final void a(int param0) {
        int var2;
        int var3;
        bd var5;
        String var6;
        String var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int[] var11;
        L0: {
          if (null != this.field_i) {
            break L0;
          } else {
            if (ra.field_e == null) {
              break L0;
            } else {
              this.field_i = new bd(622, 47);
              sb.a(this.field_i, -119);
              si.c(0, 0, 622, 47, 4540749, 65793);
              var2 = 16448250;
              var3 = 10068666;
              var11 = wg.a(true, var2, var3);
              var10 = var11;
              var9 = var10;
              this.a(0, var11, 0, this.field_n, 1, 47, ra.field_e, 622);
              eh.b(false);
              this.field_e = new bd(475, 24);
              this.a(-4, 24, var9, ra.field_e, 0, eb.field_f, 0.75f, 0, this.field_e, 475);
              var8 = wg.a(true, 526344, 526344);
              var5 = new bd(121, 122);
              sb.a(var5, -121);
              si.c(0, 0, var5.field_z, var5.field_A / 2, 16180917, 16306250);
              si.c(0, var5.field_A / 2, var5.field_z, var5.field_A, 16306250, 15568919);
              var6 = ue.field_b;
              var7 = sg.field_m;
              this.a(-16, var5.field_A, var8, ra.field_e, 0, var6, 0.5f, param0, var5, var5.field_z);
              this.a(20, var5.field_A, var8, ra.field_e, param0 + 0, var7, 0.5f, 0, var5, var5.field_z);
              this.a(var5.field_A / 2 + -ra.field_e.field_y - -12, var5.field_A / 3, var8, ra.field_e, 0, lk.field_E[this.field_t], 0.699999988079071f, 0, var5, var5.field_z);
              eh.b(false);
              this.field_h = new bd(121, 122);
              sb.a(this.field_h, -126);
              var5.b(this.field_h.field_z / 2, this.field_h.field_A / 2, -2048, 4096);
              eh.b(false);
              return;
            }
          }
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          si.c(9, 9, 622, 47, 4540749, 65793);
          if (param0 == -67) {
            break L0;
          } else {
            this.a((byte) 85);
            break L0;
          }
        }
        si.c(9, 257, 622, 33, 2585);
        si.c(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        L1: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            var3 = 299;
            L2: while (true) {
              if (-3 >= (var2 ^ -1)) {
                L3: {
                  this.c(9);
                  if (null == jk.field_c) {
                    break L3;
                  } else {
                    if (!jk.field_c.a(-15879)) {
                      break L3;
                    } else {
                      if (!jk.field_c.a(-8088, "members_expansion_screen")) {
                        break L3;
                      } else {
                        if (!jk.field_c.a(-8088, "arialish12")) {
                          break L3;
                        } else {
                          if (!jk.field_c.a(-8088, "pump32")) {
                            break L3;
                          } else {
                            if (cl.field_i == null) {
                              break L3;
                            } else {
                              if (!cl.field_i.a(-15879)) {
                                break L3;
                              } else {
                                if (!cl.field_i.a(-8088, "arialish12")) {
                                  break L3;
                                } else {
                                  if (cl.field_i.a(param0 ^ 8149, "pump32")) {
                                    im.field_g = qm.a("members_expansion_screen", param0 + 67, "frame", jk.field_c);
                                    jm.field_b = ci.a("members_expansion_screen", param0 + 181, "arrow", jk.field_c);
                                    mn.field_e = wc.a("arialish12", cl.field_i, 84, jk.field_c, "");
                                    ra.field_e = th.a(jk.field_c, 126, "", cl.field_i, "pump32");
                                    ue.field_j = fg.a("members_expansion_screen", "benefit_orbs", jk.field_c, false);
                                    od.field_D = fg.a("members_expansion_screen", "button_text", jk.field_c, false);
                                    vj.field_h = ei.a(jk.field_c, param0 ^ -49, "members_expansion_screen", "button_highlights");
                                    cl.field_i = null;
                                    jk.field_c = null;
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                this.a(param0 + 67);
                if (im.field_g != null) {
                  L4: {
                    this.field_h.e(376, 339);
                    this.field_i.e(9, 9);
                    im.field_g.a(0, 0);
                    if (null != jm.field_b) {
                      jm.field_b.e(9, 257);
                      jm.field_b.d(558, 257);
                      if (rb.field_m <= 257) {
                        break L4;
                      } else {
                        if (rb.field_m < 290) {
                          var2 = 40 + (40 * la.a(this.field_v << 1393050628, false) >> -1872940368);
                          if (-1 > (var2 ^ -1)) {
                            L5: {
                              if (j.field_c <= 9) {
                                break L5;
                              } else {
                                if (82 <= j.field_c) {
                                  break L5;
                                } else {
                                  jm.field_b.c(8, 256, var2);
                                  jm.field_b.c(10, 256, var2);
                                  jm.field_b.c(8, 258, var2);
                                  jm.field_b.c(10, 258, var2);
                                  break L4;
                                }
                              }
                            }
                            if (j.field_c <= 558) {
                              break L4;
                            } else {
                              if (j.field_c < 631) {
                                jm.field_b.g();
                                jm.field_b.c(557, 256, var2);
                                jm.field_b.c(559, 256, var2);
                                jm.field_b.c(557, 258, var2);
                                jm.field_b.c(559, 258, var2);
                                jm.field_b.g();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    this.field_e.e(16, 302);
                    mn.field_e.a(this.field_a[this.field_b], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                    ue.field_j.e(30, 330);
                    mn.field_e.a(mm.field_n[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    mn.field_e.a(mm.field_n[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    mn.field_e.a(mm.field_n[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                    od.field_D.e((127 - od.field_D.field_u) / 2 + 508, 315);
                    if (this.field_u.field_f != 0) {
                      if ((this.field_u.field_f ^ -1) == -2) {
                        vj.field_h[1].e(508, 387);
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      vj.field_h[0].e(508, 299);
                      break L6;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                si.c(508, var3, 127, 42, 1130115, 3365268);
                si.c(508, var3 - -42, 127, 42, 12410);
                var3 += 91;
                var2++;
                continue L2;
              }
            }
          } else {
            si.c(var3, 331, 117, 90, 460551, 3881787);
            var3 += 121;
            var2++;
            continue L1;
          }
        }
    }

    e(java.applet.Applet param0, String param1, pg[] param2, String[] param3) {
        this.field_j = true;
        this.field_s = 0;
        this.field_v = 0;
        try {
            this.a(param2, param1, param3, param0, -82, true);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0_int = 0;
        int[] var1 = null;
        int var2 = 0;
        field_w = nf.a(false);
        field_y = nf.a(false);
        field_g = nf.a(false);
        for (var0_int = 18; var0_int < 42; var0_int++) {
            var1 = field_w;
            var2 = var0_int;
            var1[var2 >> 2025952549] = ll.a(var1[var2 >> 2025952549], 1 << ua.a(var2, 31));
        }
        int[] var17 = field_y;
        int[] var3 = var17;
        int[] var0 = var3;
        var0[0] = ll.a(var17[0], 131072);
        int[] var18 = field_y;
        int[] var4 = var18;
        var0 = var4;
        var0[0] = ll.a(var18[0], 1073741824);
        int[] var19 = field_y;
        int[] var5 = var19;
        var0 = var5;
        var0[1] = ll.a(var19[1], 1);
        int[] var20 = field_g;
        int[] var6 = var20;
        var0 = var6;
        var0[0] = ll.a(var20[0], 262144);
        int[] var21 = field_g;
        int[] var7 = var21;
        var0 = var7;
        var0[0] = ll.a(var21[0], 2097152);
        int[] var22 = field_g;
        int[] var8 = var22;
        var0 = var8;
        var0[0] = ll.a(var22[0], 4194304);
        int[] var23 = field_g;
        int[] var9 = var23;
        var0 = var9;
        var0[0] = ll.a(var23[0], 8388608);
        int[] var24 = field_g;
        int[] var10 = var24;
        var0 = var10;
        var0[0] = ll.a(var24[0], 16777216);
        int[] var25 = field_g;
        int[] var11 = var25;
        var0 = var11;
        var0[0] = ll.a(var25[0], 33554432);
        int[] var26 = field_g;
        int[] var12 = var26;
        var0 = var12;
        var0[0] = ll.a(var26[0], 67108864);
        int[] var27 = field_g;
        int[] var13 = var27;
        var0 = var13;
        var0[0] = ll.a(var27[0], 134217728);
        int[] var28 = field_g;
        int[] var14 = var28;
        var0 = var14;
        var0[0] = ll.a(var28[0], 268435456);
        int[] var29 = field_g;
        int[] var15 = var29;
        var0 = var15;
        var0[0] = ll.a(var29[0], 536870912);
        int[] var30 = field_g;
        int[] var16 = var30;
        var0 = var16;
        var0[0] = ll.a(var30[0], -2147483648);
        field_x = "Create your own free Jagex account";
        field_A = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_z = 0;
        field_q = new fk();
        field_m = "Check the shuttle bays for a way off the station.";
        field_c = new int[]{41, 327, 41};
        field_k = "These reactor detonations are destabilising the level. I'd better not blow up any more.";
        field_l = null;
    }
}
