/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qfa extends cga {
    lu field_v;
    int field_u;
    static String field_w;
    byte field_s;
    static String field_t;

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (-21 > (var2_int ^ -1)) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 20) {
                break L2;
              } else {
                qfa.i(-118);
                break L2;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackIn_23_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param1.charAt(var4);
                    if (65 > var5) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(97 + (-65 + var5));
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 <= 57) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("qfa.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    final int e(int param0) {
        if (this.field_v != null) {
          if (param0 != -6298) {
            field_w = (String) null;
            return this.field_v.field_g * 100 / (-this.field_s + this.field_v.field_h.length);
          } else {
            return this.field_v.field_g * 100 / (-this.field_s + this.field_v.field_h.length);
          }
        } else {
          return 0;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, String param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            qc.field_b.field_Z = param5;
            if (2 == gk.field_d) {
                qq.field_k.field_Z = ru.field_l;
            } else {
                qq.field_k.field_Z = ro.field_k;
            }
            var9_int = 495;
            var10 = 5;
            aja.field_p.a(param4, 31407, -10 + var9_int, 5, var10);
            jba.field_A.a(param4, 31407, aja.field_p.field_sb - ts.field_r.field_sb, 0, 0);
            var10 = var10 + (param4 - -param0);
            ts.field_r.a(param4, 31407, ts.field_r.field_sb, jba.field_A.field_sb, 0);
            ub.field_k.a(param1, 31407, ub.field_k.e(-1), 5, var10);
            var11 = qq.field_k.e(-1);
            qq.field_k.a(param1, 31407, var11, -var11 + (var9_int - 5), var10);
            var12 = param1 + (var10 - -5);
            qc.field_b.a(param8, 31407, var9_int, 0, 0);
            tga.field_m.a(var12, 31407, var9_int, 0, param8);
            if (param3 > -114) {
                field_w = (String) null;
            }
            tga.field_m.field_eb = mu.a(11579568, 3, tga.field_m.field_p, 8421504, 2105376, (byte) 17);
            var12 = var12 + param8;
            bi.field_h.a(var12, 31407, var9_int, param2 + -(var9_int / 2), -(var12 / 2) + param6);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qfa.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
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
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    if (param1 < -18) {
                      break L1;
                    } else {
                      field_t = (String) null;
                      break L1;
                    }
                  }
                  L2: {
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (var3 < 0) {
                      break L2;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L2;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(ow.a(var5, (byte) -107, param0), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref2);

                stackIn_10_1 = new StringBuilder().append("qfa.N(");

                if (param0 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L3;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L3;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qfa() {
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3) {
              stackIn_3_0 = lda.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 < -75) {
                  break L1;
                } else {
                  var4 = (String) null;
                  qfa.a(1, -126, -56, (byte) -48, -64, (String) null, -14, 77, -120);
                  break L1;
                }
              }
              if ((param0 ^ -1) == -7) {
                stackIn_9_0 = ed.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-8 != (param0 ^ -1)) {
                  if (-9 == (param0 ^ -1)) {
                    stackIn_16_0 = hr.field_e;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-10 != (param0 ^ -1)) {
                      if (-11 == (param0 ^ -1)) {
                        stackIn_23_0 = wm.field_l;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (-12 != (param0 ^ -1)) {
                          if (param0 == 14) {
                            stackIn_30_0 = lga.a(true, new String[]{param1}, vfa.field_r);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackIn_26_0 = nla.field_e;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_19_0 = bm.field_m;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_12_0 = vc.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("qfa.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      return stackIn_30_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void g(int param0) {
        field_w = null;
        if (param0 != 97) {
            return;
        }
        field_t = null;
    }

    final static void h(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bga var4_ref_bga = null;
        Object var5 = null;
        int var6 = 0;
        fm var9 = null;
        pf var10 = null;
        byte[] var14 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var10 = ig.field_m;
            var2 = var10.b(16711935);
            if (param0 < -44) {
              if (0 == var2) {
                var9 = (fm) ((Object) us.field_e.b((byte) 90));
                if (var9 == null) {
                  vc.a((byte) -118);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    var4 = var10.b(16711935);
                    if (0 == var4) {
                      var5 = null;
                      break L1;
                    } else {
                      var14 = new byte[var4];
                      var10.a(var14, var4, 128, 0);
                      break L1;
                    }
                  }
                  var10.field_g = var10.field_g + 4;
                  if (var10.j(4)) {
                    var9.a(false);
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    vc.a((byte) -124);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                if (-2 == (var2 ^ -1)) {
                  var3 = var10.f(-108);
                  var4_ref_bga = (bga) ((Object) on.field_r.b((byte) 90));
                  L2: while (true) {
                    L3: {
                      if (var4_ref_bga == null) {
                        break L3;
                      } else {
                        if (var4_ref_bga.field_i != var3) {
                          var4_ref_bga = (bga) ((Object) on.field_r.c(0));
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var4_ref_bga == null) {
                      vc.a((byte) -80);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var4_ref_bga.a(false);
                      return;
                    }
                  }
                } else {
                  cv.a(1, "A1: " + nia.d((byte) -108), (Throwable) null);
                  vc.a((byte) -115);
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "qfa.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void i(int param0) {
        int fieldTemp$2 = 0;
        pf var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            var1 = sja.field_fb;
            L2: while (true) {
              if (!tg.c(-43)) {
                break L0;
              } else {
                var1.c(8, (byte) 119);
                fieldTemp$2 = var1.field_g + 1;
                var1.field_g = var1.field_g + 1;
                var2 = fieldTemp$2;
                sia.a(var1, 108);
                sja.field_fb.b((byte) -68, var1.field_g - var2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "qfa.P(" + param0 + ')');
        }
    }

    final static void f(int param0) {
        qi.field_b = new ue();
        kka.field_l.e(qi.field_b, 33);
        int var1 = -78 / ((param0 - 45) / 53);
    }

    final byte[] d(byte param0) {
        if (!this.field_n) {
          if (-this.field_s + this.field_v.field_h.length <= this.field_v.field_g) {
            if (param0 != -65) {
              qfa.i(1);
              return this.field_v.field_h;
            } else {
              return this.field_v.field_h;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        field_w = "***Ignored!***";
        field_t = "Player";
    }
}
