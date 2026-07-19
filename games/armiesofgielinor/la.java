/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int field_b;
    private boolean field_h;
    static String field_e;
    private gd field_c;
    private vj field_a;
    int field_f;
    static int field_d;
    static java.applet.Applet field_g;

    private final int c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = aw.field_j[this.field_f].length;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 <= var3) {
              break L1;
            } else {
              var6 = -1;
              var5 = aw.field_j[this.field_f][var3][0] ^ -1;
              if (var4 != 0) {
                if (var5 != var6) {
                  return 111;
                } else {
                  return 0;
                }
              } else {
                if (var5 > var6) {
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  return var3;
                }
              }
            }
          }
          if (param0 != 82) {
            return 111;
          } else {
            return 0;
          }
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 >= -106) {
            la.d((byte) -100);
        }
    }

    final static void b(int param0) {
        if (param0 != -26887) {
            return;
        }
        rs.field_t = 0;
        hf.field_c = true;
    }

    final static void d(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6 = jp.field_g;
            var1 = var6;
            var2 = 0;
            var3 = var6.length;
            L1: while (true) {
              L2: {
                if (var3 <= var2) {
                  break L2;
                } else {
                  incrementValue$16 = var2;
                  var2++;
                  var6[incrementValue$16] = 0;
                  incrementValue$17 = var2;
                  var2++;
                  var6[incrementValue$17] = 0;
                  incrementValue$18 = var2;
                  var2++;
                  var6[incrementValue$18] = 0;
                  incrementValue$19 = var2;
                  var2++;
                  var6[incrementValue$19] = 0;
                  incrementValue$20 = var2;
                  var2++;
                  var6[incrementValue$20] = 0;
                  incrementValue$21 = var2;
                  var2++;
                  var6[incrementValue$21] = 0;
                  incrementValue$22 = var2;
                  var2++;
                  var6[incrementValue$22] = 0;
                  incrementValue$23 = var2;
                  var2++;
                  var6[incrementValue$23] = 0;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = 57 % ((-6 - param0) / 49);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "la.K(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        hl var3 = null;
        tg var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var3 = sm.a(param2 + 76, param1, param0);
          if (var3 == null) {
            break L0;
          } else {
            tn.field_Z.a(23899, false);
            var4 = tn.field_Z;
            var5_ref_String = wp.field_y;
            var4.field_i.a(5, var5_ref_String, (byte) -109);
            var4 = tn.field_Z;
            var5 = iu.field_t;
            var6 = ur.field_z;
            var4.field_i.a(0, var6, 0, (byte) -118, var5);
            break L0;
          }
        }
        tr.a(-115, param0, param1);
        if (param2 != -1) {
          field_g = (java.applet.Applet) null;
          return;
        } else {
          return;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        wp var3 = null;
        var2 = this.field_a.field_i >> -683580368;
        if (param0 < 68) {
          this.a(91);
          var3 = we.a(var2, true);
          io.a(var3, (byte) -34);
          return;
        } else {
          var3 = we.a(var2, true);
          io.a(var3, (byte) -34);
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        var3 = 0;
        if (this.field_b != param1) {
          L0: {
            if (-1 == param1) {
              break L0;
            } else {
              if ((param1 ^ -1) > -1) {
                break L0;
              } else {
                if ((param1 ^ -1) <= -10) {
                  break L0;
                } else {
                  var3 = 1;
                  this.field_b = param1;
                  break L0;
                }
              }
            }
          }
          if (0 == (this.field_b ^ -1)) {
            L1: {
              var3 = 1;
              this.field_b = 0;
              if (var3 == 0) {
                break L1;
              } else {
                L2: {
                  if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                    this.field_b = this.c((byte) 82);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.c(param0 ^ -126);
                break L1;
              }
            }
            if (param0 != -126) {
              this.field_f = -111;
              return;
            } else {
              return;
            }
          } else {
            if (this.field_b < 0) {
              L3: {
                var3 = 1;
                this.field_b = 0;
                if (var3 == 0) {
                  break L3;
                } else {
                  L4: {
                    if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                      this.field_b = this.c((byte) 82);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  this.c(param0 ^ -126);
                  break L3;
                }
              }
              if (param0 != -126) {
                this.field_f = -111;
                return;
              } else {
                return;
              }
            } else {
              if ((this.field_b ^ -1) <= -10) {
                L5: {
                  var3 = 1;
                  this.field_b = 0;
                  if (var3 == 0) {
                    break L5;
                  } else {
                    L6: {
                      if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                        this.field_b = this.c((byte) 82);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    this.c(param0 ^ -126);
                    break L5;
                  }
                }
                if (param0 != -126) {
                  this.field_f = -111;
                  return;
                } else {
                  return;
                }
              } else {
                L7: {
                  if (var3 == 0) {
                    break L7;
                  } else {
                    L8: {
                      if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                        this.field_b = this.c((byte) 82);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    this.c(param0 ^ -126);
                    break L7;
                  }
                }
                if (param0 == -126) {
                  return;
                } else {
                  this.field_f = -111;
                  return;
                }
              }
            }
          }
        } else {
          if (0 == (this.field_b ^ -1)) {
            L9: {
              var3 = 1;
              this.field_b = 0;
              if (var3 == 0) {
                break L9;
              } else {
                L10: {
                  if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                    this.field_b = this.c((byte) 82);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                this.c(param0 ^ -126);
                break L9;
              }
            }
            if (param0 == -126) {
              return;
            } else {
              this.field_f = -111;
              return;
            }
          } else {
            if (this.field_b < 0) {
              L11: {
                var3 = 1;
                this.field_b = 0;
                if (var3 == 0) {
                  break L11;
                } else {
                  L12: {
                    if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                      this.field_b = this.c((byte) 82);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  this.c(param0 ^ -126);
                  break L11;
                }
              }
              if (param0 == -126) {
                return;
              } else {
                this.field_f = -111;
                return;
              }
            } else {
              if ((this.field_b ^ -1) <= -10) {
                L13: {
                  var3 = 1;
                  this.field_b = 0;
                  if (var3 == 0) {
                    break L13;
                  } else {
                    L14: {
                      if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                        this.field_b = this.c((byte) 82);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    this.c(param0 ^ -126);
                    break L13;
                  }
                }
                if (param0 == -126) {
                  return;
                } else {
                  this.field_f = -111;
                  return;
                }
              } else {
                L15: {
                  if (var3 == 0) {
                    break L15;
                  } else {
                    L16: {
                      if ((aw.field_j[this.field_f][this.field_b][0] ^ -1) > -1) {
                        this.field_b = this.c((byte) 82);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    this.c(param0 ^ -126);
                    break L15;
                  }
                }
                if (param0 == -126) {
                  return;
                } else {
                  this.field_f = -111;
                  return;
                }
              }
            }
          }
        }
    }

    final static void b(byte param0, int param1) {
        if (param0 != 30) {
          la.b(104);
          lk.field_h = 0;
          am.field_D = new int[3];
          an.field_F = new mo[param1 * 15];
          vj.field_g = param1;
          return;
        } else {
          lk.field_h = 0;
          am.field_D = new int[3];
          an.field_F = new mo[param1 * 15];
          vj.field_g = param1;
          return;
        }
    }

    final void a(byte param0) {
        int var3 = -30 / ((-31 - param0) / 54);
        int var2 = 0;
        this.a((byte) -126, var2);
        boolean discarded$0 = this.field_a.a(-122);
        this.a(73);
    }

    la(int param0) {
        this.field_a = new vj(1);
        this.field_f = param0;
        if (-44 == (param0 ^ -1)) {
            param0 = 77;
        }
        this.field_c = (gd) ((Object) mn.field_k[param0][0]);
        this.field_h = nh.field_D[param0];
        this.field_b = 0;
        this.c(0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param1 = param1 | param1 << 185101192;
              if (!param5) {
                break L1;
              } else {
                field_g = (java.applet.Applet) null;
                break L1;
              }
            }
            var6_int = param1 ^ param1 >> 2049244769;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                break L0;
              } else {
                var8 = bm.field_y[var9][1] + (param0 - -(3 & param1) + -64);
                var7 = -44 + bm.field_y[var9][0] + (param3 + (7 & var6_int));
                if (var10 == 0) {
                  L3: {
                    L4: {
                      if (var9 != 0) {
                        break L4;
                      } else {
                        nr.field_c[16 + param1 % 9].b(var7, var8 + -bm.field_y[var9][1], param4, param2);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    nr.field_c[param1 % 9 - -25].b(var7, var8, param4, param2);
                    break L3;
                  }
                  param1 = param1 >> 1;
                  var6_int = var6_int >> 1;
                  var9++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "la.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void c(int param0) {
        if (-1 >= (this.field_b ^ -1)) {
          if (this.field_b < 9) {
            this.field_a.a(-1, ck.field_e[sf.field_P[this.field_f]][aw.field_j[this.field_f][this.field_b][0]]);
            if (!ArmiesOfGielinor.field_M) {
              if (param0 != 0) {
                this.a((byte) 11, -94);
                this.a(81);
                return;
              } else {
                this.a(81);
                return;
              }
            } else {
              this.field_a.a(param0 ^ -1, ck.field_e[sf.field_P[this.field_f]][0]);
              if (param0 != 0) {
                this.a((byte) 11, -94);
                this.a(81);
                return;
              } else {
                this.a(81);
                return;
              }
            }
          } else {
            this.field_a.a(param0 ^ -1, ck.field_e[sf.field_P[this.field_f]][0]);
            if (param0 != 0) {
              this.a((byte) 11, -94);
              this.a(81);
              return;
            } else {
              this.a(81);
              return;
            }
          }
        } else {
          this.field_a.a(param0 ^ -1, ck.field_e[sf.field_P[this.field_f]][0]);
          if (param0 != 0) {
            this.a((byte) 11, -94);
            this.a(81);
            return;
          } else {
            this.a(81);
            return;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        gd var15 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var15 = (gd) ((Object) this.field_a.a(false, true, false, this.field_c));
          if (75 == this.field_f) {
            var15.b(250, 250, 250);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((this.field_f ^ -1) == -77) {
            var15.b(512, 512, 512);
            break L1;
          } else {
            break L1;
          }
        }
        var8 = 0;
        var9 = 2044 & param3 << -1502587230;
        if (param4 > 66) {
          L2: {
            var10 = 0;
            tm.c(param2, param1);
            var11 = 20;
            var12 = 0;
            var13 = 500;
            stackOut_14_0 = 250;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!this.field_h) {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L2;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = 100 * param0 / 128;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L2;
            }
          }
          var14 = stackIn_17_0 - stackIn_17_1;
          var14 = var14 + wv.field_g[this.field_f];
          var15.b(param0, param0, param0);
          if (!param5) {
            var15.a(var8, var9, var10, var11, var12, var14, var13);
            return;
          } else {
            fh.a(124, var15);
            var15.a(var8, var9, var10, var11, var12, var14, var13);
            return;
          }
        } else {
          L3: {
            this.field_f = 63;
            var10 = 0;
            tm.c(param2, param1);
            var11 = 20;
            var12 = 0;
            var13 = 500;
            stackOut_7_0 = 250;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (!this.field_h) {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L3;
            } else {
              stackOut_8_0 = stackIn_8_0;
              stackOut_8_1 = 100 * param0 / 128;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L3;
            }
          }
          var14 = stackIn_10_0 - stackIn_10_1;
          var14 = var14 + wv.field_g[this.field_f];
          var15.b(param0, param0, param0);
          if (!param5) {
            var15.a(var8, var9, var10, var11, var12, var14, var13);
            return;
          } else {
            fh.a(124, var15);
            var15.a(var8, var9, var10, var11, var12, var14, var13);
            return;
          }
        }
    }

    static {
        field_e = "Enter multiplayer lobby";
    }
}
