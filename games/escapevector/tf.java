/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    private int field_a;
    private int field_c;
    private int field_f;
    private int field_j;
    private int field_l;
    static String field_i;
    private int field_e;
    private int field_b;
    private int field_g;
    static String field_h;
    private int field_k;
    private int field_d;
    private int field_m;

    public static void a(int param0) {
        String discarded$0 = null;
        if (param0 >= -85) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            discarded$0 = tf.a(101, (java.applet.Applet) null);
        }
        field_i = null;
        field_h = null;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        L0: {
          var6 = EscapeVector.field_A;
          em.a(0, 0, 640, 480, 0, 64);
          if ((mj.field_d ^ -1) <= -21) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -mj.field_d + 20;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (var2 < 20) {
            stackOut_5_0 = (-var2 + 20) * 160 / 20;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 0;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (!mj.a((byte) 122)) {
          eh.a(var3, this.field_d - 6, this.field_f - 12, 6320248, 0, 24 * ch.field_a.field_k + this.field_f + 12, -3, 6 + this.field_a, 12110032, 3160124, var2 * 2);
          var4 = this.field_f;
          var5 = 0;
          if (param0 > 124) {
            L2: while (true) {
              if (var5 >= ch.field_a.field_k) {
                return;
              } else {
                L3: {
                  stackOut_11_0 = this;
                  stackOut_11_1 = -19868;
                  stackOut_11_2 = var4;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  if (var5 != ch.field_a.field_h) {
                    stackOut_13_0 = this;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = stackIn_13_2;
                    stackOut_13_3 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    break L3;
                  } else {
                    stackOut_12_0 = this;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = stackIn_12_2;
                    stackOut_12_3 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    break L3;
                  }
                }
                this.a(stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0, var5);
                var4 += 24;
                var5++;
                continue L2;
              }
            }
          } else {
            return;
          }
        } else {
          var4 = 20 + dn.a(0) / 2;
          var5 = 15 + ea.d((byte) -96) / 2;
          eh.a(var3, 320 - var4, 240 + -var5, 6320248, 0, var5 + 241, -3, 321 + var4, 12110032, 3160124, 2 * var2);
          en.c(0);
          return;
        }
    }

    private final int a(int param0, boolean param1) {
        String discarded$1 = null;
        int var3_int = 0;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (this.field_j == param0) {
          var3_int = (fh.field_g.b(oi.field_N) - -fh.field_g.b(ee.field_d)) / 2;
          var4 = (-68 + var3_int) / 2;
          return 2 * -(var4 + -fh.field_g.b(oi.field_N));
        } else {
          if (this.field_c == param0) {
            var3_int = (fh.field_g.b(oi.field_N) + fh.field_g.b(ee.field_d)) / 2;
            var4 = (-68 + var3_int) / 2;
            return -(-fh.field_g.b(ee.field_d) + var4) * 2;
          } else {
            if (param0 != this.field_k) {
              L0: {
                var3 = null;
                if (param0 != 0) {
                  break L0;
                } else {
                  var3 = kb.field_g;
                  break L0;
                }
              }
              L1: {
                if (this.field_l == param0) {
                  var3 = tc.field_o;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_b != param0) {
                  break L2;
                } else {
                  var3 = mc.field_a;
                  break L2;
                }
              }
              L3: {
                if (param0 == this.field_g) {
                  var3 = h.field_O;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param0 != this.field_m) {
                  break L4;
                } else {
                  var3 = an.field_b;
                  break L4;
                }
              }
              L5: {
                if (!param1) {
                  break L5;
                } else {
                  discarded$1 = tf.b((byte) 111);
                  break L5;
                }
              }
              L6: {
                if (this.field_e != param0) {
                  break L6;
                } else {
                  var3 = oa.field_q;
                  break L6;
                }
              }
              return fh.field_g.b((String) (var3));
            } else {
              L7: {
                var3_int = fh.field_g.b(nk.field_s);
                var4 = (fh.field_g.b(rh.field_J) - -fh.field_g.b(nb.field_d)) / 2;
                var5 = (var3_int - var4) / 2;
                var6 = (var5 + fh.field_g.b(rh.field_J)) * 2;
                var7 = 2 * (fh.field_g.b(nb.field_d) + var5);
                if (var7 >= var6) {
                  stackOut_9_0 = var7;
                  stackIn_10_0 = stackOut_9_0;
                  break L7;
                } else {
                  stackOut_8_0 = var6;
                  stackIn_10_0 = stackOut_8_0;
                  break L7;
                }
              }
              return stackIn_10_0;
            }
          }
        }
    }

    final void a(byte param0) {
        boolean discarded$2 = false;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        L0: while (true) {
          if (!pn.p(-105)) {
            L1: {
              if (param0 == -75) {
                break L1;
              } else {
                this.b(true, -119);
                break L1;
              }
            }
            ch.field_a.a(0, this.field_d, this.field_f, 24, this.field_a);
            discarded$2 = this.a(true, 123);
            return;
          } else {
            if (nk.field_n == 13) {
              da.field_c = null;
              return;
            } else {
              ch.field_a.c((byte) 6);
              if (!this.a(false, 122)) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    private final boolean a(boolean param0, int param1) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        o var8 = null;
        int var9 = 0;
        o var10 = null;
        o var11 = null;
        o var12 = null;
        o var13 = null;
        int stackIn_39_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_99_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        L0: {
          var9 = EscapeVector.field_A;
          if (!ch.field_a.field_e) {
            break L0;
          } else {
            rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, 8192);
            break L0;
          }
        }
        L1: {
          if (ch.field_a.field_h != 0) {
            break L1;
          } else {
            if (ch.field_a.b((byte) -18)) {
              bc.field_d = true;
              s.field_E = true;
              da.field_c = null;
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (ch.field_a.field_h != this.field_l) {
            break L2;
          } else {
            if (ch.field_a.b((byte) -18)) {
              ac.b(112);
              ma.field_a.field_Jb = true;
              ma.field_a.field_Cb = true;
              ma.field_a.x((byte) 68);
              da.field_c = null;
              bc.field_d = true;
              s.field_E = true;
              return true;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (ch.field_a.field_h != this.field_b) {
            break L3;
          } else {
            if (!ch.field_a.b((byte) -18)) {
              break L3;
            } else {
              ek.a(ch.field_a.field_j, false);
              return true;
            }
          }
        }
        L4: {
          if (this.field_g != ch.field_a.field_h) {
            break L4;
          } else {
            if (ch.field_a.b((byte) -18)) {
              ma.field_a.j(256);
              return true;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (ch.field_a.field_h == this.field_j) {
            L6: {
              if (!ch.field_a.g(13)) {
                break L6;
              } else {
                if (-1 > (qm.field_c ^ -1)) {
                  L7: {
                    qm.field_c = qm.field_c - 8;
                    if (-1 < (qm.field_c ^ -1)) {
                      qm.field_c = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ce.d(8192);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (!ch.field_a.b(-98)) {
                break L8;
              } else {
                if (64 <= qm.field_c) {
                  break L8;
                } else {
                  L9: {
                    qm.field_c = qm.field_c + 8;
                    if (qm.field_c <= 64) {
                      break L9;
                    } else {
                      qm.field_c = 64;
                      break L9;
                    }
                  }
                  ce.d(8192);
                  break L8;
                }
              }
            }
            L10: {
              if (!ch.field_a.d(-10809)) {
                break L10;
              } else {
                qm.field_c = 0;
                ce.d(8192);
                break L10;
              }
            }
            L11: {
              if (!ch.field_a.e(0)) {
                break L11;
              } else {
                qm.field_c = 64;
                ce.d(8192);
                break L11;
              }
            }
            if (!ch.field_a.a(false)) {
              if (!ch.field_a.b((byte) -18)) {
                break L5;
              } else {
                ce.d(8192);
                break L5;
              }
            } else {
              L12: {
                var3 = fh.field_g.b(oi.field_N);
                var4 = fh.field_g.b(ee.field_d);
                if (var3 > var4) {
                  stackOut_38_0 = var3;
                  stackIn_39_0 = stackOut_38_0;
                  break L12;
                } else {
                  stackOut_37_0 = var4;
                  stackIn_39_0 = stackOut_37_0;
                  break L12;
                }
              }
              L13: {
                var5 = stackIn_39_0;
                var6 = 320 - -((var5 - 68) / 2);
                var7 = -var6 - (2 - dh.field_d);
                if ((var7 ^ -1) > -1) {
                  var7 = 0;
                  break L13;
                } else {
                  if (-65 <= (var7 ^ -1)) {
                    break L13;
                  } else {
                    var7 = 64;
                    break L13;
                  }
                }
              }
              L14: {
                if (ch.field_a.b((byte) -18)) {
                  break L14;
                } else {
                  if (var7 != qm.field_c) {
                    break L14;
                  } else {
                    break L5;
                  }
                }
              }
              qm.field_c = var7;
              ce.d(8192);
              break L5;
            }
          } else {
            break L5;
          }
        }
        L15: {
          if (param1 >= 121) {
            break L15;
          } else {
            discarded$1 = this.c((byte) -39);
            break L15;
          }
        }
        L16: {
          if (this.field_c != ch.field_a.field_h) {
            break L16;
          } else {
            L17: {
              if (!ch.field_a.g(115)) {
                break L17;
              } else {
                if (0 < kc.field_b) {
                  L18: {
                    kc.field_b = kc.field_b - 8;
                    if (0 > kc.field_b) {
                      kc.field_b = 0;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  var10 = ni.field_N;
                  if (var10 == null) {
                    break L17;
                  } else {
                    var10.d(kc.field_b * kn.field_b / 64);
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
            }
            L19: {
              if (!ch.field_a.b(-98)) {
                break L19;
              } else {
                if ((kc.field_b ^ -1) <= -65) {
                  break L19;
                } else {
                  L20: {
                    kc.field_b = kc.field_b + 8;
                    if (64 < kc.field_b) {
                      kc.field_b = 64;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  var11 = ni.field_N;
                  if (var11 == null) {
                    break L19;
                  } else {
                    var11.d(kn.field_b * kc.field_b / 64);
                    break L19;
                  }
                }
              }
            }
            L21: {
              if (!ch.field_a.d(-10809)) {
                break L21;
              } else {
                kc.field_b = 0;
                var12 = ni.field_N;
                if (var12 != null) {
                  var12.d(kn.field_b * kc.field_b / 64);
                  break L21;
                } else {
                  break L21;
                }
              }
            }
            L22: {
              if (!ch.field_a.e(0)) {
                break L22;
              } else {
                kc.field_b = 64;
                var13 = ni.field_N;
                if (var13 == null) {
                  break L22;
                } else {
                  var13.d(kc.field_b * kn.field_b / 64);
                  break L22;
                }
              }
            }
            if (ch.field_a.a(false)) {
              L23: {
                var3 = fh.field_g.b(oi.field_N);
                var4 = fh.field_g.b(ee.field_d);
                if (var3 <= var4) {
                  stackOut_78_0 = var4;
                  stackIn_79_0 = stackOut_78_0;
                  break L23;
                } else {
                  stackOut_77_0 = var3;
                  stackIn_79_0 = stackOut_77_0;
                  break L23;
                }
              }
              L24: {
                var5 = stackIn_79_0;
                var6 = 320 - -((var5 + -68) / 2);
                var7 = -2 - (var6 - dh.field_d);
                if ((var7 ^ -1) <= -1) {
                  if ((var7 ^ -1) >= -65) {
                    break L24;
                  } else {
                    var7 = 64;
                    break L24;
                  }
                } else {
                  var7 = 0;
                  break L24;
                }
              }
              kc.field_b = var7;
              var8 = ni.field_N;
              if (var8 == null) {
                break L16;
              } else {
                var8.d(kn.field_b * kc.field_b / 64);
                break L16;
              }
            } else {
              break L16;
            }
          }
        }
        L25: {
          if (ch.field_a.field_h != this.field_m) {
            break L25;
          } else {
            if (ch.field_a.b((byte) -18)) {
              L26: {
                if (df.field_d != null) {
                  ri.a(-25123);
                  break L26;
                } else {
                  eo.a(24, param0);
                  break L26;
                }
              }
              ch.field_a.a(-1, true, 4767999);
              break L25;
            } else {
              break L25;
            }
          }
        }
        L27: {
          if (ch.field_a.field_h != this.field_k) {
            break L27;
          } else {
            L28: {
              if (ch.field_a.b(false)) {
                break L28;
              } else {
                if (ch.field_a.f(23518)) {
                  break L28;
                } else {
                  break L27;
                }
              }
            }
            L29: {
              if (nf.field_r) {
                stackOut_98_0 = 0;
                stackIn_99_0 = stackOut_98_0;
                break L29;
              } else {
                stackOut_97_0 = 1;
                stackIn_99_0 = stackOut_97_0;
                break L29;
              }
            }
            nf.field_r = stackIn_99_0 != 0;
            rk.field_e.a(oa.field_w, 100, qm.field_c * 1536 / 64, 8192);
            break L27;
          }
        }
        if (this.field_e != ch.field_a.field_h) {
          return false;
        } else {
          if (ch.field_a.b((byte) -18)) {
            ma.field_a.field_Jb = true;
            ma.field_a.x((byte) -48);
            bc.field_d = true;
            da.field_c = null;
            s.field_E = true;
            return true;
          } else {
            return false;
          }
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String discarded$1 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_6_0 = null;
            String stackIn_12_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_5_0 = null;
            String stackOut_15_0 = null;
            String stackOut_11_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var8 = EscapeVector.field_A;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param1.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (sd.a(param1, "getcookies", -29155));
                    var5 = bb.a(-128, var4, ';');
                    var6 = 0;
                    L2: while (true) {
                      if (var6 >= var5.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var5[var6].indexOf('=');
                          if (var7 < 0) {
                            break L3;
                          } else {
                            if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                              break L3;
                            } else {
                              stackOut_5_0 = var5[var6].substring(var7 + 1).trim();
                              stackIn_6_0 = stackOut_5_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (oh.field_p == null) {
                    L5: {
                      if (param0 == -1) {
                        break L5;
                      } else {
                        discarded$1 = tf.b((byte) -31);
                        break L5;
                      }
                    }
                    stackOut_15_0 = param1.getParameter("settings");
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackOut_11_0 = oh.field_p;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) (var2_ref);
                stackOut_17_1 = new StringBuilder().append("tf.D(").append(param0).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param1 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_16_0;
              } else {
                return stackIn_6_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 != 320) {
            this.a((byte) 11);
        }
        ch.field_a.a(ch.field_a.a((byte) 119, this.field_f, dh.field_d, 24, this.field_a, bj.field_y, this.field_d), param0, param1 + 4767679);
    }

    private final int c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ch.field_a.field_k) {
            var4 = 35 / ((param0 - 14) / 50);
            return var2;
          } else {
            var4 = this.a(var3, false);
            if (var2 < var4) {
              var2 = var4;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    tf() {
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int var2 = 0;
        int var3 = 0;
        oe var5 = null;
        L0: {
          var5 = ma.field_a;
          var2 = 1;
          if (0 <= var5.field_Pb) {
            this.field_l = -2;
            break L0;
          } else {
            incrementValue$17 = var2;
            var2++;
            this.field_l = incrementValue$17;
            break L0;
          }
        }
        L1: {
          L2: {
            incrementValue$18 = var2;
            var2++;
            this.field_b = incrementValue$18;
            if (var5.field_fc == 3) {
              break L2;
            } else {
              if (var5.field_Pb < 0) {
                break L2;
              } else {
                incrementValue$19 = var2;
                var2++;
                this.field_g = incrementValue$19;
                break L1;
              }
            }
          }
          this.field_g = -2;
          break L1;
        }
        L3: {
          incrementValue$20 = var2;
          var2++;
          this.field_j = incrementValue$20;
          incrementValue$21 = var2;
          var2++;
          this.field_c = incrementValue$21;
          if ((s.field_x ^ -1) < -1) {
            incrementValue$22 = var2;
            var2++;
            this.field_m = incrementValue$22;
            break L3;
          } else {
            this.field_m = -2;
            break L3;
          }
        }
        L4: {
          L5: {
            if ((var5.field_Pb ^ -1) > -1) {
              break L5;
            } else {
              if (!var5.field_rc) {
                break L5;
              } else {
                incrementValue$23 = var2;
                var2++;
                this.field_k = incrementValue$23;
                break L4;
              }
            }
          }
          this.field_k = -2;
          break L4;
        }
        int incrementValue$24 = var2;
        var2++;
        this.field_e = incrementValue$24;
        this.field_f = 240 + -(var2 * 12);
        ch.field_a = new wc(var2);
        this.b(false, 320);
        var3 = this.c((byte) -56);
        this.field_d = -10 + (-(var3 / 2) + 320);
        this.field_a = 10 + (320 - -(var3 / 2));
    }

    final static String b(byte param0) {
        if (param0 != 0) {
            tf.a(-60);
        }
        return om.field_g.c(false);
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        ih stackIn_30_0 = null;
        ih stackIn_31_0 = null;
        ih stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        ih stackOut_29_0 = null;
        ih stackOut_31_0 = null;
        String stackOut_31_1 = null;
        ih stackOut_30_0 = null;
        String stackOut_30_1 = null;
        L0: {
          mj.field_b.g();
          em.d();
          if (!param2) {
            stackOut_2_0 = 7899280;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 16777215;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var6 = mj.field_b.field_A / 2;
        if (param0 == -19868) {
          L1: {
            if (0 != param3) {
              break L1;
            } else {
              fh.field_g.c(kb.field_g, var6, 22, var5, -1);
              break L1;
            }
          }
          L2: {
            if (param3 != this.field_l) {
              break L2;
            } else {
              fh.field_g.c(tc.field_o, var6, 22, var5, -1);
              break L2;
            }
          }
          L3: {
            if (param3 == this.field_b) {
              fh.field_g.c(mc.field_a, var6, 22, var5, -1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param3 != this.field_g) {
              break L4;
            } else {
              fh.field_g.c(h.field_O, var6, 22, var5, -1);
              break L4;
            }
          }
          L5: {
            if (param3 == this.field_j) {
              L6: {
                var7 = fh.field_g.b(oi.field_N);
                var8 = fh.field_g.b(ee.field_d);
                if (var8 < var7) {
                  stackOut_18_0 = var7;
                  stackIn_19_0 = stackOut_18_0;
                  break L6;
                } else {
                  stackOut_17_0 = var8;
                  stackIn_19_0 = stackOut_17_0;
                  break L6;
                }
              }
              var9 = stackIn_19_0;
              var10 = var6 - -((var9 + -68) / 2);
              fh.field_g.b(oi.field_N, var10, 22, var5, -1);
              r.a(var10, 13202, 4, qm.field_c, var5);
              break L5;
            } else {
              break L5;
            }
          }
          L7: {
            if (param3 != this.field_c) {
              break L7;
            } else {
              L8: {
                var7 = fh.field_g.b(oi.field_N);
                var8 = fh.field_g.b(ee.field_d);
                if (var8 >= var7) {
                  stackOut_23_0 = var8;
                  stackIn_24_0 = stackOut_23_0;
                  break L8;
                } else {
                  stackOut_22_0 = var7;
                  stackIn_24_0 = stackOut_22_0;
                  break L8;
                }
              }
              var9 = stackIn_24_0;
              var10 = (-68 + var9) / 2 + var6;
              fh.field_g.b(ee.field_d, var10, 22, var5, -1);
              r.a(var10, 13202, 4, kc.field_b, var5);
              break L7;
            }
          }
          L9: {
            if (this.field_m == param3) {
              fh.field_g.c(an.field_b, var6, 22, var5, -1);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param3 != this.field_k) {
              break L10;
            } else {
              L11: {
                var7 = fh.field_g.b(nk.field_s);
                var8 = (fh.field_g.b(rh.field_J) - -fh.field_g.b(nb.field_d)) / 2;
                var9 = var6 + (var7 - var8) / 2;
                fh.field_g.b(nk.field_s, var9, 22, var5, -1);
                stackOut_29_0 = fh.field_g;
                stackIn_31_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if (nf.field_r) {
                  stackOut_31_0 = (ih) ((Object) stackIn_31_0);
                  stackOut_31_1 = rh.field_J;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  break L11;
                } else {
                  stackOut_30_0 = (ih) ((Object) stackIn_30_0);
                  stackOut_30_1 = nb.field_d;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  break L11;
                }
              }
              ((ih) (Object) stackIn_32_0).a(stackIn_32_1, var9, 22, var5, -1);
              break L10;
            }
          }
          L12: {
            if (param3 != this.field_e) {
              break L12;
            } else {
              fh.field_g.c(oa.field_q, var6, 22, var5, -1);
              break L12;
            }
          }
          md.field_D.a(107);
          cf.a(mj.field_b, true, 1);
          mj.field_b.h(5267536);
          mj.field_b.e((-mj.field_b.field_A + 640) / 2, param1);
          return;
        } else {
          return;
        }
    }

    static {
        field_i = "Extract the crate";
    }
}
