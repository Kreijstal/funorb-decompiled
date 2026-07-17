/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fk extends kl {
    private cn field_m;
    private cn field_u;
    private cn field_n;
    private pp field_p;
    private int field_t;
    static tb field_v;
    static String field_s;
    private int field_q;
    private pp field_o;
    static String field_r;
    private String field_w;

    final void a(lb param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        hb var4 = null;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 == 83) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= 8) {
                  ((fk) this).b((byte) 37);
                  break L0;
                } else {
                  L2: {
                    L3: {
                      var4 = gm.field_d.field_a[var3_int];
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (255 == var4.field_p) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (null != qd.field_c) {
                      if (!qd.field_c[var3_int]) {
                        break L2;
                      } else {
                        qd.field_c[var3_int] = false;
                        sd.field_J = sd.field_J - 1;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (var4 != null) {
                      if (var4.field_p != 255) {
                        var4.field_b = new wd(var4.field_n.field_e);
                        break L4;
                      } else {
                        var4.field_b = new wd(k.field_c);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) runtimeException;
            stackOut_20_1 = new StringBuilder().append("fk.P(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (param0 > -104) {
            ((fk) this).field_u = null;
        }
        for (var2 = 0; var2 < 2; var2++) {
            for (var3 = 0; var3 < 4; var3++) {
                var4 = 199 + 83 * var3;
                var5 = 57 + var2 * 86;
                gf.b(var4, var5, 72, 72, 65793);
                rp.a(4, 64, (byte) 108, 4 + var4, 64, kc.field_V, var5 - -4);
            }
        }
        for (var2 = 0; 4 > var2; var2++) {
            var3 = var2 * 130 + 37;
            var4 = 227;
            gf.b(var3, var4, 96, 96, 65793);
            rp.a(4, 88, (byte) 108, 4 + var3, 88, kc.field_S, var4 + 4);
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_v = null;
        field_r = null;
    }

    final static void a(byte param0, wh param1) {
        if (param1 == null) {
            lo.a(param0 ^ 13, true, (vh) null, 64, 0);
            return;
        }
        try {
            if (param0 != 121) {
                field_s = null;
            }
            lo.a(85, true, param1.field_b, 64, param1.field_f);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "fk.R(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var7 = DungeonAssault.field_K;
        var2 = 20;
        var3 = 1;
        var4 = -hf.field_Ab.field_v + var2;
        L0: while (true) {
          if (-hf.field_Ab.field_v >= var4) {
            L1: {
              gf.e(0, 0, 640, am.field_a.field_G + var2 - 12);
              am.field_a.h(-(am.field_a.field_E / 2) + 320, var2);
              gf.b();
              lf.field_n.c(321 + -(lf.field_n.field_E / 2), 60 + var2);
              lf.field_x.h(320 - lf.field_x.field_E / 2, am.field_a.field_G + (var2 - 28));
              var4 = -51 / ((41 - param0) / 63);
              gf.b(37 + ((fk) this).field_k, 57 + ((fk) this).field_j, 155, 158, 65793, 64);
              super.b(-64);
              this.e(-64);
              var5 = null;
              if (-1 == ((fk) this).field_q) {
                break L1;
              } else {
                var5 = (Object) (Object) gm.field_d.field_a[((fk) this).field_q];
                break L1;
              }
            }
            L2: {
              qe.a(50 + ((fk) this).field_k, ((fk) this).field_j - -136, (hb) var5, 0);
              if (var5 == null) {
                break L2;
              } else {
                int discarded$1 = db.field_v.a(((hb) var5).field_n.field_F.toUpperCase(), 45 + ((fk) this).field_k, ((fk) this).field_j + 62, 139, 58, 16777215, -1, 1, 1, db.field_v.field_H);
                break L2;
              }
            }
            return;
          } else {
            L3: {
              var5_int = 70;
              var6 = 545;
              if (var3 == 0) {
                hf.field_Ab.g(var5_int, var4);
                hf.field_Ab.g(var6, var4);
                break L3;
              } else {
                hf.field_Ab.h(var5_int, var4);
                hf.field_Ab.h(var6, var4);
                break L3;
              }
            }
            L4: {
              if (var3 != 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L4;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L4;
              }
            }
            var3 = stackIn_8_0;
            var4 = var4 - hf.field_Ab.field_v;
            continue L0;
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        hb[] var2_ref_hb__ = null;
        hb var3 = null;
        int var3_int = 0;
        hb var4 = null;
        int var5 = 0;
        hb[] var6 = null;
        String stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        pp stackIn_33_0 = null;
        pp stackIn_34_0 = null;
        pp stackIn_35_0 = null;
        pp stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        pp stackOut_32_0 = null;
        pp stackOut_33_0 = null;
        pp stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        pp stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        String stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        String stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        L0: {
          var5 = DungeonAssault.field_K;
          ((fk) this).field_q = -1;
          super.a(param0);
          ((fk) this).field_q = this.b(hj.field_S, 27403, eh.field_h);
          if ((Object) (Object) hh.field_s == (Object) (Object) ((fk) this).field_p) {
            this.a(true, (byte) 22);
            break L0;
          } else {
            if ((Object) (Object) hh.field_s != (Object) (Object) ((fk) this).field_o) {
              if (no.field_d != 0) {
                L1: {
                  var2 = this.b(lc.field_c, 27403, hm.field_k);
                  if (-1 != var2) {
                    var3 = gm.field_d.field_a[var2];
                    if (var3 == null) {
                      break L1;
                    } else {
                      if (255 == var3.field_p) {
                        break L1;
                      } else {
                        if (!qd.field_c[var2]) {
                          if (sd.field_J < 4) {
                            sd.field_J = sd.field_J + 1;
                            qd.field_c[var2] = true;
                            if (var3.field_b.field_n == var3.field_b.field_i) {
                              var3.field_b.a(62, var3.field_n.field_u);
                              if (var3.field_n.field_p != null) {
                                o discarded$2 = gd.a(64, var3.field_n.field_p);
                                break L1;
                              } else {
                                break L1;
                              }
                            } else {
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          sd.field_J = sd.field_J - 1;
                          qd.field_c[var2] = false;
                          var3.field_b.a(107, var3.field_n.field_v);
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    stackOut_32_0 = ((fk) this).field_o;
                    stackIn_35_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (sd.field_J <= 0) {
                      break L3;
                    } else {
                      stackOut_33_0 = (pp) (Object) stackIn_33_0;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (4 < sd.field_J) {
                        break L3;
                      } else {
                        stackOut_34_0 = (pp) (Object) stackIn_34_0;
                        stackOut_34_1 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        break L2;
                      }
                    }
                  }
                  stackOut_35_0 = (pp) (Object) stackIn_35_0;
                  stackOut_35_1 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  break L2;
                }
                stackIn_36_0.field_w = stackIn_36_1 != 0;
                break L0;
              } else {
                break L0;
              }
            } else {
              if (0 >= sd.field_J) {
                break L0;
              } else {
                if (sd.field_J > 4) {
                  break L0;
                } else {
                  var6 = gm.field_d.field_a;
                  var2_ref_hb__ = var6;
                  var3_int = 0;
                  L4: while (true) {
                    if (var6.length <= var3_int) {
                      L5: {
                        stackOut_13_0 = ((fk) this).field_w;
                        stackOut_13_1 = ((fk) this).field_t;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0) {
                          stackOut_15_0 = (String) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          break L5;
                        } else {
                          stackOut_14_0 = (String) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          break L5;
                        }
                      }
                      mc.a(stackIn_16_0, stackIn_16_1, stackIn_16_2 != 0, qd.field_c);
                      break L0;
                    } else {
                      var4 = var6[var3_int];
                      if (var4 != null) {
                        if (qd.field_c[var4.field_j]) {
                          var4.field_b.a(62, var4.field_n.field_t);
                          if (var4.field_n.field_p != null) {
                            o discarded$3 = gd.a(64, var4.field_n.field_p);
                            var3_int++;
                            continue L4;
                          } else {
                            var3_int++;
                            continue L4;
                          }
                        } else {
                          var3_int++;
                          continue L4;
                        }
                      } else {
                        var3_int++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
            return;
        }
        if (mm.field_t == 13) {
            this.a(false, (byte) 22);
        } else {
            super.b(param0);
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var9 = DungeonAssault.field_K;
          var4 = 0;
          var5 = 0;
          if (param1 == 27403) {
            break L0;
          } else {
            this.d((byte) -91);
            break L0;
          }
        }
        L1: while (true) {
          if (var5 >= 2) {
            var5 = ((fk) this).field_k + 37;
            var6 = 227 + ((fk) this).field_j;
            var10 = 0;
            var7 = var10;
            L2: while (true) {
              if (var10 >= 8) {
                return -1;
              } else {
                L3: {
                  if (!qd.field_c[var10]) {
                    break L3;
                  } else {
                    L4: {
                      if (~param0 > ~var5) {
                        break L4;
                      } else {
                        if (~param2 > ~var6) {
                          break L4;
                        } else {
                          if (96 + var5 <= param0) {
                            break L4;
                          } else {
                            if (~param2 > ~(var6 + 96)) {
                              return var10;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var5 += 130;
                    break L3;
                  }
                }
                var10++;
                continue L2;
              }
            }
          } else {
            var6 = 0;
            L5: while (true) {
              L6: {
                if (var6 >= 4) {
                  break L6;
                } else {
                  L7: {
                    var7 = 199 + ((fk) this).field_k + 83 * var6;
                    var8 = 86 * var5 + (57 + ((fk) this).field_j);
                    if (var7 > param0) {
                      break L7;
                    } else {
                      if (var8 > param2) {
                        break L7;
                      } else {
                        if (~(var7 + 72) >= ~param0) {
                          break L7;
                        } else {
                          if (~param2 <= ~(72 + var8)) {
                            break L7;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  if (var4 == 7) {
                    break L6;
                  } else {
                    var6++;
                    var4++;
                    continue L5;
                  }
                }
              }
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 == 84) {
                        break L2;
                      } else {
                        field_s = null;
                        break L2;
                      }
                    }
                    L3: {
                      var2 = param1.getDocumentBase().getFile();
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (var3 >= 0) {
                        var4 = var4 + var2.substring(var3);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5 = new java.net.URL(param1.getCodeBase(), var4);
                    param1.getAppletContext().showDocument(j.a((byte) 94, var5, param1), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var2_ref2;
                stackOut_9_1 = new StringBuilder().append("fk.O(").append(param0).append(44);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var8 = DungeonAssault.field_K;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= 2) {
            var3 = ((fk) this).field_k - -37;
            var4 = 227 + ((fk) this).field_j;
            var9 = 0;
            var5 = var9;
            L1: while (true) {
              if (var9 >= 8) {
                return;
              } else {
                if (qd.field_c[var9]) {
                  if (null != gm.field_d.field_a[var9]) {
                    gm.field_d.field_a[var9].field_b.a(84, 6 + var4, (byte) 102, 6 + var3, 84);
                    qe.a(var3 + 92, var4 + 92, 3, gm.field_d.field_a[var9], 0);
                    var3 += 130;
                    var9++;
                    continue L1;
                  } else {
                    var9++;
                    continue L1;
                  }
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 4) {
                var3++;
                continue L0;
              } else {
                var5 = 83 * var4 + ((fk) this).field_k - -199;
                var6 = 86 * var3 + (((fk) this).field_j - -57);
                if (gm.field_d.field_a[var2] != null) {
                  L3: {
                    gm.field_d.field_a[var2].field_b.a(60, var6 + 6, (byte) 102, var5 - -6, 60);
                    qe.a(72 + (var5 + -4), -4 + (var6 + 72), 3, gm.field_d.field_a[var2], 0);
                    var7 = (int)(64.0 * (te.c(mo.field_a, 10273 * var2, 0.015625) + 2.0));
                    if (var7 >= 0) {
                      break L3;
                    } else {
                      var7 = 0;
                      break L3;
                    }
                  }
                  L4: {
                    if (qd.field_c[var2]) {
                      ((fk) this).field_u.b(var5, var6, var7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (((fk) this).field_q == var2) {
                    ((fk) this).field_m.b(var5, var6, 64);
                    ((fk) this).field_n.b(var5, var6, var7);
                    var4++;
                    var2++;
                    continue L2;
                  } else {
                    var4++;
                    var2++;
                    continue L2;
                  }
                } else {
                  var4++;
                  var2++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        hb[] var3 = null;
        int var4 = 0;
        hb var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        super.c((byte) 44);
        var2 = -25 % ((-34 - param0) / 57);
        var3 = gm.field_d.field_a;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_b.a((byte) 109, 20);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(boolean param0, byte param1) {
        if (param1 != 22) {
            ((fk) this).b(true);
        }
        ((fk) this).field_d = true;
    }

    final void b(byte param0) {
        int var3_int = 0;
        int var5 = DungeonAssault.field_K;
        int[] var6 = new int[64];
        int[] var2 = var6;
        for (var3_int = 0; var3_int < 64; var3_int++) {
            var6[var3_int] = mp.a(-2147483648, (var3_int + 24) * 65793);
        }
        cn var3 = new cn(((fk) this).field_a, ((fk) this).field_i);
        cn var4 = new cn(((fk) this).field_a, ((fk) this).field_i);
        ((fk) this).field_l = new ph(var3, var4);
        jh.a(((fk) this).field_l);
        if (param0 != 37) {
            return;
        }
        da.a(pi.field_i, cm.field_M, ((fk) this).field_a >> 1, 1917623617, (ne.field_c.field_H + 36 >> 1) + 7, (se) (Object) ne.field_c);
        this.d((byte) -123);
        gf.b(44, 64, 141, 53, 65793);
        rp.a(4, 133, (byte) 108, 48, 45, kc.field_S, 68);
        jh.b();
    }

    fk(String param0, int param1) {
        super(40, 40, 560, 380);
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((fk) this).field_t = param1;
            ((fk) this).field_w = param0;
            ((fk) this).field_p = tn.a(140, -20 + (-jm.field_i.field_v + ((fk) this).field_j) - -((fk) this).field_i, (se) (Object) ne.field_c, jm.field_i, -112, be.field_r.toUpperCase());
            ((fk) this).field_o = tn.a(-jm.field_i.field_y + 500, -jm.field_i.field_v + ((fk) this).field_j + (((fk) this).field_i - 20), (se) (Object) ne.field_c, jm.field_i, -73, lk.field_P);
            ((fk) this).field_f.a((ne) (Object) ((fk) this).field_p, false);
            ((fk) this).field_f.a((ne) (Object) ((fk) this).field_o, false);
            ((fk) this).a((lb) null, 83);
            ((fk) this).field_m = mf.a(10449103, 72, 6, 72, (byte) -102);
            ((fk) this).field_n = mf.a(255, 72, 12, 72, (byte) 71);
            ((fk) this).field_u = mf.a(16711680, 72, 12, 72, (byte) -83);
            qd.field_c = new boolean[8];
            ((fk) this).field_o.field_w = false;
            sd.field_J = 0;
            rh discarded$2 = new rh(58, 394, 80, 160, 16711680, 768, 249);
            rh discarded$3 = new rh(580, 394, 80, 160, 16711680, 768, 249);
            qh.a(-13716, (rj) (Object) ((fk) this).field_o, 24);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("fk.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static cn a(byte param0, cn param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        cn var12 = null;
        cn var13 = null;
        Object stackIn_3_0 = null;
        cn stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 == 36) {
              var12 = param1.d();
              var13 = var12;
              var5 = param3 & 16711935;
              var6 = 65280 & param3;
              var7 = 0;
              L1: while (true) {
                if (var13.field_B.length <= var7) {
                  jh.a(var13);
                  param1.d(-param1.field_w, -param1.field_A, -param2 + 256);
                  jh.b();
                  stackOut_10_0 = (cn) var13;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    var8 = var12.field_B[var7];
                    var9 = (63 & var8 >> 2) + (var8 >> 18 & 63) - -(127 & var8 >> 9);
                    var10 = 16711680 & var6 * var9 | -16711936 & var9 * var5;
                    if (0 != var10) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        break L2;
                      } else {
                        var10 = 65793;
                        break L2;
                      }
                    }
                  }
                  var12.field_B[var7] = var10 >>> 8;
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (cn) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("fk.L(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_r = "Password: ";
    }
}
