/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lf {
    int field_a;
    private b field_e;
    int field_d;
    int field_c;
    int field_b;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        bd var1_ref = null;
        int var4 = 0;
        int var5 = 0;
        oj var6 = null;
        int var8 = 0;
        bd var9 = null;
        bd stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        bd stackOut_4_0 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = -61 / ((-66 - param0) / 51);
            var5 = 0;
            L1: while (true) {
              if (var5 >= el.field_j) {
                break L0;
              } else {
                L2: {
                  var6 = mm.field_m[var5];
                  if (!var6.field_b) {
                    stackOut_5_0 = null;
                    stackIn_6_0 = (bd) (Object) stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = var6.g(-28);
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var9 = stackIn_6_0;
                  var1_ref = var9;
                  if (var1_ref == null) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "lf.C(" + param0 + ')');
        }
    }

    void a(int param0, int param1, oj param2) {
        RuntimeException var4 = null;
        Object var5 = null;
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
              if (param1 == 576) {
                break L1;
              } else {
                var5 = null;
                ((lf) this).a(49, 28, (oj) null);
                break L1;
              }
            }
            L2: {
              if (((lf) this).field_c != param0) {
                if (((lf) this).field_d > ((lf) this).field_b) {
                  ((lf) this).field_d = ((lf) this).field_d - 1;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                if (((lf) this).field_a <= ((lf) this).field_d) {
                  break L2;
                } else {
                  ((lf) this).field_d = ((lf) this).field_d + 1;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("lf.D(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final void a(int param0) {
        if (null != ((lf) this).field_e) {
            eh.field_c.a((tj) (Object) ((lf) this).field_e);
            ((lf) this).field_e = null;
        }
        if (param0 != 18421) {
            ((lf) this).field_e = null;
        }
    }

    lf(int param0, int param1, int param2) {
        ((lf) this).field_a = param2;
        ((lf) this).field_c = param0;
        ((lf) this).field_b = param1;
        ((lf) this).field_d = ((lf) this).field_b;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 80 % ((param0 - 32) / 39);
        im.field_e.a(0, 0, (byte) 126);
    }

    lf() {
    }

    final void b(int param0) {
        L0: {
          if (((lf) this).field_d > 0) {
            if (null != ((lf) this).field_e) {
              break L0;
            } else {
              if (null == ua.field_c) {
                break L0;
              } else {
                if (-1 + ua.field_c.length <= ((lf) this).field_c) {
                  break L0;
                } else {
                  if (null != ua.field_c[-1 + ((lf) this).field_c]) {
                    ((lf) this).field_e = b.a(ua.field_c[-1 + ((lf) this).field_c], 100, ((lf) this).field_d);
                    ((lf) this).field_e.d(-1);
                    eh.field_c.b((tj) (Object) ((lf) this).field_e);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            if (((lf) this).field_e == null) {
              break L0;
            } else {
              eh.field_c.a((tj) (Object) ((lf) this).field_e);
              ((lf) this).field_e = null;
              break L0;
            }
          }
        }
        L1: {
          if (param0 > 25) {
            break L1;
          } else {
            lf.a((byte) -50);
            break L1;
          }
        }
        L2: {
          if (((lf) this).field_e != null) {
            ((lf) this).field_e.f(((lf) this).field_d * uh.field_i / 64);
            break L2;
          } else {
            break L2;
          }
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_69_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_69_0 = (byte[]) var3;
                stackIn_70_0 = stackOut_69_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L4;
                      } else {
                        if (128 > var5) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var5 < 160) {
                        break L5;
                      } else {
                        if (var5 > 255) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 == 8218) {
                        var3[var4] = (byte) -126;
                        break L2;
                      } else {
                        if (402 != var5) {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (var5 != 8230) {
                              if (var5 != 8224) {
                                if (8225 == var5) {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var5 == 710) {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (8240 != var5) {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (8249 == var5) {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        } else {
                                          if (338 == var5) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (381 == var5) {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (8216 != var5) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (8220 != var5) {
                                                    if (8221 != var5) {
                                                      if (8226 == var5) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (8211 != var5) {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 != 8482) {
                                                                if (var5 != 353) {
                                                                  if (8250 != var5) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var5 != 382) {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L2;
                              }
                            } else {
                              var3[var4] = (byte) -123;
                              break L2;
                            }
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L2;
                        }
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      break L2;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L2;
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var2;
            stackOut_71_1 = new StringBuilder().append("lf.B(").append(113).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ')');
        }
        return stackIn_70_0;
    }

    static {
    }
}
