/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fn extends fw {
    static int field_M;
    private int field_O;
    private int field_L;
    static int[] field_Q;
    private int field_V;
    private long field_T;
    private int field_R;
    private long field_U;
    private boolean field_P;
    static String field_S;
    private boolean field_N;

    private final String o(int param0) {
        if (param0 >= -58) {
            return null;
        }
        int var2 = ((fn) this).field_O > ((fn) this).field_L ? ((fn) this).field_L : ((fn) this).field_O;
        int var3 = ((fn) this).field_O > ((fn) this).field_L ? ((fn) this).field_O : ((fn) this).field_L;
        return ((fn) this).field_v.substring(var2, var3);
    }

    private final int e(byte param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(0 != ((fn) this).field_O)) {
            return ((fn) this).field_O;
        }
        int var2 = -1 + ((fn) this).field_O;
        int var3 = -88 / ((param0 - 11) / 55);
        while (0 < var2) {
            // if_icmpeq L67
            var2--;
        }
        return var2;
    }

    private final void b(boolean param0) {
        this.a((byte) -53);
        if (!param0) {
            ((fn) this).field_V = 32;
        }
        this.j(1000);
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 1000) {
            return;
        }
        if (((fn) this).field_L != ((fn) this).field_O) {
            var2 = ((fn) this).field_O > ((fn) this).field_L ? ((fn) this).field_L : ((fn) this).field_O;
            var3 = ((fn) this).field_O <= ((fn) this).field_L ? ((fn) this).field_L : ((fn) this).field_O;
            ((fn) this).field_L = var2;
            ((fn) this).field_O = var2;
            ((fn) this).field_v = ((fn) this).field_v.substring(0, var2) + ((fn) this).field_v.substring(var3, ((fn) this).field_v.length());
            ((fn) this).d((byte) -123);
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        pm var5 = null;
        int var6 = 0;
        this.a(param0, param1, param2, param3);
        this.l(param0 + -32722);
        if (1 == ((fn) this).field_q) {
            if (!(!(((fn) this).field_k instanceof pm))) {
                var5 = (pm) (Object) ((fn) this).field_k;
                var6 = var5.a((kb) this, sm.field_d, 113, param2, ko.field_b, param1);
                if (var6 != -1) {
                    if (((fn) this).field_P) {
                        if (((fn) this).field_V > var6) {
                            if (var6 > ((fn) this).field_L) {
                                var6 = ((fn) this).field_V;
                            }
                        }
                    }
                    ((fn) this).field_O = var6;
                }
            }
            ((fn) this).field_U = vi.b(98);
        }
    }

    private final void n(int param0) {
        if (param0 >= -46) {
            return;
        }
        if (((fn) this).field_x instanceof fb) {
            ((fb) (Object) ((fn) this).field_x).a((fn) this, 80);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        if (param2 != -27934) {
            field_M = -84;
        }
        if (!(param1 != null)) {
            param1 = "";
        }
        ((fn) this).field_v = param1;
        int var4 = param1.length();
        if (((fn) this).field_R != -1) {
            if (!(var4 <= ((fn) this).field_R)) {
                ((fn) this).field_v = ((fn) this).field_v.substring(0, ((fn) this).field_R);
            }
        }
        ((fn) this).field_L = ((fn) this).field_v.length();
        ((fn) this).field_O = ((fn) this).field_v.length();
        if (!param0) {
            ((fn) this).d((byte) -128);
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        String var5 = null;
        js var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          var9 = "";
          if (43 != param1) {
            break L0;
          } else {
            param1 = 77;
            break L0;
          }
        }
        if (param2 == -32596) {
          L1: {
            if (param0) {
              break L1;
            } else {
              L2: {
                if (-17 != param1) {
                  break L2;
                } else {
                  param1 = 78;
                  break L2;
                }
              }
              L3: {
                if (-26 == param1) {
                  param1 = 79;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if ((param1 ^ -1) == -49) {
                  param1 = 80;
                  break L4;
                } else {
                  break L4;
                }
              }
              if ((param1 ^ -1) != -86) {
                break L1;
              } else {
                param1 = 89;
                break L1;
              }
            }
          }
          L5: {
            if (param1 == 76) {
              bn.field_a = new kk[mn.field_m[param1].length];
              bn.field_a[0] = mn.field_k[param1][0];
              break L5;
            } else {
              break L5;
            }
          }
          var4 = 1;
          L6: while (true) {
            L7: {
              if (var4 >= mn.field_m[param1].length) {
                break L7;
              } else {
                if (null != mn.field_k[param1][var4]) {
                  break L7;
                } else {
                  var5 = mn.field_m[param1][var4];
                  var6 = hs.a(var5, param2 ^ -32697, var9);
                  if (var6 != null) {
                    L8: {
                      if (th.a(var6, -17900)) {
                        nh.field_D[param1] = true;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null != var6.field_p) {
                        var7 = 0;
                        L10: while (true) {
                          if (var7 >= var6.field_O) {
                            break L9;
                          } else {
                            if (-3 == (var6.field_p[var7] ^ -1)) {
                              var6.field_q[var7] = 0;
                              var6.field_o[var7] = 0;
                              var6.field_r[var7] = 0;
                              var7++;
                              continue L10;
                            } else {
                              var7++;
                              continue L10;
                            }
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    L11: {
                      mn.field_k[param1][var4] = var6.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
                      if (param1 == 76) {
                        bn.field_a[var4] = mn.field_k[param1][var4];
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (0 == ((gd) (Object) mn.field_k[param1][var4]).field_I) {
                      mn.field_k[param1] = null;
                      var4++;
                      continue L6;
                    } else {
                      var4++;
                      continue L6;
                    }
                  } else {
                    var4++;
                    continue L6;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        ((fn) this).field_U = vi.b(-82);
        if (param3 == -12215) {
          L0: {
            if (param2 == 60) {
              break L0;
            } else {
              if (param2 == 62) {
                break L0;
              } else {
                L1: {
                  if (param2 < 32) {
                    break L1;
                  } else {
                    if (param2 <= 126) {
                      L2: {
                        if (((fn) this).field_O == ((fn) this).field_L) {
                          break L2;
                        } else {
                          this.j(1000);
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (((fn) this).field_R == -1) {
                            break L4;
                          } else {
                            if (((fn) this).field_v.length() >= ((fn) this).field_R) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (((fn) this).field_O >= ((fn) this).field_v.length()) {
                            ((fn) this).field_v = ((fn) this).field_v + param2;
                            ((fn) this).field_O = ((fn) this).field_v.length();
                            ((fn) this).field_L = ((fn) this).field_v.length();
                            break L5;
                          } else {
                            ((fn) this).field_v = ((fn) this).field_v.substring(0, ((fn) this).field_O) + param2 + ((fn) this).field_v.substring(((fn) this).field_O, ((fn) this).field_v.length());
                            ((fn) this).field_O = ((fn) this).field_O + 1;
                            ((fn) this).field_L = ((fn) this).field_O;
                            break L5;
                          }
                        }
                        ((fn) this).d((byte) -123);
                        break L3;
                      }
                      return true;
                    } else {
                      break L1;
                    }
                  }
                }
                if (85 != param1) {
                  L6: {
                    if ((param1 ^ -1) == -102) {
                      if (((fn) this).field_L == ((fn) this).field_O) {
                        if (((fn) this).field_O >= ((fn) this).field_v.length()) {
                          break L6;
                        } else {
                          ((fn) this).field_L = 1 + ((fn) this).field_O;
                          this.j(1000);
                          return true;
                        }
                      } else {
                        this.j(1000);
                        return true;
                      }
                    } else {
                      if (param1 == 13) {
                        ((fn) this).k(98);
                        return true;
                      } else {
                        if ((param1 ^ -1) != -97) {
                          if (-98 != (param1 ^ -1)) {
                            if ((param1 ^ -1) == -103) {
                              this.a(0, (byte) -59);
                              return true;
                            } else {
                              if (103 != param1) {
                                if ((param1 ^ -1) != -85) {
                                  L7: {
                                    if (!br.field_f[82]) {
                                      break L7;
                                    } else {
                                      if (param1 != 65) {
                                        break L7;
                                      } else {
                                        this.b(true);
                                        return true;
                                      }
                                    }
                                  }
                                  L8: {
                                    if (!br.field_f[82]) {
                                      break L8;
                                    } else {
                                      if ((param1 ^ -1) == -67) {
                                        this.a((byte) -53);
                                        return true;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  if (!br.field_f[82]) {
                                    break L6;
                                  } else {
                                    if (67 == param1) {
                                      this.f((byte) -104);
                                      return true;
                                    } else {
                                      break L6;
                                    }
                                  }
                                } else {
                                  this.n(-92);
                                  return true;
                                }
                              } else {
                                this.a(((fn) this).field_v.length(), (byte) -59);
                                return true;
                              }
                            }
                          } else {
                            if (((fn) this).field_O >= ((fn) this).field_v.length()) {
                              break L6;
                            } else {
                              L9: {
                                stackOut_26_0 = this;
                                stackIn_28_0 = stackOut_26_0;
                                stackIn_27_0 = stackOut_26_0;
                                if (!br.field_f[82]) {
                                  stackOut_28_0 = this;
                                  stackOut_28_1 = ((fn) this).field_O - -1;
                                  stackIn_29_0 = stackOut_28_0;
                                  stackIn_29_1 = stackOut_28_1;
                                  break L9;
                                } else {
                                  stackOut_27_0 = this;
                                  stackOut_27_1 = this.p(-97);
                                  stackIn_29_0 = stackOut_27_0;
                                  stackIn_29_1 = stackOut_27_1;
                                  break L9;
                                }
                              }
                              this.a(stackIn_29_1, (byte) -59);
                              return true;
                            }
                          }
                        } else {
                          if (((fn) this).field_O > 0) {
                            L10: {
                              stackOut_20_0 = this;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_21_0 = stackOut_20_0;
                              if (br.field_f[82]) {
                                stackOut_22_0 = this;
                                stackOut_22_1 = this.e((byte) 81);
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                break L10;
                              } else {
                                stackOut_21_0 = this;
                                stackOut_21_1 = -1 + ((fn) this).field_O;
                                stackIn_23_0 = stackOut_21_0;
                                stackIn_23_1 = stackOut_21_1;
                                break L10;
                              }
                            }
                            this.a(stackIn_23_1, (byte) -59);
                            return true;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (((fn) this).field_L != ((fn) this).field_O) {
                    this.j(1000);
                    return true;
                  } else {
                    if (0 < ((fn) this).field_O) {
                      ((fn) this).field_L = -1 + ((fn) this).field_O;
                      this.j(1000);
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
          return false;
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, wk param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var15 = ArmiesOfGielinor.field_M ? 1 : 0;
          param3.i();
          var4 = 0;
          var5 = param3.field_y / 2;
          if (param0 == 8678) {
            break L0;
          } else {
            var16 = null;
            fn.a(-106, -71, -114, (wk) null);
            break L0;
          }
        }
        L1: {
          var6 = param3.field_v / 2;
          if (var5 >= var6) {
            stackOut_4_0 = var6;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = var5;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var7 = stackIn_5_0;
        var8 = 0;
        L2: while (true) {
          if (param3.field_v <= var8) {
            return;
          } else {
            var9 = 0;
            L3: while (true) {
              if (param3.field_y <= var9) {
                var8++;
                continue L2;
              } else {
                L4: {
                  var10 = (int)Math.sqrt((double)((var9 - var5) * (var9 - var5) + (var8 + -var6) * (-var6 + var8)));
                  if (param2 <= var10) {
                    var10 = -(param1 * (-param2 + var10) / (-param2 + var7)) + param1;
                    break L4;
                  } else {
                    var10 = param1;
                    break L4;
                  }
                }
                if (0 < var10) {
                  L5: {
                    var11 = param3.field_B[var4];
                    if (var11 != 1) {
                      break L5;
                    } else {
                      var11 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    var12 = (var11 & 16711680) - -(var10 << -1232173808);
                    var13 = (var11 & 65280) - -(var10 << 501192584);
                    if (-16711681 > (var12 ^ -1)) {
                      var12 = 16711680;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var14 = (var11 & 255) - -var10;
                    if ((var13 ^ -1) >= -65281) {
                      break L7;
                    } else {
                      var13 = 65280;
                      break L7;
                    }
                  }
                  L8: {
                    if (255 < var14) {
                      var14 = 255;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  param3.field_B[var4] = oe.c(oe.c(var12, var13), var14);
                  var4++;
                  var9++;
                  continue L3;
                } else {
                  var4++;
                  var9++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    fn(String param0, qo param1, int param2) {
        super(param0, param1);
        ((fn) this).field_T = 0L;
        ((fn) this).field_P = false;
        ((fn) this).field_V = -1;
        ((fn) this).field_k = t.field_c.field_w;
        ((fn) this).field_R = param2;
        ((fn) this).a(true, param0, -27934);
        ((fn) this).field_N = true;
        ((fn) this).field_U = vi.b(-83);
    }

    final void k(int param0) {
        ((fn) this).field_O = 0;
        ((fn) this).field_L = 0;
        ((fn) this).field_v = "";
        int var2 = 26 % ((33 - param0) / 36);
        ((fn) this).d((byte) -126);
    }

    private final void l(int param0) {
        ju var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pm var9 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((fn) this).field_N) {
          if (((fn) this).field_k instanceof pm) {
            L0: {
              var9 = (pm) (Object) ((fn) this).field_k;
              var3 = var9.a(-100, (kb) this);
              if (param0 == 0) {
                break L0;
              } else {
                int discarded$1 = this.e((byte) -33);
                break L0;
              }
            }
            var4 = var3.a(false);
            var5 = var9.b(66, (kb) this);
            var6 = var9.a(true) >> -1534463071;
            if (-var6 + var5 > var4) {
              ((fn) this).field_z = 0;
              ((fn) this).field_r = 0;
              return;
            } else {
              L1: {
                var7 = ((fn) this).field_r + var3.a((byte) -66, ((fn) this).field_O);
                if (var5 + -var6 < var7) {
                  ((fn) this).field_r = ((fn) this).field_r - var7 - var6 - -var5;
                  break L1;
                } else {
                  if (var7 < var6) {
                    ((fn) this).field_r = ((fn) this).field_r + (-var7 + var6);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((((fn) this).field_r ^ -1) >= -1) {
                  if (var6 + -var5 <= ((fn) this).field_r) {
                    break L2;
                  } else {
                    ((fn) this).field_r = var6 + -var5;
                    break L2;
                  }
                } else {
                  ((fn) this).field_r = 0;
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          ((fn) this).field_r = 0;
          ((fn) this).field_z = 0;
          return;
        }
    }

    void d(byte param0) {
        if (!(!(((fn) this).field_x instanceof fb))) {
            ((fb) (Object) ((fn) this).field_x).b((fn) this, 111);
        }
        if (param0 >= -114) {
            ((fn) this).field_R = -53;
        }
    }

    private final void a(byte param0) {
        String var2 = this.o(param0 ^ 108);
        if (param0 != -53) {
            return;
        }
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.o(-74)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, byte param1) {
        ((fn) this).field_O = param0;
        if (!br.field_f[81]) {
            ((fn) this).field_L = ((fn) this).field_O;
        }
        if (param1 != -59) {
            this.n(-104);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (param3 <= 103) {
            return false;
        }
        if (this.a(param0, param1, param2, 119, param4, param5, param6)) {
            if (!(((fn) this).field_k instanceof pm)) {
                return false;
            }
            var8_int = ((pm) (Object) ((fn) this).field_k).a((kb) this, sm.field_d, 87, param2, ko.field_b, param1);
            this.a((var8_int ^ -1) == 0 ? 0 : var8_int, (byte) -59);
            var8 = vi.b(39);
            ((fn) this).field_P = -((fn) this).field_T + var8 < 250L ? true : false;
            if (((fn) this).field_P) {
                ((fn) this).field_L = this.e((byte) -85);
                ((fn) this).field_O = this.p(-89);
                if (-1 > ((fn) this).field_O) {
                    if (!(-33 != ((fn) this).field_v.charAt(((fn) this).field_O + -1))) {
                        ((fn) this).field_O = ((fn) this).field_O - 1;
                    }
                }
                ((fn) this).field_V = ((fn) this).field_O;
            }
            ((fn) this).field_T = var8;
            return true;
        }
        return false;
    }

    public static void m(int param0) {
        if (param0 != 32) {
            field_Q = null;
        }
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        pm var8 = null;
        long var6 = 0L;
        if (param2 > -82) {
            return;
        }
        if (((fn) this).field_k != null) {
            if (!(-1 != (param3 ^ -1))) {
                ((fn) this).field_k.a((kb) this, param0, -128, ((fn) this).field_I, param1);
                if (((fn) this).field_k instanceof pm) {
                    var8 = (pm) (Object) ((fn) this).field_k;
                    if (((fn) this).field_O != ((fn) this).field_L) {
                        var8.a(-21259, ((fn) this).field_O, ((fn) this).field_L, (kb) this, param1, param0);
                    }
                    var6 = vi.b(-126);
                    if (-501L < ((var6 + -((fn) this).field_U) % 1000L ^ -1L)) {
                        var8.a(param1, 1024, param0, (kb) this, ((fn) this).field_O);
                    }
                }
            }
        }
    }

    private final void f(byte param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == -104) {
                  break L0;
                } else {
                  var3 = null;
                  boolean discarded$1 = ((fn) this).a((kb) null, -59, 'x', 71);
                  break L0;
                }
              }
              var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.j(param0 + 1104);
              this.a(var2_ref, (byte) -114);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (0 != (((fn) this).field_R ^ -1)) {
            var3 = ((fn) this).field_R - ((fn) this).field_v.length();
            if (!((var3 ^ -1) > -1)) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((fn) this).field_O == ((fn) this).field_v.length()) {
            ((fn) this).field_v = ((fn) this).field_v + param0;
        } else {
            ((fn) this).field_v = ((fn) this).field_v.substring(0, ((fn) this).field_O) + param0 + ((fn) this).field_v.substring(((fn) this).field_O, ((fn) this).field_v.length());
        }
        ((fn) this).field_O = ((fn) this).field_O + param0.length();
        ((fn) this).field_L = ((fn) this).field_O;
        if (param1 > -78) {
            ((fn) this).field_L = 91;
        }
        ((fn) this).d((byte) -126);
    }

    private final int p(int param0) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 > -10) {
            return -64;
        }
        int var2 = ((fn) this).field_v.length();
        if (((fn) this).field_O == var2) {
            return ((fn) this).field_O;
        }
        for (var3 = ((fn) this).field_O - -1; var3 < var2; var3++) {
            // if_icmpeq L68
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 9;
        field_Q = new int[]{-1, -1, 4, 5, -1, -1, -1, 2, 0, 1, -1, 3, 6, 6, 8, 9};
        field_S = "Sacrifice";
    }
}
