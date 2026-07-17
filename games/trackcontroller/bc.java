/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc implements Runnable {
    static long[] field_a;
    private InputStream field_g;
    private int field_h;
    private OutputStream field_b;
    static int field_o;
    private java.net.Socket field_k;
    private int field_n;
    private uf field_m;
    private boolean field_j;
    static int[][] field_c;
    private ce field_f;
    private byte[] field_e;
    private boolean field_l;
    private int field_i;
    static boolean field_d;

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        if (param1 > -58) {
          return -67;
        } else {
          return param0 + 1;
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
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
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              if (param0 == -6) {
                break L1;
              } else {
                var7 = null;
                byte[] discarded$1 = bc.a((byte) 8, (CharSequence) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_69_0 = (byte[]) var3;
                stackIn_70_0 = stackOut_69_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 != var5) {
                      if (var5 != 8218) {
                        if (402 == var5) {
                          var3[var4] = (byte) -125;
                          break L3;
                        } else {
                          if (8222 != var5) {
                            if (8230 == var5) {
                              var3[var4] = (byte) -123;
                              break L3;
                            } else {
                              if (var5 != 8224) {
                                if (var5 != 8225) {
                                  if (var5 != 710) {
                                    if (8240 != var5) {
                                      if (var5 != 352) {
                                        if (8249 != var5) {
                                          if (var5 != 338) {
                                            if (var5 != 381) {
                                              if (var5 != 8216) {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L3;
                                                    } else {
                                                      if (var5 != 8226) {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte) -106;
                                                          break L3;
                                                        } else {
                                                          if (8212 == var5) {
                                                            var3[var4] = (byte) -105;
                                                            break L3;
                                                          } else {
                                                            if (var5 != 732) {
                                                              if (var5 != 8482) {
                                                                if (var5 != 353) {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte) -101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var5 != 382) {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte) -97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte) 63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte) -102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L3;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L3;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L3;
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L3;
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L3;
                                          }
                                        } else {
                                          var3[var4] = (byte) -117;
                                          break L3;
                                        }
                                      } else {
                                        var3[var4] = (byte) -118;
                                        break L3;
                                      }
                                    } else {
                                      var3[var4] = (byte) -119;
                                      break L3;
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L3;
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L3;
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L3;
                              }
                            }
                          } else {
                            var3[var4] = (byte) -124;
                            break L3;
                          }
                        }
                      } else {
                        var3[var4] = (byte) -126;
                        break L3;
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      var4++;
                      break L3;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var2;
            stackOut_71_1 = new StringBuilder().append("bc.E(").append(param0).append(44);
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
              break L7;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L7;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
        return stackIn_70_0;
    }

    final static ck a(int param0, byte[] param1) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        Object stackIn_2_0 = null;
        ck stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 != null) {
              L1: {
                if (param0 == 12587) {
                  break L1;
                } else {
                  var3 = null;
                  byte[] discarded$2 = bc.a((byte) -122, (CharSequence) null);
                  break L1;
                }
              }
              var2 = new ck(param1, ka.field_f, vb.field_a, cf.field_p, j.field_f, qe.field_z, qk.field_M);
              ff.b(26);
              stackOut_5_0 = (ck) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ck) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("bc.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    protected final void finalize() {
        ((bc) this).d(16777215);
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
            Object var3 = null;
            byte[] discarded$4 = bc.a((byte) 44, (CharSequence) null);
            if (!(!((bc) this).field_j)) {
                return 0;
            }
            return ((bc) this).field_g.available();
        }
        if (!(!((bc) this).field_j)) {
            return 0;
        }
        return ((bc) this).field_g.available();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (((bc) this).field_j) {
              return;
            } else {
              L1: while (true) {
                if (0 >= param2) {
                  if (param1 == 0) {
                    break L0;
                  } else {
                    ((bc) this).field_b = null;
                    return;
                  }
                } else {
                  var5_int = ((bc) this).field_g.read(param0, param3, param2);
                  if (var5_int > 0) {
                    param2 = param2 - var5_int;
                    param3 = param3 + var5_int;
                    continue L1;
                  } else {
                    throw new EOFException();
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("bc.I(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void d(int param0) {
        InterruptedException var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          if (param0 == 16777215) {
            break L0;
          } else {
            var5 = null;
            ck discarded$1 = bc.a(-6, (byte[]) null);
            break L0;
          }
        }
        if (!((bc) this).field_j) {
          var2_ref = this;
          synchronized (var2_ref) {
            L1: {
              ((bc) this).field_j = true;
              this.notifyAll();
              break L1;
            }
          }
          if (null == ((bc) this).field_f) {
            ((bc) this).field_f = null;
            return;
          } else {
            L2: while (true) {
              if (((bc) this).field_f.field_f != 0) {
                if (((bc) this).field_f.field_f != 1) {
                  ((bc) this).field_f = null;
                  return;
                } else {
                  try {
                    L3: {
                      ((Thread) ((bc) this).field_f.field_e).join();
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2 = (InterruptedException) (Object) decompiledCaughtException;
                    ((bc) this).field_f = null;
                    return;
                  }
                  ((bc) this).field_f = null;
                  return;
                }
              } else {
                wl.a(1L, false);
                continue L2;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + param4;
              var6 = param3 + param0;
              if (ll.field_a >= param4) {
                stackOut_3_0 = ll.field_a;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param4;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (ll.field_b < param3) {
                stackOut_6_0 = param3;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ll.field_b;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (ll.field_e > var5_int) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ll.field_e;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (param1 == -28846) {
                break L4;
              } else {
                field_a = null;
                break L4;
              }
            }
            L5: {
              if (ll.field_g <= var6) {
                stackOut_14_0 = ll.field_g;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = var6;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (param4 < ll.field_a) {
                break L6;
              } else {
                if (param4 >= ll.field_e) {
                  break L6;
                } else {
                  var11 = param4 + var8 * ll.field_d;
                  var12 = -var8 + var10 + 1 >> 1;
                  L7: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L6;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 = var11 + ll.field_d * 2;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (ll.field_b > param3) {
                break L8;
              } else {
                if (ll.field_g > var6) {
                  var11 = var7 + param3 * ll.field_d;
                  var12 = var9 + (1 - var7) >> 1;
                  L9: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L8;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (ll.field_a > var5_int) {
                break L10;
              } else {
                if (ll.field_e > var5_int) {
                  var11 = ((1 & -param4 + var5_int) + var8) * ll.field_d - -var5_int;
                  var12 = 1 + var10 + -var8 >> 1;
                  L11: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 = var11 + ll.field_d * 2;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (param3 < ll.field_b) {
                break L12;
              } else {
                if (var6 >= ll.field_g) {
                  break L12;
                } else {
                  var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                  var12 = var9 + (1 + -var7) >> 1;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var5, "bc.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    bc(java.net.Socket param0, uf param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (!((bc) this).field_j) {
            if (!((bc) this).field_l) {
              L0: {
                if (((bc) this).field_e == null) {
                  ((bc) this).field_e = new byte[((bc) this).field_n];
                  break L0;
                } else {
                  break L0;
                }
              }
              var5_ref = this;
              synchronized (var5_ref) {
                L1: {
                  L2: {
                    if (param0 < -101) {
                      break L2;
                    } else {
                      ((bc) this).field_k = null;
                      break L2;
                    }
                  }
                  var6 = 0;
                  L3: while (true) {
                    if (param2 <= var6) {
                      L4: {
                        if (((bc) this).field_f == null) {
                          ((bc) this).field_f = ((bc) this).field_m.a(3, (Runnable) this, 17);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((bc) this).field_e[((bc) this).field_h] = param1[param3 + var6];
                      ((bc) this).field_h = (1 + ((bc) this).field_h) % ((bc) this).field_n;
                      if ((-100 + (((bc) this).field_n + ((bc) this).field_i)) % ((bc) this).field_n == ((bc) this).field_h) {
                        throw new IOException();
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              ((bc) this).field_l = false;
              throw new IOException();
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("bc.K(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            InterruptedException var4 = null;
            Throwable var5 = null;
            int var6 = 0;
            Object var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var6 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3_ref = this;
                  synchronized (var3_ref) {
                    L2: {
                      L3: {
                        if (((bc) this).field_i == ((bc) this).field_h) {
                          if (!((bc) this).field_j) {
                            {
                              L4: {
                                this.wait();
                                break L4;
                              }
                            }
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (((bc) this).field_h < ((bc) this).field_i) {
                          var1_int = -((bc) this).field_i + ((bc) this).field_n;
                          break L6;
                        } else {
                          var1_int = -((bc) this).field_i + ((bc) this).field_h;
                          break L6;
                        }
                      }
                      var2 = ((bc) this).field_i;
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L7: {
                        L8: {
                          if (null == ((bc) this).field_g) {
                            break L8;
                          } else {
                            ((bc) this).field_g.close();
                            break L8;
                          }
                        }
                        L9: {
                          if (null == ((bc) this).field_b) {
                            break L9;
                          } else {
                            ((bc) this).field_b.close();
                            break L9;
                          }
                        }
                        L10: {
                          if (null != ((bc) this).field_k) {
                            ((bc) this).field_k.close();
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        break L7;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L11: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L11;
                      }
                    }
                    ((bc) this).field_e = null;
                    break L0;
                  } else {
                    if (var1_int <= 0) {
                      continue L1;
                    } else {
                      try {
                        L12: {
                          ((bc) this).field_b.write(((bc) this).field_e, var2, var1_int);
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((bc) this).field_l = true;
                          break L13;
                        }
                      }
                      ((bc) this).field_i = (((bc) this).field_i + var1_int) % ((bc) this).field_n;
                      try {
                        L14: {
                          L15: {
                            if (((bc) this).field_i == ((bc) this).field_h) {
                              ((bc) this).field_b.flush();
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          break L14;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L16: {
                          var3 = (IOException) (Object) decompiledCaughtException;
                          ((bc) this).field_l = true;
                          break L16;
                        }
                      }
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L17: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                hb.a((Throwable) (Object) var1_ref, 0, (String) null);
                break L17;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) throws IOException {
        Object var3 = null;
        if (!((bc) this).field_j) {
          if (!((bc) this).field_l) {
            if (param0) {
              return;
            } else {
              var3 = null;
              ck discarded$2 = bc.a(113, (byte[]) null);
              return;
            }
          } else {
            ((bc) this).field_l = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
    }

    final int a(int param0) throws IOException {
        if (param0 > -23) {
            return 58;
        }
        if (((bc) this).field_j) {
            return 0;
        }
        return ((bc) this).field_g.read();
    }

    private bc(java.net.Socket param0, uf param1, int param2) throws IOException {
        ((bc) this).field_h = 0;
        ((bc) this).field_j = false;
        ((bc) this).field_l = false;
        ((bc) this).field_i = 0;
        try {
            ((bc) this).field_m = param1;
            ((bc) this).field_k = param0;
            ((bc) this).field_k.setSoTimeout(30000);
            ((bc) this).field_k.setTcpNoDelay(true);
            ((bc) this).field_g = ((bc) this).field_k.getInputStream();
            ((bc) this).field_b = ((bc) this).field_k.getOutputStream();
            ((bc) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "bc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new long[32];
        field_o = 50;
    }
}
