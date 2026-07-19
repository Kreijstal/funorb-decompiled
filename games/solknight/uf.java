/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uf extends af {
    static int field_q;
    static byte[][] field_s;
    static String field_r;
    static int field_p;

    uf(mg param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_F, -1, 2147483647, false);
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        try {
            if (param0 < 113) {
                rc var7 = (rc) null;
                this.a((byte) 62, -71, true, -109, (rc) null);
            }
            if (!(!param2)) {
                pl.a(true, param4.field_x, param4.field_t, param4.field_j + param1, param3 + param4.field_m);
            }
            super.a((byte) 117, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "uf.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    uf(int param0) {
        this(ua.field_G, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        if (param6 >= param7) {
          if (param0 > param6) {
            qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
            if (param4 <= -48) {
              return;
            } else {
              field_r = (String) null;
              return;
            }
          } else {
            L0: {
              if (param7 >= param0) {
                qb.a(param0, param6, param3, param2, param5, param1, 95, mi.field_f, param7);
                if (var9 == 0) {
                  break L0;
                } else {
                  qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                  if (param4 <= -48) {
                    return;
                  } else {
                    field_r = (String) null;
                    return;
                  }
                }
              } else {
                qb.a(param7, param6, param1, param2, param5, param3, 75, mi.field_f, param0);
                if (var9 == 0) {
                  break L0;
                } else {
                  qb.a(param0, param6, param3, param2, param5, param1, 95, mi.field_f, param7);
                  qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                  if (param4 > -48) {
                    field_r = (String) null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param4 <= -48) {
              return;
            } else {
              field_r = (String) null;
              return;
            }
          }
        } else {
          if (param0 > param7) {
            qb.a(param6, param0, param3, param2, param1, param5, 98, mi.field_f, param7);
            if (var9 != 0) {
              if (param0 > param6) {
                qb.a(param6, param7, param1, param2, param3, param5, 38, mi.field_f, param0);
                if (var9 != 0) {
                  L1: {
                    if (param0 > param6) {
                      qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                      break L1;
                    } else {
                      L2: {
                        if (param7 >= param0) {
                          break L2;
                        } else {
                          qb.a(param7, param6, param1, param2, param5, param3, 75, mi.field_f, param0);
                          if (var9 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      qb.a(param0, param6, param3, param2, param5, param1, 95, mi.field_f, param7);
                      if (var9 == 0) {
                        break L1;
                      } else {
                        L3: {
                          qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                          if (param4 <= -48) {
                            break L3;
                          } else {
                            field_r = (String) null;
                            break L3;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param4 > -48) {
                    field_r = (String) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param4 > -48) {
                    field_r = (String) null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                qb.a(param0, param7, param5, param2, param3, param1, 73, mi.field_f, param6);
                if (var9 == 0) {
                  if (param4 > -48) {
                    field_r = (String) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    qb.a(param6, param7, param1, param2, param3, param5, 38, mi.field_f, param0);
                    if (param0 > param6) {
                      qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                      break L4;
                    } else {
                      L5: {
                        if (param7 >= param0) {
                          break L5;
                        } else {
                          qb.a(param7, param6, param1, param2, param5, param3, 75, mi.field_f, param0);
                          break L5;
                        }
                      }
                      qb.a(param0, param6, param3, param2, param5, param1, 95, mi.field_f, param7);
                      if (var9 == 0) {
                        break L4;
                      } else {
                        qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (param4 <= -48) {
                      break L6;
                    } else {
                      field_r = (String) null;
                      break L6;
                    }
                  }
                  return;
                }
              }
            } else {
              if (param4 > -48) {
                field_r = (String) null;
                return;
              } else {
                return;
              }
            }
          } else {
            L7: {
              if (param0 > param6) {
                qb.a(param6, param7, param1, param2, param3, param5, 38, mi.field_f, param0);
                if (var9 == 0) {
                  break L7;
                } else {
                  L8: {
                    if (param0 > param6) {
                      qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                      break L8;
                    } else {
                      L9: {
                        if (param7 >= param0) {
                          break L9;
                        } else {
                          qb.a(param7, param6, param1, param2, param5, param3, 75, mi.field_f, param0);
                          break L9;
                        }
                      }
                      qb.a(param0, param6, param3, param2, param5, param1, 95, mi.field_f, param7);
                      if (var9 == 0) {
                        break L8;
                      } else {
                        qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (param4 <= -48) {
                      break L10;
                    } else {
                      field_r = (String) null;
                      break L10;
                    }
                  }
                  return;
                }
              } else {
                qb.a(param0, param7, param5, param2, param3, param1, 73, mi.field_f, param6);
                if (var9 == 0) {
                  break L7;
                } else {
                  L11: {
                    qb.a(param6, param7, param1, param2, param3, param5, 38, mi.field_f, param0);
                    if (param0 > param6) {
                      qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                      break L11;
                    } else {
                      L12: {
                        if (param7 >= param0) {
                          break L12;
                        } else {
                          qb.a(param7, param6, param1, param2, param5, param3, 75, mi.field_f, param0);
                          break L12;
                        }
                      }
                      qb.a(param0, param6, param3, param2, param5, param1, 95, mi.field_f, param7);
                      if (var9 == 0) {
                        break L11;
                      } else {
                        qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (param4 <= -48) {
                      break L13;
                    } else {
                      field_r = (String) null;
                      break L13;
                    }
                  }
                  return;
                }
              }
            }
            if (param4 > -48) {
              field_r = (String) null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static ff a(int param0, byte param1) {
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        ff[] var5 = qh.a(-89);
        ff[] var2 = var5;
        if (param1 != -121) {
            field_p = 7;
            var3 = 0;
            do {
                if (var5.length <= var3) {
                    return null;
                }
                if (!(param0 != var5[var3].field_a)) {
                    return var5[var3];
                }
                var3++;
            } while (var4 == 0);
            return null;
        }
        var3 = 0;
        do {
            if (var5.length <= var3) {
                return null;
            }
            if (!(param0 != var5[var3].field_a)) {
                return var5[var3];
            }
            var3++;
        } while (var4 == 0);
        return null;
    }

    final static void a(boolean param0, int param1, int param2, rl param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Throwable var6 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var4_int = -123 / ((90 - param1) / 33);
              if (null != ah.field_a) {
                kd.a(param2, (byte) 101, param3, 1048576, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != ua.field_I) {
                var5 = kj.field_P;
                synchronized (var5) {
                  L3: {
                    ua.field_I.b(param2, -1, -129);
                    if (param3 == dj.field_j) {
                      return;
                    } else {
                      L4: {
                        ua.field_I.a((byte) 97);
                        kj.field_P.h();
                        dj.field_j = param3;
                        if (null == dj.field_j) {
                          break L4;
                        } else {
                          ua.field_I.a(param0, dj.field_j, true);
                          break L4;
                        }
                      }
                      break L3;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("uf.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    public static void e(int param0) {
        field_s = (byte[][]) null;
        if (param0 != 22645) {
            field_r = (String) null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    final static void a(byte param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param3.getGraphics();
                hj.field_e.a(param2, 0, param1, var4);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L2;
              }
            }
            L3: {
              if (param0 == 99) {
                break L3;
              } else {
                field_r = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4_ref2);
            stackOut_6_1 = new StringBuilder().append("uf.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L4;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void d(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != pj.field_D) {
              try {
                L0: {
                  pj.field_D.a(0L, (byte) 45);
                  pj.field_D.a(te.field_N.field_l, -20291, 24, te.field_N.field_m);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                if (param0 != 31911) {
                  field_q = -95;
                  te.field_N.field_m = te.field_N.field_m + 24;
                  return;
                } else {
                  te.field_N.field_m = te.field_N.field_m + 24;
                  return;
                }
              }
              L1: {
                if (param0 == 31911) {
                  break L1;
                } else {
                  field_q = -95;
                  break L1;
                }
              }
              te.field_N.field_m = te.field_N.field_m + 24;
              return;
            } else {
              L2: {
                if (param0 == 31911) {
                  break L2;
                } else {
                  field_q = -95;
                  break L2;
                }
              }
              te.field_N.field_m = te.field_N.field_m + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (param0) {
            return;
        }
        u.field_b.a(19550, 0, 0);
    }

    static {
        field_p = -1;
    }
}
