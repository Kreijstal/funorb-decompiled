/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    int field_c;
    static boolean field_f;
    static il field_a;
    int[] field_d;
    static String field_e;
    int field_b;

    final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ri) this).field_d == null) {
                break L1;
              } else {
                if (((ri) this).field_d.length != 0) {
                  if (param0 > 83) {
                    var3_int = 1;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (((ri) this).field_d.length <= var3_int) {
                            break L4;
                          } else {
                            stackOut_12_0 = ((ri) this).field_d[-1 + var3_int] - -((ri) this).field_d[var3_int] >> 1;
                            stackOut_12_1 = param1;
                            stackIn_20_0 = stackOut_12_0;
                            stackIn_20_1 = stackOut_12_1;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            if (var4 != 0) {
                              break L3;
                            } else {
                              if (stackIn_13_0 <= stackIn_13_1) {
                                var3_int++;
                                if (var4 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              } else {
                                stackOut_16_0 = var3_int + -1;
                                stackIn_17_0 = stackOut_16_0;
                                return stackIn_17_0;
                              }
                            }
                          }
                        }
                        stackOut_19_0 = -1;
                        stackOut_19_1 = ((ri) this).field_d.length;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L3;
                      }
                      stackOut_20_0 = stackIn_20_0 + stackIn_20_1;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  } else {
                    stackOut_8_0 = -89;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "ri.A(" + param0 + 44 + param1 + 41);
        }
        return stackIn_21_0;
    }

    final static km b(byte param0) {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        km stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        km stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 >= 27) {
              stackOut_3_0 = ao.d(true);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (km) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "ri.D(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((ri) this).field_c = 22;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ri) this).field_d == null) {
                  break L3;
                } else {
                  if (((ri) this).field_d.length == 0) {
                    break L3;
                  } else {
                    stackOut_7_0 = ((ri) this).field_d[((ri) this).field_d.length + -1];
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "ri.E(" + param0 + 41);
        }
        return stackIn_10_0;
    }

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_e = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "ri.C(" + 2 + 41);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        hg var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        gh var6 = null;
        String var7 = null;
        gh var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = sh.field_qb;
            var2 = var1_ref.g(11132);
            if (var2 != 0) {
              if (var2 != 1) {
                if (var2 != 2) {
                  if (var2 == 3) {
                    L1: {
                      if (oa.field_q != 2) {
                        break L1;
                      } else {
                        oa.field_q = 1;
                        break L1;
                      }
                    }
                    return;
                  } else {
                    if (4 == var2) {
                      oa.field_q = 1;
                      var3 = var1_ref.h(-122);
                      wl.field_a = var3.intern();
                      var4 = var1_ref.g(11132);
                      nn.a(true, var4);
                      return;
                    } else {
                      L2: {
                        int discarded$4 = 1;
                        int discarded$5 = 1;
                        en.a("F1: " + rg.a(), (Throwable) null);
                        if (param0 > 44) {
                          break L2;
                        } else {
                          ri.a((byte) -47);
                          break L2;
                        }
                      }
                      tn.a(false);
                      break L0;
                    }
                  }
                } else {
                  L3: {
                    if (oa.field_q != 1) {
                      break L3;
                    } else {
                      oa.field_q = 2;
                      break L3;
                    }
                  }
                  return;
                }
              } else {
                L4: {
                  if (oa.field_h == null) {
                    oa.field_h = new kf(128);
                    sg.field_j = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var3 = var1_ref.h(-128);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1_ref.h(-119);
                  var5 = var1_ref.h(-120);
                  var6 = j.a(0, var4_ref_String);
                  if (null == var6) {
                    var6 = j.a(0, var5);
                    if (null != var6) {
                      oa.field_h.a((long)c.a((CharSequence) (Object) var4_ref_String, true).hashCode(), (wb) (Object) var6, 30804);
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (null != var6) {
                    break L7;
                  } else {
                    var6 = new gh();
                    oa.field_h.a((long)c.a((CharSequence) (Object) var4_ref_String, true).hashCode(), (wb) (Object) var6, 30804);
                    int fieldTemp$6 = sg.field_j;
                    sg.field_j = sg.field_j + 1;
                    var6.field_Nb = fieldTemp$6;
                    co.field_f.a((l) (Object) var6, (byte) -96);
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
                var6.field_Hb = var4_ref_String;
                var6.field_Jb = var5;
                var6.field_Pb = var3;
                var6.a(false);
                var7_ref = (gh) (Object) co.field_f.a((byte) -27);
                L9: while (true) {
                  L10: {
                    if (null == var7_ref) {
                      break L10;
                    } else {
                      if (!wc.a((byte) 23, var6, var7_ref)) {
                        break L10;
                      } else {
                        var7_ref = (gh) (Object) co.field_f.a(16213);
                        if (var9 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (null != var7_ref) {
                        break L12;
                      } else {
                        co.field_f.a((l) (Object) var6, (byte) -77);
                        if (var9 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    td.a((l) (Object) var7_ref, (byte) -61, (l) (Object) var6);
                    break L11;
                  }
                  return;
                }
              }
            } else {
              L13: {
                if (null != ie.field_a) {
                  break L13;
                } else {
                  ie.field_a = new kf(128);
                  mj.field_z = 0;
                  break L13;
                }
              }
              L14: {
                if (1 != var1_ref.g(11132)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L14;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L14;
                }
              }
              L15: {
                L16: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1_ref.h(-122);
                  if (var3_int == 0) {
                    break L16;
                  } else {
                    var5 = var1_ref.h(-118);
                    if (var9 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L15;
              }
              L17: {
                var6 = kh.a((byte) 119, var4_ref_String);
                var7 = var1_ref.h(-119);
                var8 = c.a((CharSequence) (Object) var4_ref_String, true);
                if (null != var8) {
                  break L17;
                } else {
                  var8 = var4_ref_String;
                  break L17;
                }
              }
              L18: {
                if (var6 == null) {
                  var6 = kh.a((byte) 42, var7);
                  if (var6 == null) {
                    break L18;
                  } else {
                    ie.field_a.a((long)var8.hashCode(), (wb) (Object) var6, 30804);
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              L19: {
                if (var6 != null) {
                  break L19;
                } else {
                  var6 = new gh();
                  ie.field_a.a((long)var8.hashCode(), (wb) (Object) var6, 30804);
                  int fieldTemp$7 = mj.field_z;
                  mj.field_z = mj.field_z + 1;
                  var6.field_Nb = fieldTemp$7;
                  bd.field_c.a((l) (Object) var6, (byte) -58);
                  break L19;
                }
              }
              var6.field_Hb = var4_ref_String;
              var6.field_Ob = var5;
              var6.field_Jb = var7;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "ri.B(" + param0 + 41);
        }
    }

    ri(int param0, int param1, int param2) {
        try {
            ((ri) this).field_b = param1;
            ((ri) this).field_c = param0;
            ((ri) this).field_d = new int[param2 - -1];
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ri.<init>(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Your game";
    }
}
