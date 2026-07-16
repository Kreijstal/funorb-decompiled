/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static int[] field_a;
    static int field_b;
    static byte[] field_c;

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 4) {
            field_c = null;
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        hf var12 = null;
        pc var13 = null;
        int[] var14 = null;
        mc var15 = null;
        Object var16 = null;
        mc var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        L0: {
          var16 = null;
          var8 = Pixelate.field_H ? 1 : 0;
          var13 = vi.field_o;
          if (param0 >= 120) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          var2 = var13.f(255);
          if (var2 != 0) {
            if (var2 != 1) {
              if ((var2 ^ -1) != -3) {
                jo.a(1, "A1: " + jm.b(-79), (Throwable) null);
                na.a(true);
                break L1;
              } else {
                var16_ref = (mc) (Object) tj.field_z.c(1504642273);
                if (var16_ref != null) {
                  var16_ref.field_l = bf.a(false);
                  var16_ref.field_p = true;
                  var16_ref.field_s = var16_ref.field_l[0];
                  var16_ref.c(2779);
                  break L1;
                } else {
                  na.a(true);
                  return;
                }
              }
            } else {
              var12 = (hf) (Object) dh.field_a.c(1504642273);
              if (var12 != null) {
                var12.c(2779);
                break L1;
              } else {
                na.a(true);
                return;
              }
            }
          } else {
            var11 = bf.a(false);
            var19 = var11;
            var18 = var19;
            var17 = var18;
            var14 = var17;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((we) (Object) var5).f(255);
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                var15 = (mc) (Object) tj.field_z.c(1504642273);
                if (var15 == null) {
                  na.a(true);
                  return;
                } else {
                  var15.field_p = true;
                  var15.field_s = var19[0];
                  var15.field_l = var3;
                  var15.c(2779);
                  break L1;
                }
              } else {
                var10[var7] = ((we) (Object) var5).k(0);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          var2 = param1.length();
          if ((var2 ^ -1) >= -21) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        L1: {
          var8 = new char[var2];
          var7 = var8;
          var3 = var7;
          if (param0 == 10) {
            break L1;
          } else {
            field_a = null;
            break L1;
          }
        }
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            return new String(var8);
          } else {
            L3: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L3;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(97 + var5 + -65);
                  var4++;
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (122 >= var5) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (48 > var5) {
                  break L6;
                } else {
                  if (var5 > 57) {
                    break L6;
                  } else {
                    break L4;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (cb.field_p.startsWith("win")) {
              L1: {
                if (param1 == -31451) {
                  break L1;
                } else {
                  field_c = null;
                  break L1;
                }
              }
              L2: {
                if (param0.startsWith("http://")) {
                  break L2;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L3: while (true) {
                if (param0.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) != 0) {
                    var3++;
                    continue L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_18_0 != 0;
    }

    final static ak b(byte param0) {
        if (param0 > -84) {
            int discarded$0 = la.a((byte) -93);
        }
        return aj.field_k.field_Fb;
    }

    final static void a(int param0, int param1, gp param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        bb var10 = null;
        Object var11 = null;
        int var11_int = 0;
        uj var12 = null;
        int var13 = 0;
        ak var14 = null;
        ak var15 = null;
        ak var16 = null;
        ak var17 = null;
        ak var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        String var24 = null;
        String var25 = null;
        int var25_int = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        gp stackIn_39_0 = null;
        boolean stackIn_39_1 = false;
        gp stackIn_40_0 = null;
        boolean stackIn_40_1 = false;
        gp stackIn_41_0 = null;
        boolean stackIn_41_1 = false;
        int stackIn_41_2 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        ak stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        int stackIn_91_4 = 0;
        ak stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        int stackIn_92_4 = 0;
        ak stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        int stackIn_93_5 = 0;
        gp stackOut_38_0 = null;
        boolean stackOut_38_1 = false;
        gp stackOut_40_0 = null;
        boolean stackOut_40_1 = false;
        int stackOut_40_2 = 0;
        gp stackOut_39_0 = null;
        boolean stackOut_39_1 = false;
        int stackOut_39_2 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        ak stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        int stackOut_90_4 = 0;
        ak stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        int stackOut_92_5 = 0;
        ak stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_91_4 = 0;
        int stackOut_91_5 = 0;
        L0: {
          var31 = Pixelate.field_H ? 1 : 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null == io.field_c) {
            break L0;
          } else {
            L1: {
              if (null != jm.field_r) {
                break L1;
              } else {
                if (null != w.field_z) {
                  break L1;
                } else {
                  if (null != pa.field_a) {
                    break L1;
                  } else {
                    if (oo.field_e != null) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L2: while (true) {
              if (fj.field_b <= var9) {
                break L0;
              } else {
                L3: {
                  var10_int = io.field_c.field_Eb[var9] & 255;
                  if (jm.field_r == null) {
                    break L3;
                  } else {
                    if (jm.field_r[var9] != null) {
                      if (jm.field_r[var9][var10_int]) {
                        var5 = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null == w.field_z) {
                    break L4;
                  } else {
                    if (null != w.field_z[var9]) {
                      L5: {
                        var11_int = w.field_z[var9][var10_int];
                        if (0 == var11_int) {
                          break L5;
                        } else {
                          if (fe.field_a) {
                            break L5;
                          } else {
                            var5 = 1;
                            break L5;
                          }
                        }
                      }
                      if (var11_int > var6) {
                        var6 = var11_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (oo.field_e == null) {
                    break L6;
                  } else {
                    if (oo.field_e[var9] != null) {
                      var8 = var8 | oo.field_e[var9][var10_int];
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (pa.field_a != null) {
                  if (pa.field_a[var9] != null) {
                    L7: {
                      var11_int = pa.field_a[var9][var10_int];
                      if (var7 >= var11_int) {
                        break L7;
                      } else {
                        var7 = var11_int;
                        break L7;
                      }
                    }
                    if (var11_int != 0) {
                      if (!fe.field_a) {
                        var5 = 1;
                        var9++;
                        continue L2;
                      } else {
                        var9++;
                        continue L2;
                      }
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        }
        L8: {
          stackOut_38_0 = (gp) param2;
          stackOut_38_1 = param4;
          stackIn_40_0 = stackOut_38_0;
          stackIn_40_1 = stackOut_38_1;
          stackIn_39_0 = stackOut_38_0;
          stackIn_39_1 = stackOut_38_1;
          if (bj.field_d != param2) {
            stackOut_40_0 = (gp) (Object) stackIn_40_0;
            stackOut_40_1 = stackIn_40_1;
            stackOut_40_2 = 0;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            stackIn_41_2 = stackOut_40_2;
            break L8;
          } else {
            stackOut_39_0 = (gp) (Object) stackIn_39_0;
            stackOut_39_1 = stackIn_39_1;
            stackOut_39_2 = 1;
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_41_2 = stackOut_39_2;
            break L8;
          }
        }
        L9: {
          if (((gp) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 == 0, 2, (fq.field_q * 4 + 8) * param3, 0, 2 * fq.field_q + 4)) {
            stackOut_43_0 = 0;
            stackIn_44_0 = stackOut_43_0;
            break L9;
          } else {
            stackOut_42_0 = 1;
            stackIn_44_0 = stackOut_42_0;
            break L9;
          }
        }
        var9 = stackIn_44_0;
        var10 = param2.field_Fb.field_L;
        var11 = null;
        var12 = (uj) (Object) var10.c(1504642273);
        L10: while (true) {
          if (var12 == null) {
            L11: {
              if (param0 >= 19) {
                break L11;
              } else {
                field_a = null;
                break L11;
              }
            }
            return;
          } else {
            L12: {
              var13 = 0;
              if (var12.field_L != null) {
                break L12;
              } else {
                L13: {
                  var12.field_Hb = new ak(0L, ak.field_T);
                  var12.a(var12.field_Hb, (byte) 26);
                  var12.field_Gb = new ak(0L, of.field_i);
                  if (!f.field_n) {
                    break L13;
                  } else {
                    var12.a(var12.field_Gb, (byte) 26);
                    break L13;
                  }
                }
                var12.field_Gb.field_Bb = 2;
                var12.field_Sb = new ak(0L, mg.field_h);
                var12.a(var12.field_Sb, (byte) 26);
                var12.h(-257);
                var12.field_Zb = new ak(0L, ul.field_p);
                var12.a(var12.field_Zb, (byte) 26);
                var12.field_Mb = new ak(0L, ge.field_h);
                var12.a(var12.field_Mb, (byte) 26);
                var13 = 1;
                break L12;
              }
            }
            L14: {
              var12.field_Hb.field_cb = null;
              var14 = var12.field_Hb;
              var12.field_Hb.field_nb = 0;
              var14.field_K = 0;
              var12.field_Gb.field_cb = null;
              var15 = var12.field_Gb;
              var12.field_Gb.field_nb = 0;
              var15.field_K = 0;
              var12.field_Zb.field_cb = null;
              var12.field_Zb.field_nb = 0;
              var16 = var12.field_Zb;
              var12.field_Mb.field_cb = null;
              var16.field_K = 0;
              var12.field_Mb.field_nb = 0;
              var17 = var12.field_Mb;
              var17.field_K = 0;
              var12.field_Sb.field_cb = null;
              var12.field_Sb.field_nb = 0;
              var18 = var12.field_Sb;
              var18.field_K = 0;
              var12.field_K = param2.field_Fb.field_K;
              var19 = 0;
              var32 = var12.field_Fb;
              var20 = var32;
              var20 = var32;
              var21 = 72;
              if (jm.field_b == param2) {
                var21 += 42;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var33 = jl.a(var12.field_Hb.field_Db, var32, var21);
              var20 = var33;
              var20 = var33;
              if (var33.equals((Object) (Object) var12.field_Fb)) {
                stackOut_55_0 = 0;
                stackIn_56_0 = stackOut_55_0;
                break L15;
              } else {
                stackOut_54_0 = 1;
                stackIn_56_0 = stackOut_54_0;
                break L15;
              }
            }
            L16: {
              var22 = stackIn_56_0;
              if (4 <= var12.field_Qb) {
                var20 = "<img=" + (-4 + var12.field_Qb + kk.field_s) + ">" + var33;
                break L16;
              } else {
                if (var12.field_Qb <= 0) {
                  break L16;
                } else {
                  var20 = "<img=" + (var12.field_Qb - 1) + ">" + var33;
                  break L16;
                }
              }
            }
            L17: {
              var12.field_Hb.field_cb = var20;
              if (!var12.b((byte) -114)) {
                L18: {
                  L19: {
                    L20: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5 == 0) {
                        break L20;
                      } else {
                        if (!var12.field_Xb) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (var6 > var12.field_Rb) {
                      break L19;
                    } else {
                      if (var12.field_Yb < var7) {
                        break L19;
                      } else {
                        if (-1 < (var12.field_Ib & var8)) {
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  var24_int = 8421504;
                  var23_int = 8414771;
                  break L18;
                }
                L21: {
                  var12.field_Zb.field_N = var23_int;
                  var12.field_Gb.field_N = var23_int;
                  var12.field_Hb.field_N = var23_int;
                  var12.field_Hb.field_Cb = var24_int;
                  var12.field_Hb.field_pb = var24_int;
                  var12.field_Hb.field_y = var24_int;
                  var12.field_Gb.field_Cb = var24_int;
                  var12.field_Gb.field_pb = var24_int;
                  var12.field_Gb.field_y = var24_int;
                  var12.field_Zb.field_Cb = var24_int;
                  var12.field_Zb.field_pb = var24_int;
                  var12.field_Zb.field_y = var24_int;
                  if (param2 == ae.field_c) {
                    if (io.field_c.field_dc) {
                      break L21;
                    } else {
                      var12.field_Mb.field_cb = pf.field_m;
                      break L21;
                    }
                  } else {
                    if (var12.field_Vb) {
                      var12.field_Hb.field_cb = sd.a(gf.field_e, 111, new String[1]);
                      var12.field_Mb.field_cb = fa.field_f;
                      break L21;
                    } else {
                      if (var12.field_Jb) {
                        var12.field_Hb.field_cb = sd.a(ud.field_O, 58, new String[1]);
                        var12.field_Zb.field_cb = fh.field_M;
                        var12.field_Mb.field_cb = u.field_e;
                        break L21;
                      } else {
                        var12.field_Zb.field_cb = ih.field_b;
                        break L21;
                      }
                    }
                  }
                }
                L22: {
                  var25_int = 0;
                  if (io.field_c == null) {
                    break L22;
                  } else {
                    if (!pl.m(99)) {
                      break L22;
                    } else {
                      if (hn.field_f == var12.field_Nb) {
                        break L22;
                      } else {
                        L23: {
                          if (null != var12.field_Zb.field_cb) {
                            var26 = var12.field_Zb.g(0) + v.field_c * 2;
                            var12.field_Zb.a(var19, fq.field_q, var25_int, 256, var26);
                            var25_int = var25_int + var26;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        if (null != var12.field_Mb.field_cb) {
                          L24: {
                            if (param2 == ae.field_c) {
                              var26 = 40;
                              break L24;
                            } else {
                              var26 = var12.field_Mb.g(0) - -(2 * v.field_c);
                              break L24;
                            }
                          }
                          var12.field_Mb.a(var19, fq.field_q, var25_int, 256, var26);
                          var25_int = var25_int + var26;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
                L25: {
                  stackOut_90_0 = var12.field_Hb;
                  stackOut_90_1 = var19;
                  stackOut_90_2 = fq.field_q;
                  stackOut_90_3 = var25_int;
                  stackOut_90_4 = 256;
                  stackIn_92_0 = stackOut_90_0;
                  stackIn_92_1 = stackOut_90_1;
                  stackIn_92_2 = stackOut_90_2;
                  stackIn_92_3 = stackOut_90_3;
                  stackIn_92_4 = stackOut_90_4;
                  stackIn_91_0 = stackOut_90_0;
                  stackIn_91_1 = stackOut_90_1;
                  stackIn_91_2 = stackOut_90_2;
                  stackIn_91_3 = stackOut_90_3;
                  stackIn_91_4 = stackOut_90_4;
                  if (!f.field_n) {
                    stackOut_92_0 = (ak) (Object) stackIn_92_0;
                    stackOut_92_1 = stackIn_92_1;
                    stackOut_92_2 = stackIn_92_2;
                    stackOut_92_3 = stackIn_92_3;
                    stackOut_92_4 = stackIn_92_4;
                    stackOut_92_5 = 0;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    stackIn_93_2 = stackOut_92_2;
                    stackIn_93_3 = stackOut_92_3;
                    stackIn_93_4 = stackOut_92_4;
                    stackIn_93_5 = stackOut_92_5;
                    break L25;
                  } else {
                    stackOut_91_0 = (ak) (Object) stackIn_91_0;
                    stackOut_91_1 = stackIn_91_1;
                    stackOut_91_2 = stackIn_91_2;
                    stackOut_91_3 = stackIn_91_3;
                    stackOut_91_4 = stackIn_91_4;
                    stackOut_91_5 = 42;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_93_1 = stackOut_91_1;
                    stackIn_93_2 = stackOut_91_2;
                    stackIn_93_3 = stackOut_91_3;
                    stackIn_93_4 = stackOut_91_4;
                    stackIn_93_5 = stackOut_91_5;
                    break L25;
                  }
                }
                L26: {
                  L27: {
                    ((ak) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, stackIn_93_3, stackIn_93_4, -stackIn_93_5 + var12.field_K + -var25_int);
                    var12.field_Gb.field_cb = Integer.toString(var12.field_Rb);
                    var12.field_Gb.a(var19, fq.field_q, var12.field_K - 40, 256, 40);
                    if (!var12.field_Hb.field_W) {
                      break L27;
                    } else {
                      if (var22 != 0) {
                        up.field_o = var12.field_Fb;
                        if (gi.field_d == null) {
                          break L26;
                        } else {
                          if (gi.field_d[var12.field_Qb] != null) {
                            up.field_o = up.field_o + " - " + gi.field_d[var12.field_Qb];
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      } else {
                        break L27;
                      }
                    }
                  }
                  if (!var12.field_Hb.field_W) {
                    break L26;
                  } else {
                    if (null == gi.field_d) {
                      break L26;
                    } else {
                      if (gi.field_d[var12.field_Qb] != null) {
                        up.field_o = gi.field_d[var12.field_Qb];
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                var19 = var19 + fq.field_q;
                break L17;
              } else {
                break L17;
              }
            }
            L28: {
              var23 = on.a(var12.field_Eb, var20, -17279);
              var24 = var23;
              var30 = var24;
              var25 = var30;
              var24 = var23;
              if (var23 != null) {
                var24_int = var12.field_Sb.field_Db.b(var23, -v.field_c + (var12.field_K + -v.field_c));
                var12.field_Sb.field_cb = var23;
                var12.field_Sb.field_yb = var12.field_Tb * 256 / mh.field_b;
                var12.field_Sb.a(var19, fq.field_q * var24_int, v.field_c, 256, var12.field_K + -(v.field_c * 2));
                var19 = var19 + var24_int * fq.field_q;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (var9 == 0) {
                var12.field_Z = -var12.field_nb + var19;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (var13 != 0) {
                param2.field_Fb.a((ak) (Object) var12, 2, -1, (ak) var11);
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (var12.field_P == 0) {
                break L31;
              } else {
                if (!var12.b((byte) -89)) {
                  if (var12.field_Zb.field_P == 0) {
                    if (0 == var12.field_Mb.field_P) {
                      oi.a(uo.field_a, 0, ji.field_c, (byte) -110, var12, 0, param2);
                      break L31;
                    } else {
                      pe.a(7, param1, var12.field_Nb);
                      break L31;
                    }
                  } else {
                    bg.a(var12.field_Nb, param1, -26231);
                    break L31;
                  }
                } else {
                  break L31;
                }
              }
            }
            L32: {
              var11 = (Object) (Object) var12;
              if (!var12.field_R) {
                break L32;
              } else {
                if (var12.b((byte) -110)) {
                  break L32;
                } else {
                  L33: {
                    var24 = null;
                    if ((hn.field_f ^ -1L) != (var12.field_Nb ^ -1L)) {
                      L34: {
                        if (var5 == 0) {
                          break L34;
                        } else {
                          if (var12.field_Xb) {
                            break L34;
                          } else {
                            var24 = sd.a(rh.field_w, 46, new String[1]);
                            break L33;
                          }
                        }
                      }
                      if (var7 <= var12.field_Yb) {
                        if (var6 <= var12.field_Rb) {
                          if ((var8 & (var12.field_Ib ^ -1)) != 0) {
                            var25_int = cl.a((byte) -101, var8 & (var12.field_Ib ^ -1));
                            var24 = sd.a(hg.field_i, 27, new String[1]);
                            if (var25_int <= 0) {
                              break L33;
                            } else {
                              if (null == lc.field_l) {
                                break L33;
                              } else {
                                if (var25_int > lc.field_l.length) {
                                  break L33;
                                } else {
                                  if (lc.field_l[var25_int + -1] != null) {
                                    var24 = sd.a(lc.field_l[var25_int - 1][2], 62, new String[1]);
                                    var30 = var24;
                                    var25 = var30;
                                    var24 = var25;
                                    var30 = var24;
                                    var25 = var30;
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          } else {
                            break L33;
                          }
                        } else {
                          var24 = sd.a(jj.field_e, 40, new String[2]);
                          break L33;
                        }
                      } else {
                        L35: {
                          var25_int = -var12.field_Yb + var7;
                          if (var25_int == 1) {
                            var24 = sd.a(jm.field_k, 22, new String[1]);
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        var24 = sd.a(tg.field_l, 62, new String[2]);
                        break L33;
                      }
                    } else {
                      L36: {
                        if (var5 == 0) {
                          break L36;
                        } else {
                          if (var12.field_Xb) {
                            break L36;
                          } else {
                            var24 = ll.field_g;
                            break L33;
                          }
                        }
                      }
                      if (var7 > var12.field_Yb) {
                        L37: {
                          var25_int = -var12.field_Yb + var7;
                          if (-2 != (var25_int ^ -1)) {
                            break L37;
                          } else {
                            var24 = oe.field_Mb;
                            break L37;
                          }
                        }
                        var24 = sd.a(ll.field_f, 95, new String[2]);
                        break L33;
                      } else {
                        if (var6 <= var12.field_Rb) {
                          if (0 != (var8 & (var12.field_Ib ^ -1))) {
                            var25_int = cl.a((byte) -100, var8 & var12.field_Ib);
                            var24 = jp.field_d;
                            if (-1 >= var25_int) {
                              break L33;
                            } else {
                              if (null == lc.field_l) {
                                break L33;
                              } else {
                                if (lc.field_l.length < var25_int) {
                                  break L33;
                                } else {
                                  if (lc.field_l[var25_int + -1] != null) {
                                    var24 = lc.field_l[-1 + var25_int][1];
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          } else {
                            break L33;
                          }
                        } else {
                          var24 = sd.a(jn.field_m, 63, new String[2]);
                          break L33;
                        }
                      }
                    }
                  }
                  if (var24 == null) {
                    break L32;
                  } else {
                    var34 = "<col=A00000>" + var24;
                    var30 = var34;
                    var25 = var30;
                    var24 = var25;
                    var30 = var34;
                    var25 = var30;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L38: while (true) {
                      if (fj.field_b <= var27_int) {
                        L39: {
                          L40: {
                            if (param2 != ae.field_c) {
                              break L40;
                            } else {
                              if (!pl.m(99)) {
                                break L40;
                              } else {
                                if (var26 == 0) {
                                  var24 = var34 + "<br>" + sd.a(tk.field_q, 96, new String[1]);
                                  break L39;
                                } else {
                                  var24 = var34 + "<br>" + le.field_i + var25;
                                  break L39;
                                }
                              }
                            }
                          }
                          if (var26 == 0) {
                            var24 = var34 + "<br>" + sd.a(we.field_l, 102, new String[1]);
                            break L39;
                          } else {
                            var24 = var34 + "<br>" + bh.field_i + var25;
                            break L39;
                          }
                        }
                        L41: {
                          if (param2 != ae.field_c) {
                            break L41;
                          } else {
                            if (!pl.m(99)) {
                              var27 = io.field_c.field_pc;
                              var24 = var24 + "<br>" + sd.a(ff.field_c, 93, new String[1]);
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                        }
                        up.field_o = var24;
                        break L32;
                      } else {
                        L42: {
                          var28 = 255 & io.field_c.field_Eb[var27_int];
                          var29 = 0;
                          if (jm.field_r == null) {
                            break L42;
                          } else {
                            if (null == jm.field_r[var27_int]) {
                              break L42;
                            } else {
                              if (!jm.field_r[var27_int][var28]) {
                                break L42;
                              } else {
                                if (var12.field_Xb) {
                                  break L42;
                                } else {
                                  var29 = 1;
                                  break L42;
                                }
                              }
                            }
                          }
                        }
                        L43: {
                          if (w.field_z == null) {
                            break L43;
                          } else {
                            if (null == w.field_z[var27_int]) {
                              break L43;
                            } else {
                              L44: {
                                var30_int = w.field_z[var27_int][var28];
                                if (var30_int == 0) {
                                  break L44;
                                } else {
                                  if (fe.field_a) {
                                    break L44;
                                  } else {
                                    if (!var12.field_Xb) {
                                      var29 = 1;
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Rb < var30_int) {
                                var29 = 1;
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        L45: {
                          if (pa.field_a == null) {
                            break L45;
                          } else {
                            if (null == pa.field_a[var27_int]) {
                              break L45;
                            } else {
                              L46: {
                                var30_int = pa.field_a[var27_int][var28];
                                if (var30_int == 0) {
                                  break L46;
                                } else {
                                  if (fe.field_a) {
                                    break L46;
                                  } else {
                                    if (!var12.field_Xb) {
                                      var29 = 1;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              if (var30_int <= var12.field_Yb) {
                                break L45;
                              } else {
                                var29 = 1;
                                break L45;
                              }
                            }
                          }
                        }
                        L47: {
                          if (oo.field_e == null) {
                            break L47;
                          } else {
                            if (null == oo.field_e[var27_int]) {
                              break L47;
                            } else {
                              if (0 == (oo.field_e[var27_int][var28] & (var12.field_Ib ^ -1))) {
                                break L47;
                              } else {
                                var29 = 1;
                                break L47;
                              }
                            }
                          }
                        }
                        if (var29 != 0) {
                          var30 = "<col=A00000>" + jk.field_e[var27_int] + "</col>";
                          var25 = var30;
                          var24 = var25;
                          var25 = var30;
                          if (var25 != null) {
                            var25 = var25 + ", " + var30;
                            var24 = var25;
                            var24 = var25;
                            var26 = 1;
                            var27_int++;
                            continue L38;
                          } else {
                            var25 = var30;
                            var27_int++;
                            continue L38;
                          }
                        } else {
                          var27_int++;
                          continue L38;
                        }
                      }
                    }
                  }
                }
              }
            }
            var12 = (uj) (Object) var10.f(1504642273);
            continue L10;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          L1: {
            ec.field_t = 0;
            nc.field_a = param0;
            ti.field_t = param1;
            if (ti.field_t == -4) {
              break L1;
            } else {
              if (1 == (ti.field_t ^ -1)) {
                break L1;
              } else {
                if (4 == (ti.field_t ^ -1)) {
                  break L1;
                } else {
                  if (-1 == (ti.field_t ^ -1)) {
                    break L1;
                  } else {
                    if ((ti.field_t ^ -1) == -13) {
                      break L1;
                    } else {
                      if ((ti.field_t ^ -1) == -18) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
          dg.a(0, (byte) -91);
          break L0;
        }
        L2: {
          if (tk.a((byte) -104, ti.field_t)) {
            L3: {
              var4 = 0;
              if (-13 == (ti.field_t ^ -1)) {
                var4 = -1;
                break L3;
              } else {
                break L3;
              }
            }
            wo.b(-92, ti.field_t).a(2, var4, param2);
            if ((ti.field_t ^ -1) != -13) {
              break L2;
            } else {
              id.a(param2, (byte) 110);
              break L2;
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (param3 == -25528) {
            break L4;
          } else {
            field_c = null;
            break L4;
          }
        }
    }

    final static int a(byte param0) {
        if (param0 != -59) {
            field_a = null;
        }
        return ib.field_g - ko.field_cb;
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        we var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var9 = new we(param0);
          var3 = var9.f(param1 ^ 255);
          var4 = var9.k(0);
          if (var4 < param1) {
            break L0;
          } else {
            L1: {
              if ((up.field_j ^ -1) == -1) {
                break L1;
              } else {
                if (up.field_j >= var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (-1 == (var3 ^ -1)) {
              var17 = new byte[var4];
              var15 = var17;
              var13 = var15;
              var11 = var13;
              var5 = var11;
              var9.a(var17, 0, -80, var4);
              return var5;
            } else {
              L2: {
                var5_int = var9.k(0);
                if (0 > var5_int) {
                  break L2;
                } else {
                  L3: {
                    if (-1 == (up.field_j ^ -1)) {
                      break L3;
                    } else {
                      if (var5_int <= up.field_j) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (1 == var3) {
                      int discarded$1 = q.a(var16, var5_int, param0, var4, 9);
                      break L4;
                    } else {
                      var7 = (Object) (Object) fd.field_b;
                      synchronized (var7) {
                        L5: {
                          fd.field_b.a(param1 ^ -8, var16, var9);
                          break L5;
                        }
                      }
                      break L4;
                    }
                  }
                  return var6;
                }
              }
              throw new RuntimeException();
            }
          }
        }
        throw new RuntimeException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{10, 20, 32, 50};
        field_c = new byte[]{(byte) 1, (byte) 1};
    }
}
