/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends ba {
    private int field_j;
    private nb field_l;
    private gl field_m;
    private byte[] field_n;
    static int field_q;
    private dk field_y;
    private sb field_e;
    private int field_k;
    private sj field_p;
    private byte[] field_x;
    private ln field_i;
    static String field_u;
    private gl field_t;
    private int field_r;
    private int field_g;
    private p field_o;
    private boolean field_s;
    static kf field_h;
    private p field_f;
    private boolean field_v;
    private boolean field_d;
    private long field_w;

    final static void a(byte param0, eh param1) {
        RuntimeException var2 = null;
        km var3 = null;
        Object var4 = null;
        km var6 = null;
        km var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              qg.field_u = sn.a(param1, "display_name_changed", "basic", false);
              ve.field_q = new ao(0L, gg.field_K, dc.field_Z, hm.field_a);
              lg.field_a = new ao(0L, gg.field_K, kh.field_a, a.field_A);
              dg.field_E = new km(0L, (km) null);
              ee.field_e = new km(0L, ti.field_h);
              ee.field_e.field_lb = 1;
              se.field_c = new km(0L, ag.field_d, tl.field_h);
              if (param0 <= -16) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$1 = oa.a(90, (String) null, -60L, 66, (int[]) null);
                break L1;
              }
            }
            wb.field_m = new km(0L, he.field_Jb, ke.field_s);
            tf.field_c = new km(0L, ma.field_e);
            dg.field_E.a(0, ee.field_e);
            dg.field_E.a(0, se.field_c);
            dg.field_E.a(0, wb.field_m);
            dg.field_E.a(0, (km) (Object) ve.field_q);
            dg.field_E.a(0, tf.field_c);
            ve.field_q.field_Ib.field_Eb.b(18003, ti.field_h);
            ve.field_q.field_Ib.field_Eb.field_D = 1;
            var6 = ve.field_q.field_Ib.field_Eb;
            var7 = var6;
            var7.field_lb = 1;
            lg.field_a.field_Ib.field_Eb.b(18003, ti.field_h);
            lg.field_a.field_Ib.field_Eb.field_D = 1;
            var3 = lg.field_a.field_Ib.field_Eb;
            var3.field_lb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("oa.L(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static void a(int param0, la param1, int param2) {
        hg var3 = null;
        try {
            var3 = gk.field_g;
            var3.g(param0, 8);
            if (param2 < 94) {
                Object var4 = null;
                oa.a((java.applet.Applet) null, -86);
            }
            var3.a(param1.field_j, -69);
            var3.a((byte) 59, param1.field_o);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "oa.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void c(byte param0) {
        field_h = null;
        field_u = null;
        int var1 = -86 % ((-52 - param0) / 61);
    }

    final int a(int param0, int param1) {
        nb var3 = (nb) (Object) ((oa) this).field_i.a((long)param1, -14905);
        if (!(var3 == null)) {
            return var3.e(0);
        }
        if (param0 != -7) {
            int discarded$0 = ((oa) this).a(-68, 0);
            return 0;
        }
        return 0;
    }

    final sj a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3_ref_RuntimeException = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        if (((oa) this).field_p != null) {
          return ((oa) this).field_p;
        } else {
          L0: {
            if (((oa) this).field_l != null) {
              break L0;
            } else {
              if (!((oa) this).field_y.c((byte) 113)) {
                ((oa) this).field_l = (nb) (Object) ((oa) this).field_y.a((byte) 0, ((oa) this).field_r, true, -1150070304, 255);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((oa) this).field_l.field_t) {
            L1: {
              var5 = ((oa) this).field_l.b((byte) 39);
              var2 = var5;
              if (!(((oa) this).field_l instanceof bl)) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((oa) this).field_p = new sj(var5, ((oa) this).field_k, ((oa) this).field_x);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref_RuntimeException = decompiledCaughtException;
                    ((oa) this).field_y.d((byte) 83);
                    ((oa) this).field_p = null;
                    if (!((oa) this).field_y.c((byte) 113)) {
                      break L3;
                    } else {
                      ((oa) this).field_l = null;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        return null;
                      }
                    }
                  }
                  ((oa) this).field_l = (nb) (Object) ((oa) this).field_y.a((byte) 0, ((oa) this).field_r, true, -1150070304, 255);
                  return null;
                }
                if (((oa) this).field_t == null) {
                  break L1;
                } else {
                  bl discarded$1 = ((oa) this).field_e.a(((oa) this).field_t, var5, (byte) -128, ((oa) this).field_r);
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      ((oa) this).field_p = new sj(var5, ((oa) this).field_k, ((oa) this).field_x);
                      if (((oa) this).field_p.field_a != ((oa) this).field_j) {
                        throw new RuntimeException();
                      } else {
                        break L4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3_ref_RuntimeException = decompiledCaughtException;
                    ((oa) this).field_p = null;
                    if (((oa) this).field_y.c((byte) 113)) {
                      break L5;
                    } else {
                      ((oa) this).field_l = (nb) (Object) ((oa) this).field_y.a((byte) 0, ((oa) this).field_r, true, -1150070304, 255);
                      if (var4 != 0) {
                        break L5;
                      } else {
                        return null;
                      }
                    }
                  }
                  ((oa) this).field_l = null;
                  return null;
                }
                break L1;
              }
            }
            L6: {
              ((oa) this).field_l = null;
              if (((oa) this).field_m == null) {
                break L6;
              } else {
                ((oa) this).field_n = new byte[((oa) this).field_p.field_v];
                break L6;
              }
            }
            var3 = 48 % ((param0 - -34) / 47);
            return ((oa) this).field_p;
          } else {
            return null;
          }
        }
    }

    private final nb a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_50_0 = 0;
        byte stackIn_50_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        Object stackIn_97_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        Object stackOut_96_0 = null;
        byte stackOut_49_0 = 0;
        byte stackOut_49_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        L0: {
          var10 = Virogrid.field_F ? 1 : 0;
          var4 = (Object) (Object) (nb) (Object) ((oa) this).field_i.a((long)param2, -14905);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (((nb) var4).field_w) {
                break L0;
              } else {
                if (((nb) var4).field_t) {
                  ((nb) var4).a(false);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              L3: {
                if (param1 != 0) {
                  break L3;
                } else {
                  L4: {
                    if (((oa) this).field_m == null) {
                      break L4;
                    } else {
                      if (((oa) this).field_n[param2] == -1) {
                        break L4;
                      } else {
                        var4 = (Object) (Object) ((oa) this).field_e.a(param2, -16578, ((oa) this).field_m);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (!((oa) this).field_y.c((byte) 113)) {
                    var4 = (Object) (Object) ((oa) this).field_y.a((byte) 2, param2, true, param0 ^ 1150071165, ((oa) this).field_r);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (param1 == 1) {
                if (null != ((oa) this).field_m) {
                  var4 = (Object) (Object) ((oa) this).field_e.a((byte) 116, param2, ((oa) this).field_m);
                  break L2;
                } else {
                  throw new RuntimeException();
                }
              } else {
                if (param1 != 2) {
                  throw new RuntimeException();
                } else {
                  if (((oa) this).field_m == null) {
                    throw new RuntimeException();
                  } else {
                    if (((oa) this).field_n[param2] != -1) {
                      throw new RuntimeException();
                    } else {
                      if (!((oa) this).field_y.c(20)) {
                        var4 = (Object) (Object) ((oa) this).field_y.a((byte) 2, param2, false, -1150070304, ((oa) this).field_r);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
                    }
                  }
                }
              }
            }
            ((oa) this).field_i.a((l) var4, (byte) 96, (long)param2);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 == -8035) {
          if (!((nb) var4).field_t) {
            var5 = ((nb) var4).b((byte) 39);
            if (var4 instanceof bl) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if (var5.length > 2) {
                        qn.field_S.reset();
                        qn.field_S.update(var5, 0, var5.length - 2);
                        var6_int = (int)qn.field_S.getValue();
                        if (((oa) this).field_p.field_m[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L7: {
                            L8: {
                              if (((oa) this).field_p.field_p == null) {
                                break L8;
                              } else {
                                if (((oa) this).field_p.field_p[param2] == null) {
                                  break L8;
                                } else {
                                  var7_ref_byte__ = ((oa) this).field_p.field_p[param2];
                                  var8 = ug.a(var5, -2 + var5.length, 0, false);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (var9 >= 64) {
                                      break L8;
                                    } else {
                                      stackOut_82_0 = ~var7_ref_byte__[var9];
                                      stackOut_82_1 = ~var8[var9];
                                      stackIn_87_0 = stackOut_82_0;
                                      stackIn_87_1 = stackOut_82_1;
                                      stackIn_83_0 = stackOut_82_0;
                                      stackIn_83_1 = stackOut_82_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_83_0 == stackIn_83_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_86_0 = 255 & var5[var5.length + -1];
                            stackOut_86_1 = var5[var5.length - 2] << 8 & 65280;
                            stackIn_87_0 = stackOut_86_0;
                            stackIn_87_1 = stackOut_86_1;
                            break L7;
                          }
                          var7 = stackIn_87_0 + stackIn_87_1;
                          if (var7 == (((oa) this).field_p.field_f[param2] & 65535)) {
                            L10: {
                              if (((oa) this).field_n[param2] == 1) {
                                break L10;
                              } else {
                                L11: {
                                  if (((oa) this).field_n[param2] != 0) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((oa) this).field_n[param2] = (byte) 1;
                                break L10;
                              }
                            }
                            L12: {
                              if (!((nb) var4).field_w) {
                                ((nb) var4).a(false);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            stackOut_96_0 = var4;
                            stackIn_97_0 = stackOut_96_0;
                            break L5;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((oa) this).field_n[param2] = (byte) -1;
                ((nb) var4).a(false);
                if (((nb) var4).field_w) {
                  L13: {
                    if (!((oa) this).field_y.c((byte) 113)) {
                      var4 = (Object) (Object) ((oa) this).field_y.a((byte) 2, param2, true, param0 + -1150062269, ((oa) this).field_r);
                      ((oa) this).field_i.a((l) var4, (byte) 60, (long)param2);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  return null;
                } else {
                  return null;
                }
              }
              return (nb) (Object) stackIn_97_0;
            } else {
              try {
                L14: {
                  L15: {
                    if (var5 == null) {
                      break L15;
                    } else {
                      if (var5.length > 2) {
                        qn.field_S.reset();
                        qn.field_S.update(var5, 0, -2 + var5.length);
                        var6_int = (int)qn.field_S.getValue();
                        if (((oa) this).field_p.field_m[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L16: {
                            L17: {
                              if (null == ((oa) this).field_p.field_p) {
                                break L17;
                              } else {
                                if (((oa) this).field_p.field_p[param2] != null) {
                                  var7_ref_byte__ = ((oa) this).field_p.field_p[param2];
                                  var8 = ug.a(var5, var5.length - 2, 0, false);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (var9 >= 64) {
                                      break L17;
                                    } else {
                                      stackOut_49_0 = var8[var9];
                                      stackOut_49_1 = var7_ref_byte__[var9];
                                      stackIn_65_0 = stackOut_49_0;
                                      stackIn_65_1 = stackOut_49_1;
                                      stackIn_50_0 = stackOut_49_0;
                                      stackIn_50_1 = stackOut_49_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 1;
                                        break L14;
                                      } else {
                                        if (stackIn_50_0 != stackIn_50_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((oa) this).field_y.field_l = 0;
                                  ((oa) this).field_y.field_b = 0;
                                  break L16;
                                }
                              }
                            }
                            ((oa) this).field_y.field_l = 0;
                            ((oa) this).field_y.field_b = 0;
                            break L16;
                          }
                          decompiledRegionSelector0 = 0;
                          break L14;
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L19: {
                  var6 = (RuntimeException) (Object) decompiledCaughtException;
                  ((oa) this).field_y.d((byte) 102);
                  ((nb) var4).a(false);
                  if (((nb) var4).field_w) {
                    if (!((oa) this).field_y.c((byte) 113)) {
                      var4 = (Object) (Object) ((oa) this).field_y.a((byte) 2, param2, true, param0 ^ 1150071165, ((oa) this).field_r);
                      ((oa) this).field_i.a((l) var4, (byte) 14, (long)param2);
                      break L19;
                    } else {
                      break L19;
                    }
                  } else {
                    break L19;
                  }
                }
                return null;
              }
              L20: {
                L21: {
                  if (decompiledRegionSelector0 == 0) {
                    var5[-2 + var5.length] = (byte)(((oa) this).field_p.field_f[param2] >>> 8);
                    var5[var5.length + -1] = (byte)((oa) this).field_p.field_f[param2];
                    if (null != ((oa) this).field_m) {
                      bl discarded$1 = ((oa) this).field_e.a(((oa) this).field_m, var5, (byte) -126, param2);
                      stackOut_64_0 = -2;
                      stackOut_64_1 = ~((oa) this).field_n[param2];
                      stackIn_65_0 = stackOut_64_0;
                      stackIn_65_1 = stackOut_64_1;
                      break L21;
                    } else {
                      break L20;
                    }
                  } else {
                    break L21;
                  }
                }
                if (stackIn_65_0 == stackIn_65_1) {
                  break L20;
                } else {
                  ((oa) this).field_n[param2] = (byte) 1;
                  break L20;
                }
              }
              L22: {
                if (!((nb) var4).field_w) {
                  ((nb) var4).a(false);
                  break L22;
                } else {
                  break L22;
                }
              }
              return (nb) var4;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        nb var2 = null;
        l var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_32_0 = 0;
        byte stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_31_0 = 0;
        byte stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        byte stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        L0: {
          L1: {
            var5 = Virogrid.field_F ? 1 : 0;
            if (((oa) this).field_o != null) {
              if (null == ((oa) this).a((byte) -89)) {
                return;
              } else {
                L2: {
                  if (!((oa) this).field_s) {
                    break L2;
                  } else {
                    var2_int = 1;
                    var3 = ((oa) this).field_o.a((byte) -75);
                    L3: while (true) {
                      L4: {
                        L5: {
                          L6: {
                            if (var3 == null) {
                              break L6;
                            } else {
                              var4 = (int)var3.field_d;
                              stackOut_8_0 = -1;
                              stackOut_8_1 = ~((oa) this).field_n[var4];
                              stackIn_17_0 = stackOut_8_0;
                              stackIn_17_1 = stackOut_8_1;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              if (var5 != 0) {
                                L7: while (true) {
                                  if (stackIn_17_0 >= stackIn_17_1) {
                                    break L5;
                                  } else {
                                    stackOut_18_0 = ((oa) this).field_p.field_n[((oa) this).field_g];
                                    stackIn_32_0 = stackOut_18_0;
                                    stackIn_19_0 = stackOut_18_0;
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      L8: {
                                        L9: {
                                          if (stackIn_19_0 == 0) {
                                            ((oa) this).field_g = ((oa) this).field_g + 1;
                                            if (var5 == 0) {
                                              break L8;
                                            } else {
                                              break L9;
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                        L10: {
                                          if (((oa) this).field_e.field_e >= 250) {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L5;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if (((oa) this).field_n[((oa) this).field_g] != 0) {
                                            break L11;
                                          } else {
                                            nb discarded$6 = this.a(-8035, 1, ((oa) this).field_g);
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (((oa) this).field_n[((oa) this).field_g] == 0) {
                                            var3 = new l();
                                            var3.field_d = (long)((oa) this).field_g;
                                            ((oa) this).field_o.a(var3, (byte) -37);
                                            var2_int = 0;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        ((oa) this).field_g = ((oa) this).field_g + 1;
                                        if (var5 == 0) {
                                          break L8;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      stackOut_16_0 = ((oa) this).field_g;
                                      stackOut_16_1 = ((oa) this).field_p.field_n.length;
                                      stackIn_17_0 = stackOut_16_0;
                                      stackIn_17_1 = stackOut_16_1;
                                      continue L7;
                                    }
                                  }
                                }
                              } else {
                                L13: {
                                  if (stackIn_9_0 != stackIn_9_1) {
                                    break L13;
                                  } else {
                                    nb discarded$7 = this.a(param0 + -8007, 1, var4);
                                    break L13;
                                  }
                                }
                                L14: {
                                  L15: {
                                    if (((oa) this).field_n[var4] != 0) {
                                      break L15;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L14;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var3.a(false);
                                  break L14;
                                }
                                var3 = ((oa) this).field_o.a(16213);
                                if (var5 == 0) {
                                  continue L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L16: while (true) {
                            stackOut_133_0 = ((oa) this).field_g;
                            stackOut_133_1 = ((oa) this).field_p.field_n.length;
                            stackIn_131_0 = stackOut_133_0;
                            stackIn_131_1 = stackOut_133_1;
                            if (stackIn_131_0 >= stackIn_131_1) {
                              break L5;
                            } else {
                              stackOut_129_0 = ((oa) this).field_p.field_n[((oa) this).field_g];
                              stackIn_32_0 = stackOut_129_0;
                              stackIn_130_0 = stackOut_129_0;
                              if (var5 != 0) {
                                break L4;
                              } else {
                                stackOut_130_0 = stackIn_130_0;
                                stackIn_127_0 = stackOut_130_0;
                                L17: {
                                  if (stackIn_127_0 == 0) {
                                    ((oa) this).field_g = ((oa) this).field_g + 1;
                                    if (var5 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (((oa) this).field_e.field_e >= 250) {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L18;
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (((oa) this).field_n[((oa) this).field_g] != 0) {
                                    break L19;
                                  } else {
                                    nb discarded$8 = this.a(-8035, 1, ((oa) this).field_g);
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (((oa) this).field_n[((oa) this).field_g] == 0) {
                                    var3 = new l();
                                    var3.field_d = (long)((oa) this).field_g;
                                    ((oa) this).field_o.a(var3, (byte) -37);
                                    var2_int = 0;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                ((oa) this).field_g = ((oa) this).field_g + 1;
                                if (var5 == 0) {
                                  continue L16;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        stackOut_31_0 = var2_int;
                        stackIn_32_0 = stackOut_31_0;
                        break L4;
                      }
                      L21: {
                        if (stackIn_32_0 == 0) {
                          break L21;
                        } else {
                          ((oa) this).field_s = false;
                          ((oa) this).field_g = 0;
                          break L21;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L22: {
                  if (!((oa) this).field_v) {
                    break L22;
                  } else {
                    var2_int = 1;
                    var3 = ((oa) this).field_o.a((byte) -84);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (var3 == null) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_38_0 = ((oa) this).field_n[var4];
                            stackOut_38_1 = 1;
                            stackIn_47_0 = stackOut_38_0;
                            stackIn_47_1 = stackOut_38_1;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_47_0 >= stackIn_47_1) {
                                  break L24;
                                } else {
                                  stackOut_48_0 = 0;
                                  stackOut_48_1 = ((oa) this).field_p.field_n[((oa) this).field_g];
                                  stackIn_65_0 = stackOut_48_0;
                                  stackIn_65_1 = stackOut_48_1;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackIn_49_1 = stackOut_48_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    L27: {
                                      L28: {
                                        if (stackIn_49_0 != stackIn_49_1) {
                                          break L28;
                                        } else {
                                          ((oa) this).field_g = ((oa) this).field_g + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (((oa) this).field_y.c(20)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (1 == ((oa) this).field_n[((oa) this).field_g]) {
                                          break L30;
                                        } else {
                                          nb discarded$9 = this.a(-8035, 2, ((oa) this).field_g);
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (1 == ((oa) this).field_n[((oa) this).field_g]) {
                                          break L31;
                                        } else {
                                          var3 = new l();
                                          var3.field_d = (long)((oa) this).field_g;
                                          var2_int = 0;
                                          ((oa) this).field_o.a(var3, (byte) -112);
                                          break L31;
                                        }
                                      }
                                      ((oa) this).field_g = ((oa) this).field_g + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_46_0 = ((oa) this).field_g;
                                    stackOut_46_1 = ((oa) this).field_p.field_n.length;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_39_0 == stackIn_39_1) {
                                  break L32;
                                } else {
                                  nb discarded$10 = this.a(-8035, 2, var4);
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (1 == ((oa) this).field_n[var4]) {
                                    break L34;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var3.a(false);
                                break L33;
                              }
                              var3 = ((oa) this).field_o.a(param0 ^ -16207);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_109_0 = ((oa) this).field_g;
                          stackOut_109_1 = ((oa) this).field_p.field_n.length;
                          stackIn_107_0 = stackOut_109_0;
                          stackIn_107_1 = stackOut_109_1;
                          if (stackIn_107_0 >= stackIn_107_1) {
                            break L24;
                          } else {
                            stackOut_105_0 = 0;
                            stackOut_105_1 = ((oa) this).field_p.field_n[((oa) this).field_g];
                            stackIn_65_0 = stackOut_105_0;
                            stackIn_65_1 = stackOut_105_1;
                            stackIn_106_0 = stackOut_105_0;
                            stackIn_106_1 = stackOut_105_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              stackOut_106_0 = stackIn_106_0;
                              stackOut_106_1 = stackIn_106_1;
                              stackIn_103_0 = stackOut_106_0;
                              stackIn_103_1 = stackOut_106_1;
                              L36: {
                                if (stackIn_103_0 != stackIn_103_1) {
                                  break L36;
                                } else {
                                  ((oa) this).field_g = ((oa) this).field_g + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                if (((oa) this).field_y.c(20)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                } else {
                                  break L37;
                                }
                              }
                              L38: {
                                if (1 == ((oa) this).field_n[((oa) this).field_g]) {
                                  break L38;
                                } else {
                                  nb discarded$11 = this.a(-8035, 2, ((oa) this).field_g);
                                  break L38;
                                }
                              }
                              L39: {
                                if (1 == ((oa) this).field_n[((oa) this).field_g]) {
                                  break L39;
                                } else {
                                  var3 = new l();
                                  var3.field_d = (long)((oa) this).field_g;
                                  var2_int = 0;
                                  ((oa) this).field_o.a(var3, (byte) -112);
                                  break L39;
                                }
                              }
                              ((oa) this).field_g = ((oa) this).field_g + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      L40: {
                        if (var2_int == 0) {
                          break L40;
                        } else {
                          ((oa) this).field_v = false;
                          ((oa) this).field_g = 0;
                          break L40;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                ((oa) this).field_o = null;
                break L1;
              }
            } else {
              break L1;
            }
          }
          stackOut_64_0 = param0;
          stackOut_64_1 = -28;
          stackIn_65_0 = stackOut_64_0;
          stackIn_65_1 = stackOut_64_1;
          break L0;
        }
        L41: {
          if (stackIn_65_0 == stackIn_65_1) {
            break L41;
          } else {
            ((oa) this).field_p = null;
            break L41;
          }
        }
        L42: {
          if (!((oa) this).field_d) {
            break L42;
          } else {
            if (((oa) this).field_w <= hc.a(-9986)) {
              var2 = (nb) (Object) ((oa) this).field_i.a((byte) 19);
              L43: while (true) {
                L44: {
                  L45: {
                    if (var2 == null) {
                      break L45;
                    } else {
                      if (var5 != 0) {
                        break L44;
                      } else {
                        L46: {
                          L47: {
                            if (!var2.field_t) {
                              break L47;
                            } else {
                              if (var5 == 0) {
                                break L46;
                              } else {
                                break L47;
                              }
                            }
                          }
                          L48: {
                            if (var2.field_v) {
                              break L48;
                            } else {
                              var2.field_v = true;
                              if (var5 == 0) {
                                break L46;
                              } else {
                                break L48;
                              }
                            }
                          }
                          if (!var2.field_w) {
                            throw new RuntimeException();
                          } else {
                            var2.a(false);
                            break L46;
                          }
                        }
                        var2 = (nb) (Object) ((oa) this).field_i.a(75);
                        if (var5 == 0) {
                          continue L43;
                        } else {
                          break L45;
                        }
                      }
                    }
                  }
                  ((oa) this).field_w = 1000L + hc.a(-9986);
                  break L44;
                }
                break L42;
              }
            } else {
              break L42;
            }
          }
        }
    }

    final void c(int param0) {
        l var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (null == ((oa) this).field_o) {
          return;
        } else {
          if (null == ((oa) this).a((byte) 63)) {
            return;
          } else {
            L0: {
              if (param0 == 0) {
                break L0;
              } else {
                byte[] discarded$6 = ((oa) this).b(-4, -120);
                break L0;
              }
            }
            var2 = ((oa) this).field_f.a((byte) -82);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_d;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (~((oa) this).field_p.field_v >= ~var3) {
                              break L5;
                            } else {
                              if (((oa) this).field_p.field_n[var3] != 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.a(false);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (0 != ((oa) this).field_n[var3]) {
                          break L6;
                        } else {
                          nb discarded$7 = this.a(param0 + -8035, 1, var3);
                          break L6;
                        }
                      }
                      L7: {
                        if (((oa) this).field_n[var3] != -1) {
                          break L7;
                        } else {
                          nb discarded$8 = this.a(-8035, 2, var3);
                          break L7;
                        }
                      }
                      if (1 == ((oa) this).field_n[var3]) {
                        var2.a(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2 = ((oa) this).field_f.a(param0 ^ 16213);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final byte[] b(int param0, int param1) {
        if (param1 <= 119) {
            ((oa) this).field_r = 115;
        }
        nb var3 = this.a(-8035, 0, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b((byte) 39);
        var3.a(false);
        return var4;
    }

    final static boolean a(int param0, String param1, long param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 28977) {
                break L1;
              } else {
                var7 = null;
                boolean discarded$2 = oa.a(-22, (String) null, 26L, -30, (int[]) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 == null) {
                  break L3;
                } else {
                  L4: {
                    if (2 != param3) {
                      break L4;
                    } else {
                      if (!hm.a(param1, param2, -24236)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("oa.K(").append(param0).append(44);
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
          L6: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final void a(boolean param0) {
        if (((oa) this).field_m == null) {
            return;
        }
        ((oa) this).field_v = param0 ? true : false;
        if (!(null != ((oa) this).field_o)) {
            ((oa) this).field_o = new p();
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            field_u = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(og.a(-1, param0, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    oa(int param0, gl param1, gl param2, dk param3, sb param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((oa) this).field_i = new ln(16);
        ((oa) this).field_g = 0;
        ((oa) this).field_f = new p();
        ((oa) this).field_w = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((oa) this).field_m = param1;
                ((oa) this).field_r = param0;
                if (((oa) this).field_m != null) {
                  break L2;
                } else {
                  ((oa) this).field_s = false;
                  if (!Virogrid.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((oa) this).field_s = true;
              ((oa) this).field_o = new p();
              break L1;
            }
            L3: {
              ((oa) this).field_k = param5;
              ((oa) this).field_x = param6;
              ((oa) this).field_t = param2;
              ((oa) this).field_y = param3;
              ((oa) this).field_j = param7;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((oa) this).field_d = stackIn_7_1 != 0;
              ((oa) this).field_e = param4;
              if (null == ((oa) this).field_t) {
                break L4;
              } else {
                ((oa) this).field_l = (nb) (Object) ((oa) this).field_e.a(((oa) this).field_r, -16578, ((oa) this).field_t);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("oa.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Show game chat from my friends";
    }
}
