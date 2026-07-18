/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qc extends hf {
    static long[][] field_g;
    static long[] field_h;
    int field_f;
    byte[] field_j;
    static int field_i;

    final void b(int param0, int param1) {
        int fieldTemp$0 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$2] = (byte)param1;
        int var3 = -20 % ((param0 - 62) / 60);
    }

    final void d(byte param0, int param1) {
        int fieldTemp$0 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$0] = (byte)param1;
        int var3 = 65 / ((param0 - 67) / 54);
    }

    final static dm a(int param0, int param1, int param2, rh param3) {
        RuntimeException var4 = null;
        dm stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        dm stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (mf.a(param2, param0, 126, param3)) {
              L1: {
                if (param1 == 19) {
                  break L1;
                } else {
                  field_i = -57;
                  break L1;
                }
              }
              stackOut_5_0 = sc.a((byte) -60);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("qc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean h(byte param0) {
        ((qc) this).field_f = ((qc) this).field_f - 4;
        if (param0 != 20) {
            String discarded$0 = ((qc) this).f(-46);
        }
        int var2 = oe.a(((qc) this).field_f, ((qc) this).field_j, param0 + -138, 0);
        int var3 = ((qc) this).a((byte) -85);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final void a(String param0, boolean param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var10 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var3_long = 0L;
              if (!param1) {
                break L1;
              } else {
                ((qc) this).field_f = -109;
                break L1;
              }
            }
            var5 = 0L;
            var7 = param0.length();
            var8 = 19;
            L2: while (true) {
              if (var8 < 0) {
                this.a(-109, var3_long);
                this.a(-47, var5);
                break L0;
              } else {
                var3_long = var3_long * 38L;
                if (var7 > var8) {
                  L3: {
                    L4: {
                      var9 = param0.charAt(var8);
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (90 >= var9) {
                          var3_long = var3_long + (long)(-63 + var9);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 <= 122) {
                          var3_long = var3_long + (long)(-97 + (2 + var9));
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 48) {
                        break L6;
                      } else {
                        if (var9 > 57) {
                          break L6;
                        } else {
                          var3_long = var3_long + (long)(-48 + var9 + 28);
                          break L3;
                        }
                      }
                    }
                    var3_long = var3_long + 1L;
                    break L3;
                  }
                  L7: {
                    if (var8 != 10) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var8--;
                  continue L2;
                } else {
                  L8: {
                    if (var8 != 10) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var8--;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("qc.IA(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ')');
        }
    }

    final void g(int param0, int param1) {
        ((qc) this).field_j[-4 + (((qc) this).field_f - param0)] = (byte)(param0 >> 24);
        if (param1 != 0) {
            int discarded$0 = ((qc) this).d(13, 61);
        }
        ((qc) this).field_j[-param0 + (((qc) this).field_f + -3)] = (byte)(param0 >> 16);
        ((qc) this).field_j[((qc) this).field_f + (-param0 + -2)] = (byte)(param0 >> 8);
        ((qc) this).field_j[-param0 + (((qc) this).field_f - 1)] = (byte)param0;
    }

    final int g(byte param0) {
        if (param0 >= -107) {
            String discarded$0 = ((qc) this).i((byte) -107);
        }
        int fieldTemp$1 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        int var2 = ((qc) this).field_j[fieldTemp$1];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (127 & var2 | var3) << 7;
            int fieldTemp$2 = ((qc) this).field_f;
            ((qc) this).field_f = ((qc) this).field_f + 1;
            var2 = ((qc) this).field_j[fieldTemp$2];
        }
        return var3 | var2;
    }

    final String f(int param0) {
        if (param0 != 27425) {
            Object var5 = null;
            dm discarded$0 = qc.a(-4, 95, -17, (rh) null);
        }
        int fieldTemp$1 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        int var2 = ((qc) this).field_j[fieldTemp$1];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var3 = ((qc) this).field_f;
        while (true) {
            int fieldTemp$2 = ((qc) this).field_f;
            ((qc) this).field_f = ((qc) this).field_f + 1;
            if (((qc) this).field_j[fieldTemp$2] == 0) {
                break;
            }
        }
        int var4 = -var3 + (((qc) this).field_f + -1);
        if (var4 == 0) {
            return "";
        }
        return bc.a(param0 ^ -27439, ((qc) this).field_j, var3, var4);
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
            field_g = null;
        }
        ((qc) this).field_j[((qc) this).field_f + (-param0 - 2)] = (byte)(param0 >> 8);
        ((qc) this).field_j[((qc) this).field_f + (-param0 + -1)] = (byte)param0;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 != 28695) {
            qc.a(true, 22);
        }
        int fieldTemp$1 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$1] = (byte)param0;
    }

    final static void g(int param0) {
        if (param0 != 0) {
            return;
        }
        hk.field_C.b((el) (Object) new wi(), param0 + -110);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        try {
            var3_int = param0.indexOf(' ');
            if (var3_int >= 0) {
                throw new IllegalArgumentException("");
            }
            var4 = (CharSequence) (Object) param0;
            int discarded$0 = 98;
            ((qc) this).field_f = ((qc) this).field_f + hi.a(var4, ((qc) this).field_j, param1, param0.length(), ((qc) this).field_f);
            int fieldTemp$1 = ((qc) this).field_f;
            ((qc) this).field_f = ((qc) this).field_f + 1;
            ((qc) this).field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qc.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String i(byte param0) {
        if (0 == ((qc) this).field_j[((qc) this).field_f]) {
            ((qc) this).field_f = ((qc) this).field_f + 1;
            return null;
        }
        if (param0 != 53) {
            ((qc) this).a((byte) 4, 25L);
        }
        return ((qc) this).e((byte) 125);
    }

    final static void a(float param0, String param1, boolean param2) {
        try {
            if (vg.field_i == null) {
                vg.field_i = new rl(kd.field_e, ff.field_d);
                kd.field_e.a(false, (el) (Object) vg.field_i);
            }
            vg.field_i.a(param2, param1, 124, param0);
            vb.c();
            pi.a(true, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qc.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + -40 + ')');
        }
    }

    final long b(int param0) {
        long var2 = 4294967295L & (long)((qc) this).a((byte) -113);
        if (param0 != 2901) {
            field_h = null;
        }
        long var4 = (long)((qc) this).a((byte) -113) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final void a(byte param0, long param1) {
        int fieldTemp$0 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$4] = (byte)(int)param1;
        if (param0 > -125) {
            ((qc) this).field_j = null;
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        ph var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (ph) (Object) el.field_p.g(0);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                rl.a(param1, 534, var3);
                var3 = (ph) (Object) el.field_p.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "qc.PA(" + true + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param3;
              if (param1 == -97) {
                break L1;
              } else {
                var6 = null;
                ((qc) this).a((String) null, 75);
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int >= param3 + param0) {
                break L0;
              } else {
                int fieldTemp$7 = ((qc) this).field_f;
                ((qc) this).field_f = ((qc) this).field_f + 1;
                ((qc) this).field_j[fieldTemp$7] = param2[var5_int];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("qc.JA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final int d(int param0, int param1) {
        if (param0 <= 4) {
            return -122;
        }
        int var3 = oe.a(((qc) this).field_f, ((qc) this).field_j, -37, param1);
        ((qc) this).c((byte) 95, var3);
        return var3;
    }

    final static byte a(char param0) {
        int var2 = 0;
        L0: {
          L1: {
            L2: {
              if (0 >= param0) {
                break L2;
              } else {
                if (param0 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (255 >= param0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (param0 != 8364) {
              if (param0 != 8218) {
                if (402 == param0) {
                  var2 = -125;
                  break L0;
                } else {
                  if (param0 == 8222) {
                    var2 = -124;
                    break L0;
                  } else {
                    if (param0 != 8230) {
                      if (8224 == param0) {
                        var2 = -122;
                        break L0;
                      } else {
                        if (8225 == param0) {
                          var2 = -121;
                          break L0;
                        } else {
                          if (param0 != 710) {
                            if (8240 != param0) {
                              if (param0 == 352) {
                                var2 = -118;
                                break L0;
                              } else {
                                if (param0 == 8249) {
                                  var2 = -117;
                                  break L0;
                                } else {
                                  if (param0 == 338) {
                                    var2 = -116;
                                    break L0;
                                  } else {
                                    if (param0 == 381) {
                                      var2 = -114;
                                      break L0;
                                    } else {
                                      if (param0 == 8216) {
                                        var2 = -111;
                                        break L0;
                                      } else {
                                        if (8217 != param0) {
                                          if (param0 != 8220) {
                                            if (param0 == 8221) {
                                              var2 = -108;
                                              break L0;
                                            } else {
                                              if (param0 != 8226) {
                                                if (param0 == 8211) {
                                                  var2 = -106;
                                                  break L0;
                                                } else {
                                                  if (param0 != 8212) {
                                                    if (param0 == 732) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (param0 != 8482) {
                                                        if (param0 != 353) {
                                                          if (param0 == 8250) {
                                                            var2 = -101;
                                                            break L0;
                                                          } else {
                                                            if (param0 != 339) {
                                                              if (param0 == 382) {
                                                                var2 = -98;
                                                                break L0;
                                                              } else {
                                                                if (param0 != 376) {
                                                                  var2 = 63;
                                                                  break L0;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L0;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L0;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                var2 = -107;
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var2 = -109;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var2 = -119;
                              break L0;
                            }
                          } else {
                            var2 = -120;
                            break L0;
                          }
                        }
                      }
                    } else {
                      var2 = -123;
                      break L0;
                    }
                  }
                }
              } else {
                var2 = -126;
                break L0;
              }
            } else {
              var2 = -128;
              break L0;
            }
          }
          var2 = (byte)param0;
          break L0;
        }
        return (byte) var2;
    }

    final void b(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param3;
              if (param0 == 29915) {
                break L1;
              } else {
                var6 = null;
                int discarded$10 = qc.a((mb) null, (mb) null, 35);
                break L1;
              }
            }
            L2: while (true) {
              if (param3 - -param1 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$11 = ((qc) this).field_f;
                ((qc) this).field_f = ((qc) this).field_f + 1;
                param2[var5_int] = ((qc) this).field_j[fieldTemp$11];
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("qc.LA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final void f(int param0, int param1) {
        ((qc) this).field_j[-param1 + (((qc) this).field_f - 1)] = (byte)param1;
        if (param0 != 11700) {
            qc.g(-24);
        }
    }

    final void a(int[] param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var3_int = ((qc) this).field_f / 8;
              ((qc) this).field_f = 0;
              if (param1 == -33) {
                break L1;
              } else {
                var10 = null;
                int discarded$2 = qc.a((mb) null, (mb) null, 109);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var3_int <= var4) {
                break L0;
              } else {
                var5 = ((qc) this).a((byte) -69);
                var6 = ((qc) this).a((byte) -34);
                var7 = 0;
                var8 = -1640531527;
                var9 = 32;
                L3: while (true) {
                  int incrementValue$3 = var9;
                  var9--;
                  if (0 >= incrementValue$3) {
                    ((qc) this).field_f = ((qc) this).field_f - 8;
                    ((qc) this).c((byte) 95, var5);
                    ((qc) this).c((byte) 95, var6);
                    var4++;
                    continue L2;
                  } else {
                    var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ var7 - -param0[3 & var7]);
                    var7 = var7 + var8;
                    var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + param0[(var7 & 7480) >>> 11]);
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("qc.GA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final int b(boolean param0) {
        ((qc) this).field_f = ((qc) this).field_f + 2;
        if (!param0) {
            return 58;
        }
        return (((qc) this).field_j[-2 + ((qc) this).field_f] << 8 & 65280) + (255 & ((qc) this).field_j[-1 + ((qc) this).field_f]);
    }

    final int d(byte param0) {
        if (param0 != -27) {
            return 95;
        }
        if (((qc) this).field_j[((qc) this).field_f] >= 0) {
            return ((qc) this).b(true);
        }
        return 2147483647 & ((qc) this).a((byte) -114);
    }

    final void a(byte param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((qc) this).field_f;
              if (param0 <= -63) {
                break L1;
              } else {
                int discarded$2 = ((qc) this).e(3);
                break L1;
              }
            }
            ((qc) this).field_f = param2;
            var6 = (-param2 + param3) / 8;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                ((qc) this).field_f = var5_int;
                break L0;
              } else {
                var8 = ((qc) this).a((byte) -36);
                var9 = ((qc) this).a((byte) -103);
                var10 = -957401312;
                var11 = -1640531527;
                var12 = 32;
                L3: while (true) {
                  int incrementValue$3 = var12;
                  var12--;
                  if (incrementValue$3 <= 0) {
                    ((qc) this).field_f = ((qc) this).field_f - 8;
                    ((qc) this).c((byte) 95, var8);
                    ((qc) this).c((byte) 95, var9);
                    var7++;
                    continue L2;
                  } else {
                    var9 = var9 - (var10 - -param1[(7701 & var10) >>> 11] ^ var8 + (var8 << 4 ^ var8 >>> 5));
                    var10 = var10 - var11;
                    var8 = var8 - (var10 + param1[var10 & 3] ^ (var9 >>> 5 ^ var9 << 4) - -var9);
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("qc.G(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d() {
        field_h = null;
        field_g = null;
    }

    final void b(byte param0, int param1) {
        if (!((param1 & -128) == 0)) {
            if ((-16384 & param1) != 0) {
                if (0 != (param1 & -2097152)) {
                    if (!((-268435456 & param1) == 0)) {
                        ((qc) this).d((byte) 126, param1 >>> 28 | 128);
                    }
                    ((qc) this).d((byte) -96, 128 | param1 >>> 21);
                }
                ((qc) this).d((byte) 127, (param1 | 2097436) >>> 14);
            }
            ((qc) this).d((byte) -121, param1 >>> 7 | 128);
        }
        ((qc) this).d((byte) 124, 127 & param1);
        if (param0 >= -95) {
            ((qc) this).b(-109, -43);
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$5] = (byte)(int)(param1 >> 8);
        if (param0 >= -41) {
            field_g = null;
        }
        int fieldTemp$6 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$6] = (byte)(int)param1;
    }

    final void b(byte param0, long param1) {
        Object var5 = null;
        L0: {
          int fieldTemp$8 = ((qc) this).field_f;
          ((qc) this).field_f = ((qc) this).field_f + 1;
          ((qc) this).field_j[fieldTemp$8] = (byte)(int)(param1 >> 56);
          int fieldTemp$9 = ((qc) this).field_f;
          ((qc) this).field_f = ((qc) this).field_f + 1;
          ((qc) this).field_j[fieldTemp$9] = (byte)(int)(param1 >> 48);
          int fieldTemp$10 = ((qc) this).field_f;
          ((qc) this).field_f = ((qc) this).field_f + 1;
          ((qc) this).field_j[fieldTemp$10] = (byte)(int)(param1 >> 40);
          int fieldTemp$11 = ((qc) this).field_f;
          ((qc) this).field_f = ((qc) this).field_f + 1;
          ((qc) this).field_j[fieldTemp$11] = (byte)(int)(param1 >> 32);
          int fieldTemp$12 = ((qc) this).field_f;
          ((qc) this).field_f = ((qc) this).field_f + 1;
          ((qc) this).field_j[fieldTemp$12] = (byte)(int)(param1 >> 24);
          int fieldTemp$13 = ((qc) this).field_f;
          ((qc) this).field_f = ((qc) this).field_f + 1;
          ((qc) this).field_j[fieldTemp$13] = (byte)(int)(param1 >> 16);
          if (param0 > 57) {
            break L0;
          } else {
            var5 = null;
            ((qc) this).a(91, (java.math.BigInteger) null, (java.math.BigInteger) null);
            break L0;
          }
        }
        int fieldTemp$14 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$14] = (byte)(int)(param1 >> 8);
        int fieldTemp$15 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$15] = (byte)(int)param1;
    }

    final int e(int param0) {
        if (param0 <= 85) {
            field_h = null;
        }
        ((qc) this).field_f = ((qc) this).field_f + 3;
        return (((qc) this).field_j[-1 + ((qc) this).field_f] & 255) + (((((qc) this).field_j[((qc) this).field_f + -2] & 255) << 8) + ((((qc) this).field_j[((qc) this).field_f + -3] & 255) << 16));
    }

    final void a(String param0, byte param1) {
        CharSequence var4 = null;
        int var3_int = param0.indexOf(' ');
        if (param1 != -126) {
            return;
        }
        try {
            if (!(var3_int < 0)) {
                throw new IllegalArgumentException("");
            }
            int fieldTemp$0 = ((qc) this).field_f;
            ((qc) this).field_f = ((qc) this).field_f + 1;
            ((qc) this).field_j[fieldTemp$0] = (byte) 0;
            var4 = (CharSequence) (Object) param0;
            int discarded$1 = 98;
            ((qc) this).field_f = ((qc) this).field_f + hi.a(var4, ((qc) this).field_j, 0, param0.length(), ((qc) this).field_f);
            int fieldTemp$2 = ((qc) this).field_f;
            ((qc) this).field_f = ((qc) this).field_f + 1;
            ((qc) this).field_j[fieldTemp$2] = (byte) 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qc.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        while (((qc) this).field_f < param1) {
            int fieldTemp$0 = ((qc) this).field_f;
            ((qc) this).field_f = ((qc) this).field_f + 1;
            ((qc) this).field_j[fieldTemp$0] = (byte) 0;
        }
        if (param0 > -45) {
            int discarded$1 = ((qc) this).e(93);
        }
    }

    final void c(int param0, int param1) {
        if (param0 < 64) {
            if (param0 >= -64) {
                ((qc) this).d((byte) 125, 64 + param0);
                return;
            }
        }
        if (param0 < 16384) {
            if (!(param0 < -16384)) {
                ((qc) this).e(49152 + param0, 28695);
                return;
            }
        }
        if (param1 != -5962) {
            int discarded$0 = ((qc) this).d((byte) -105);
        }
        throw new IllegalArgumentException();
    }

    final byte f(byte param0) {
        if (param0 <= 71) {
            ((qc) this).f(105, -48);
        }
        int fieldTemp$0 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        return ((qc) this).field_j[fieldTemp$0];
    }

    final void c(byte param0, int param1) {
        int fieldTemp$0 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0 != 95) {
            int discarded$3 = ((qc) this).h(-7);
        }
        int fieldTemp$4 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        ((qc) this).field_j[fieldTemp$4] = (byte)param1;
    }

    final int a(byte param0) {
        ((qc) this).field_f = ((qc) this).field_f + 4;
        if (param0 >= -25) {
            return 62;
        }
        return (65280 & ((qc) this).field_j[-2 + ((qc) this).field_f] << 8) + (-16777216 & ((qc) this).field_j[-4 + ((qc) this).field_f] << 24) - (-((255 & ((qc) this).field_j[-3 + ((qc) this).field_f]) << 16) + -(((qc) this).field_j[((qc) this).field_f - 1] & 255));
    }

    final int c(byte param0) {
        if (param0 != 34) {
            Object var3 = null;
            ((qc) this).a(31, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
        int fieldTemp$0 = ((qc) this).field_f;
        ((qc) this).field_f = ((qc) this).field_f + 1;
        return 255 & ((qc) this).field_j[fieldTemp$0];
    }

    final String e(byte param0) {
        int var2 = ((qc) this).field_f;
        while (true) {
            int fieldTemp$0 = ((qc) this).field_f;
            ((qc) this).field_f = ((qc) this).field_f + 1;
            if (0 == ((qc) this).field_j[fieldTemp$0]) {
                break;
            }
        }
        int var3 = ((qc) this).field_f + (-var2 + -1);
        if (var3 == 0) {
            return "";
        }
        if (param0 < 94) {
            field_i = 68;
        }
        return bc.a(-45, ((qc) this).field_j, var2, var3);
    }

    final int h(int param0) {
        int var3 = 57 % ((-26 - param0) / 54);
        int var2 = 255 & ((qc) this).field_j[((qc) this).field_f];
        if (var2 < 128) {
            return ((qc) this).c((byte) 34) - 64;
        }
        return -49152 + ((qc) this).b(true);
    }

    final static int a(mb param0, mb param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = 2 / ((param2 - -41) / 54);
            var4 = null;
            stackOut_0_0 = pf.a(0, 0, param0, param1, (String) null, false, 94);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("qc.N(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final int c(int param0) {
        if (param0 != 1) {
            return 3;
        }
        int var2 = 255 & ((qc) this).field_j[((qc) this).field_f];
        if (var2 < 128) {
            return ((qc) this).c((byte) 34);
        }
        return ((qc) this).b(true) + -32768;
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = ((qc) this).field_f;
            ((qc) this).field_f = 0;
            var5 = new byte[var4_int];
            ((qc) this).b(param0 ^ 29915, var4_int, var5, 0);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param1);
            var8 = var7.toByteArray();
            ((qc) this).field_f = param0;
            ((qc) this).e(var8.length, 28695);
            ((qc) this).a(var8.length, -97, var8, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qc.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    qc(int param0) {
        ((qc) this).field_j = oi.a(false, param0);
        ((qc) this).field_f = 0;
    }

    qc(byte[] param0) {
        try {
            ((qc) this).field_j = param0;
            ((qc) this).field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_g = new long[8][256];
        field_h = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_h[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                return;
              } else {
                var1 = var0 * 8 - 8;
                field_h[var0] = f.a(f.a(f.a(cj.a(16711680L, field_g[5][5 + var1]), f.a(cj.a(4278190080L, field_g[4][var1 - -4]), f.a(f.a(f.a(cj.a(field_g[0][var1], -72057594037927936L), cj.a(field_g[1][1 + var1], 71776119061217280L)), cj.a(280375465082880L, field_g[2][2 + var1])), cj.a(field_g[3][var1 + 3], 1095216660480L)))), cj.a(field_g[6][var1 - -6], 65280L)), cj.a(255L, field_g[7][var1 - -7]));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) != 0) {
                stackOut_4_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> 8);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1;
              if (var4 >= 256L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (var6 < 256L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_g[0][var0] = ue.a(var12, ue.a(var4 << 8, ue.a(var8 << 16, ue.a(ue.a(ue.a(var6 << 40, ue.a(var2 << 56, var2 << 48)), var2 << 32), var10 << 24))));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_g[var14][var0] = ue.a(field_g[var14 + -1][var0] >>> 8, field_g[-1 + var14][var0] << 56);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
