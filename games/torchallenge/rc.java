/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rc extends w {
    static ae field_r;
    static boolean field_u;
    static uj field_t;
    static String field_q;
    static String[] field_s;
    static ka[] field_p;

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            field_p = null;
            field_t = null;
            field_s = null;
            field_r = null;
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "rc.M(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        var33 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = (param3 >> 1) + param5;
              var10 = -(param4 >> 1) + param7;
              var11 = param8 - -(param1 >> 1);
              var12 = param0 - (param6 >> 1);
              var13 = 1;
              var14 = 1;
              var15 = 2048;
              var9_int = var9_int % var15;
              var11 = var11 % var15;
              var16 = var11 - var9_int;
              if (var16 >= 0) {
                break L1;
              } else {
                var13 = -1;
                break L1;
              }
            }
            L2: {
              var16 = var16 * var13;
              if (var16 <= var15 >> 1) {
                break L2;
              } else {
                var13 = -var13;
                var16 = var15 - var16;
                break L2;
              }
            }
            L3: {
              var16 = (var16 >> 1) * var13 + var9_int;
              var16 = var16 % var15;
              var17 = var12 - var10;
              if (var17 < 0) {
                var14 = -1;
                break L3;
              } else {
                break L3;
              }
            }
            var17 = var17 * var14;
            var17 = (var17 >> 1) * var14 + var10;
            var18 = var16 / 32;
            var19 = 256 * (var16 + -(var18 * 32)) / 32;
            var20 = var17 / 64;
            var21 = (-(var20 * 64) + var17) * 256 / 64;
            var22 = -1;
            var23 = 0;
            var24 = 0;
            var25 = ol.field_c[var23][var24][4];
            var27 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  L7: {
                    if (8 <= var27) {
                      break L7;
                    } else {
                      var26 = 1;
                      stackOut_11_0 = 0;
                      stackIn_33_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var33 != 0) {
                        break L6;
                      } else {
                        var28 = stackIn_12_0;
                        L8: while (true) {
                          L9: {
                            if (3 <= var28) {
                              break L9;
                            } else {
                              stackOut_14_0 = ~ol.field_c[var27][var28][4];
                              stackOut_14_1 = -1;
                              stackIn_34_0 = stackOut_14_0;
                              stackIn_34_1 = stackOut_14_1;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              if (var33 != 0) {
                                break L5;
                              } else {
                                L10: {
                                  if (stackIn_15_0 < stackIn_15_1) {
                                    L11: {
                                      if (var25 > ol.field_c[var27][var28][4]) {
                                        var24 = var28;
                                        var23 = var27;
                                        var25 = ol.field_c[var27][var28][4];
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    var26 = 0;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var28++;
                                if (var33 == 0) {
                                  continue L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          L12: {
                            if (var26 != 0) {
                              var22 = var27;
                              if (var33 == 0) {
                                break L7;
                              } else {
                                break L12;
                              }
                            } else {
                              break L12;
                            }
                          }
                          var27++;
                          if (var33 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                }
                stackOut_33_0 = stackIn_33_0;
                stackOut_33_1 = var22;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                break L5;
              }
              L13: {
                if (stackIn_34_0 > stackIn_34_1) {
                  var22 = var23;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var27 = 0;
                ol.field_c[var22][var27][0] = var18;
                ol.field_c[var22][var27][2] = var19;
                ol.field_c[var22][var27][1] = var20;
                ol.field_c[var22][var27][3] = var21;
                ol.field_c[var22][var27][4] = 24;
                if (param2) {
                  break L14;
                } else {
                  rc.c((byte) 127);
                  break L14;
                }
              }
              var31 = var16;
              var32 = var17;
              var27 = 1;
              L15: while (true) {
                L16: {
                  if (3 <= var27) {
                    break L16;
                  } else {
                    var28 = e.b((byte) 57, 32);
                    var29 = e.b((byte) 57, 32);
                    var30 = e.b((byte) 57, 6);
                    var17 = var29 + var32 + -16;
                    ol.field_c[var22][var27][4] = var30 + 24;
                    var16 = -16 + var31 + var28;
                    var18 = var16 / 32;
                    var20 = var17 / 64;
                    var19 = (var16 - 32 * var18) * 256 / 32;
                    ol.field_c[var22][var27][0] = var18;
                    var21 = (var17 + -(64 * var20)) * 256 / 64;
                    ol.field_c[var22][var27][2] = var19;
                    ol.field_c[var22][var27][1] = var20;
                    ol.field_c[var22][var27][3] = var21;
                    var27++;
                    if (var33 == 0) {
                      continue L15;
                    } else {
                      break L16;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var9, "rc.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    rc() {
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        pa var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        qk var5_ref = null;
        qk var6 = null;
        String var6_ref = null;
        String var7 = null;
        qk var7_ref = null;
        int var8 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_58_0 = false;
        int stackIn_65_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_57_0 = false;
        int stackOut_63_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 68) {
                break L1;
              } else {
                rc.b(true);
                break L1;
              }
            }
            var1_ref = id.field_b;
            var2 = var1_ref.j(-126);
            if (var2 != 0) {
              if (var2 != 1) {
                if (var2 == 2) {
                  L2: {
                    if (oj.field_f == 1) {
                      oj.field_f = 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  if (var2 != 3) {
                    if (var2 != 4) {
                      td.a("F1: " + ck.a(-13299), (Throwable) null, (byte) -70);
                      ob.b(-128);
                      break L0;
                    } else {
                      oj.field_f = 1;
                      var3 = var1_ref.b(false);
                      me.field_d = var3.intern();
                      var4 = var1_ref.j(-108);
                      bd.a(-116, var4);
                      return;
                    }
                  } else {
                    L3: {
                      if (oj.field_f != 2) {
                        break L3;
                      } else {
                        oj.field_f = 1;
                        break L3;
                      }
                    }
                    return;
                  }
                }
              } else {
                L4: {
                  if (gl.field_e != null) {
                    break L4;
                  } else {
                    gl.field_e = new aa(128);
                    kf.field_c = 0;
                    break L4;
                  }
                }
                L5: {
                  var3 = var1_ref.b(false);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1_ref.b(false);
                  var5 = var1_ref.b(false);
                  var6 = ri.a(0, var4_ref_String);
                  if (null != var6) {
                    break L6;
                  } else {
                    var6 = ri.a(0, var5);
                    if (var6 == null) {
                      break L6;
                    } else {
                      gl.field_e.a((long)il.a((CharSequence) (Object) var4_ref_String, (byte) 21).hashCode(), (w) (Object) var6, -47);
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var6 == null) {
                    var6 = new qk();
                    gl.field_e.a((long)il.a((CharSequence) (Object) var4_ref_String, (byte) 21).hashCode(), (w) (Object) var6, 121);
                    int fieldTemp$3 = kf.field_c;
                    kf.field_c = kf.field_c + 1;
                    var6.field_ob = fieldTemp$3;
                    rk.field_g.a((da) (Object) var6, -35);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6.field_mb = var3;
                var6.field_F = var4_ref_String;
                var6.a(true);
                var7_ref = (qk) (Object) rk.field_g.c((byte) -7);
                L9: while (true) {
                  L10: {
                    L11: {
                      L12: {
                        L13: {
                          if (var7_ref == null) {
                            break L13;
                          } else {
                            stackOut_57_0 = fd.a(var6, 116, var7_ref);
                            stackIn_65_0 = stackOut_57_0 ? 1 : 0;
                            stackIn_58_0 = stackOut_57_0;
                            if (var8 != 0) {
                              break L12;
                            } else {
                              if (!stackIn_58_0) {
                                break L13;
                              } else {
                                var7_ref = (qk) (Object) rk.field_g.c(-270);
                                if (var8 == 0) {
                                  continue L9;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                        if (var7_ref == null) {
                          break L11;
                        } else {
                          stackOut_63_0 = 52;
                          stackIn_65_0 = stackOut_63_0;
                          break L12;
                        }
                      }
                      na.a((byte) stackIn_65_0, (da) (Object) var7_ref, (da) (Object) var6);
                      if (var8 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                    rk.field_g.a((da) (Object) var6, -86);
                    break L10;
                  }
                  return;
                }
              }
            } else {
              L14: {
                if (mh.field_e == null) {
                  mh.field_e = new aa(128);
                  og.field_a = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var1_ref.j(-107) != 1) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L15;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_15_0 = stackOut_12_0;
                  break L15;
                }
              }
              L16: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1_ref.b(false);
                if (var3_int == 0) {
                  break L16;
                } else {
                  String discarded$4 = var1_ref.b(false);
                  break L16;
                }
              }
              L17: {
                var5_ref = wf.a((byte) -123, var4_ref_String);
                var6_ref = var1_ref.b(false);
                var7 = il.a((CharSequence) (Object) var4_ref_String, (byte) 21);
                if (var7 == null) {
                  var7 = var4_ref_String;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (null != var5_ref) {
                  break L18;
                } else {
                  var5_ref = wf.a((byte) -123, var6_ref);
                  if (var5_ref != null) {
                    mh.field_e.a((long)var7.hashCode(), (w) (Object) var5_ref, -102);
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (null == var5_ref) {
                  var5_ref = new qk();
                  mh.field_e.a((long)var7.hashCode(), (w) (Object) var5_ref, 118);
                  int fieldTemp$5 = og.field_a;
                  og.field_a = og.field_a + 1;
                  var5_ref.field_ob = fieldTemp$5;
                  ie.field_d.a((da) (Object) var5_ref, -42);
                  break L19;
                } else {
                  break L19;
                }
              }
              var5_ref.field_F = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "rc.J(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_143_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        int stackOut_142_0 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_int = 0;
                var2 = 0;
                var3 = 0;
                if (!d.p(-115)) {
                  break L2;
                } else {
                  var4 = eh.field_l;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = jj.field_c;
              break L1;
            }
            L3: {
              ae.field_z = ae.field_z ^ 32;
              ac.field_d = ac.field_d ^ 32;
              if (!t.a(0, var4, 121)) {
                if (0 >= fg.field_N) {
                  break L3;
                } else {
                  if (0 >= of.field_f) {
                    break L3;
                  } else {
                    if (gh.field_x) {
                      break L3;
                    } else {
                      if (qk.field_lb < of.field_f + fg.field_N) {
                        break L3;
                      } else {
                        hf.a(255, param0 + 110, 0);
                        break L3;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (t.a(1, var4, 117)) {
                break L4;
              } else {
                if (of.field_f <= 0) {
                  break L4;
                } else {
                  if (!gh.field_x) {
                    if (~wj.field_a > ~of.field_f) {
                      break L4;
                    } else {
                      if (ea.field_e <= 0) {
                        break L4;
                      } else {
                        hf.a(254, 89, 1);
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (!t.a(2, var4, 126)) {
                if (0 >= gf.a(hd.field_c[vj.field_c], (byte) 78)) {
                  break L5;
                } else {
                  hf.a(253, 13, 2);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (t.a(3, var4, 121)) {
                break L6;
              } else {
                if (gf.a(hd.field_c[vj.field_c], (byte) 78) >= 3) {
                  hf.a(252, param0 ^ -62, 3);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (t.a(4, var4, 117)) {
                break L7;
              } else {
                var5 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (3 <= var5) {
                        break L10;
                      } else {
                        stackOut_50_0 = 3;
                        stackOut_50_1 = gf.a(hd.field_c[var5], (byte) 78);
                        stackIn_58_0 = stackOut_50_0;
                        stackIn_58_1 = stackOut_50_1;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        if (var7 != 0) {
                          break L9;
                        } else {
                          L11: {
                            if (stackIn_51_0 <= stackIn_51_1) {
                              var1_int++;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    stackOut_57_0 = var1_int;
                    stackOut_57_1 = 3;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    break L9;
                  }
                  if (stackIn_58_0 < stackIn_58_1) {
                    break L7;
                  } else {
                    hf.a(251, 121, 4);
                    break L7;
                  }
                }
              }
            }
            L12: {
              if (t.a(5, var4, 123)) {
                break L12;
              } else {
                if (2 > ab.field_d) {
                  break L12;
                } else {
                  hf.a(250, 98, 5);
                  break L12;
                }
              }
            }
            L13: {
              if (t.a(6, var4, 126)) {
                break L13;
              } else {
                if (ab.field_d < 4) {
                  break L13;
                } else {
                  hf.a(249, 55, 6);
                  break L13;
                }
              }
            }
            L14: {
              if (!t.a(7, var4, 113)) {
                if (6 <= ab.field_d) {
                  hf.a(248, 125, 7);
                  break L14;
                } else {
                  break L14;
                }
              } else {
                break L14;
              }
            }
            L15: {
              L16: {
                if (!t.a(8, var4, 116)) {
                  var5 = 0;
                  L17: while (true) {
                    L18: {
                      if (3 <= var5) {
                        break L18;
                      } else {
                        stackOut_85_0 = ~(1 << var5 & hk.field_c[vj.field_c]);
                        stackOut_85_1 = -1;
                        stackIn_96_0 = stackOut_85_0;
                        stackIn_96_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (var7 != 0) {
                          break L15;
                        } else {
                          L19: {
                            if (stackIn_86_0 >= stackIn_86_1) {
                              break L19;
                            } else {
                              var2++;
                              break L19;
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    L20: {
                      if (var2 <= 0) {
                        break L20;
                      } else {
                        hf.a(247, param0 ^ -68, 8);
                        break L20;
                      }
                    }
                    var2 = 0;
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              stackOut_95_0 = 9;
              stackOut_95_1 = var4;
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              break L15;
            }
            L21: {
              if (!t.a(stackIn_96_0, stackIn_96_1, param0 + 196)) {
                var5 = 0;
                L22: while (true) {
                  L23: {
                    L24: {
                      if (var5 >= 3) {
                        break L24;
                      } else {
                        stackOut_101_0 = ~(1 << var5 & hk.field_c[vj.field_c]);
                        stackOut_101_1 = -1;
                        stackIn_108_0 = stackOut_101_0;
                        stackIn_108_1 = stackOut_101_1;
                        stackIn_102_0 = stackOut_101_0;
                        stackIn_102_1 = stackOut_101_1;
                        if (var7 != 0) {
                          break L23;
                        } else {
                          L25: {
                            if (stackIn_102_0 >= stackIn_102_1) {
                              break L25;
                            } else {
                              var2++;
                              break L25;
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L22;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    stackOut_107_0 = 2;
                    stackOut_107_1 = var2;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L23;
                  }
                  L26: {
                    if (stackIn_108_0 <= stackIn_108_1) {
                      hf.a(246, 112, 9);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  var2 = 0;
                  break L21;
                }
              } else {
                break L21;
              }
            }
            L27: {
              if (t.a(10, var4, param0 ^ -45)) {
                break L27;
              } else {
                var5 = 0;
                L28: while (true) {
                  L29: {
                    L30: {
                      if (var5 >= 3) {
                        break L30;
                      } else {
                        stackOut_115_0 = 0;
                        stackOut_115_1 = 1 << var5 & hk.field_c[vj.field_c];
                        stackIn_122_0 = stackOut_115_0;
                        stackIn_122_1 = stackOut_115_1;
                        stackIn_116_0 = stackOut_115_0;
                        stackIn_116_1 = stackOut_115_1;
                        if (var7 != 0) {
                          break L29;
                        } else {
                          L31: {
                            if (stackIn_116_0 >= stackIn_116_1) {
                              break L31;
                            } else {
                              var2++;
                              break L31;
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L28;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    stackOut_121_0 = ~var2;
                    stackOut_121_1 = -4;
                    stackIn_122_0 = stackOut_121_0;
                    stackIn_122_1 = stackOut_121_1;
                    break L29;
                  }
                  L32: {
                    if (stackIn_122_0 <= stackIn_122_1) {
                      hf.a(245, 86, 10);
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  var2 = 0;
                  break L27;
                }
              }
            }
            if (param0 == -82) {
              L33: {
                if (!t.a(11, var4, 127)) {
                  var5 = 0;
                  L34: while (true) {
                    stackOut_132_0 = 3;
                    stackOut_132_1 = var5;
                    stackIn_133_0 = stackOut_132_0;
                    stackIn_133_1 = stackOut_132_1;
                    L35: while (true) {
                      L36: {
                        L37: {
                          if (stackIn_133_0 <= stackIn_133_1) {
                            break L37;
                          } else {
                            stackOut_134_0 = 0;
                            stackIn_143_0 = stackOut_134_0;
                            stackIn_135_0 = stackOut_134_0;
                            if (var7 != 0) {
                              break L36;
                            } else {
                              var6 = stackIn_135_0;
                              L38: while (true) {
                                L39: {
                                  if (var6 >= 3) {
                                    break L39;
                                  } else {
                                    stackOut_137_0 = ~(hk.field_c[var5] & 1 << var6);
                                    stackOut_137_1 = -1;
                                    stackIn_133_0 = stackOut_137_0;
                                    stackIn_133_1 = stackOut_137_1;
                                    stackIn_138_0 = stackOut_137_0;
                                    stackIn_138_1 = stackOut_137_1;
                                    if (var7 != 0) {
                                      continue L35;
                                    } else {
                                      L40: {
                                        if (stackIn_138_0 >= stackIn_138_1) {
                                          break L40;
                                        } else {
                                          var2++;
                                          break L40;
                                        }
                                      }
                                      var6++;
                                      if (var7 == 0) {
                                        continue L38;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                                var5++;
                                if (var7 == 0) {
                                  continue L34;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                        }
                        stackOut_142_0 = -10;
                        stackIn_143_0 = stackOut_142_0;
                        break L36;
                      }
                      L41: {
                        if (stackIn_143_0 < ~var2) {
                          break L41;
                        } else {
                          hf.a(244, 113, 11);
                          break L41;
                        }
                      }
                      var2 = 0;
                      break L33;
                    }
                  }
                } else {
                  break L33;
                }
              }
              L42: {
                if (t.a(12, var4, 117)) {
                  break L42;
                } else {
                  if (rk.a((byte) -119, pi.field_d[vj.field_c]) < 20) {
                    break L42;
                  } else {
                    hf.a(243, param0 + 172, 12);
                    break L42;
                  }
                }
              }
              L43: {
                if (t.a(13, var4, 113)) {
                  break L43;
                } else {
                  if (30 > rk.a((byte) 118, pi.field_d[vj.field_c])) {
                    break L43;
                  } else {
                    hf.a(242, 101, 13);
                    break L43;
                  }
                }
              }
              L44: {
                if (t.a(14, var4, 121)) {
                  break L44;
                } else {
                  var5 = 0;
                  L45: while (true) {
                    L46: {
                      L47: {
                        if (var5 >= 3) {
                          break L47;
                        } else {
                          var3 = var3 + rk.a((byte) 49, pi.field_d[var5]);
                          var5++;
                          if (var7 != 0) {
                            break L46;
                          } else {
                            if (var7 == 0) {
                              continue L45;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                      if (90 <= var3) {
                        break L46;
                      } else {
                        break L44;
                      }
                    }
                    hf.a(241, 29, 14);
                    break L44;
                  }
                }
              }
              L48: {
                if (t.a(15, var4, param0 + 196)) {
                  break L48;
                } else {
                  if (!gh.field_m) {
                    break L48;
                  } else {
                    if (ea.field_e > 0) {
                      hf.a(240, 100, 15);
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                }
              }
              L49: {
                if (t.a(16, var4, 116)) {
                  break L49;
                } else {
                  if (g.a(125, 0)) {
                    if (qh.field_J < 150) {
                      break L49;
                    } else {
                      var5 = 16;
                      var6 = 255 + -var5;
                      hf.a(var6, param0 + 97, var5);
                      break L49;
                    }
                  } else {
                    break L49;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "rc.L(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == -2) {
              stackOut_3_0 = lh.e(0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 89;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var4, "rc.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = null;
        field_u = false;
        field_q = "Back";
        ka discarded$0 = new ka(96, 96);
        field_s = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
