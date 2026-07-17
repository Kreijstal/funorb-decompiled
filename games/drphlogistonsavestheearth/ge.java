/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class ge {
    private long field_o;
    private int field_j;
    static String field_i;
    private pf field_b;
    static he[] field_p;
    private long field_a;
    static String field_c;
    static int field_f;
    private long field_h;
    static he field_d;
    static String field_g;
    private long field_n;
    private long field_k;
    private byte[] field_m;
    private byte[] field_l;
    private long field_e;
    private int field_q;

    final void a(int param0) throws IOException {
        if (param0 > -46) {
            return;
        }
        this.b(0);
        ((ge) this).field_b.c(104);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~((ge) this).field_h <= ~(((ge) this).field_a + (long)param0)) {
                break L1;
              } else {
                ((ge) this).field_h = ((ge) this).field_a + (long)param0;
                break L1;
              }
            }
            L2: {
              if (((ge) this).field_k == -1L) {
                break L2;
              } else {
                L3: {
                  if (((ge) this).field_a < ((ge) this).field_k) {
                    break L3;
                  } else {
                    if (((ge) this).field_a > ((ge) this).field_k + (long)((ge) this).field_j) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.b(0);
                break L2;
              }
            }
            L4: {
              if (-1L == ((ge) this).field_k) {
                break L4;
              } else {
                if (~((long)((ge) this).field_l.length + ((ge) this).field_k) > ~(((ge) this).field_a + (long)param0)) {
                  var5_int = (int)(-((ge) this).field_a - (-((ge) this).field_k - (long)((ge) this).field_l.length));
                  kg.a(param3, param1, ((ge) this).field_l, (int)(((ge) this).field_a - ((ge) this).field_k), var5_int);
                  ((ge) this).field_a = ((ge) this).field_a + (long)var5_int;
                  param1 = param1 + var5_int;
                  param0 = param0 - var5_int;
                  ((ge) this).field_j = ((ge) this).field_l.length;
                  this.b(0);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (param0 <= ((ge) this).field_l.length) {
              if (param2 == 18017) {
                if (0 < param0) {
                  L5: {
                    if (-1L == ((ge) this).field_k) {
                      ((ge) this).field_k = ((ge) this).field_a;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    kg.a(param3, param1, ((ge) this).field_l, (int)(((ge) this).field_a - ((ge) this).field_k), param0);
                    ((ge) this).field_a = ((ge) this).field_a + (long)param0;
                    if (~(-((ge) this).field_k + ((ge) this).field_a) < ~(long)((ge) this).field_j) {
                      ((ge) this).field_j = (int)(((ge) this).field_a + -((ge) this).field_k);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              } else {
                return;
              }
            } else {
              L7: {
                if (~((ge) this).field_e != ~((ge) this).field_a) {
                  ((ge) this).field_b.a(1536, ((ge) this).field_a);
                  ((ge) this).field_e = ((ge) this).field_a;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                ((ge) this).field_b.a((byte) -104, param0, param1, param3);
                ((ge) this).field_e = ((ge) this).field_e + (long)param0;
                if (~((ge) this).field_n <= ~((ge) this).field_e) {
                  break L8;
                } else {
                  ((ge) this).field_n = ((ge) this).field_e;
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  if (~((ge) this).field_o < ~((ge) this).field_a) {
                    break L10;
                  } else {
                    if (~((ge) this).field_a > ~(((ge) this).field_o - -(long)((ge) this).field_q)) {
                      var5_long = ((ge) this).field_a;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (((ge) this).field_a > ((ge) this).field_o) {
                  break L9;
                } else {
                  if (~((ge) this).field_o > ~(((ge) this).field_a + (long)param0)) {
                    var5_long = ((ge) this).field_o;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  var7 = -1L;
                  if (~((ge) this).field_o <= ~((long)param0 + ((ge) this).field_a)) {
                    break L12;
                  } else {
                    if (~((long)((ge) this).field_q + ((ge) this).field_o) > ~((long)param0 + ((ge) this).field_a)) {
                      break L12;
                    } else {
                      var7 = (long)param0 + ((ge) this).field_a;
                      break L11;
                    }
                  }
                }
                if (~((long)((ge) this).field_q + ((ge) this).field_o) >= ~((ge) this).field_a) {
                  break L11;
                } else {
                  if ((long)((ge) this).field_q + ((ge) this).field_o > ((ge) this).field_a - -(long)param0) {
                    break L11;
                  } else {
                    var7 = ((ge) this).field_o + (long)((ge) this).field_q;
                    break L11;
                  }
                }
              }
              L13: {
                if (-1L >= var5_long) {
                  break L13;
                } else {
                  if (~var5_long <= ~var7) {
                    break L13;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    kg.a(param3, (int)((long)param1 - -var5_long - ((ge) this).field_a), ((ge) this).field_m, (int)(var5_long - ((ge) this).field_o), var9);
                    break L13;
                  }
                }
              }
              ((ge) this).field_a = ((ge) this).field_a + (long)param0;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ge) this).field_e = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5_ref;
            stackOut_51_1 = new StringBuilder().append("ge.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param3 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L14;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L14;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_p = null;
    }

    final void a(byte param0, byte[] param1) throws IOException {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ge) this).a(0, param1, param1.length, -101);
              if (param0 == -111) {
                break L1;
              } else {
                f discarded$2 = ge.a(-11, (byte) 68);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("ge.E(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var3 = ui.a(param1, param2, -3);
          if (var3 != null) {
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            L0: {
              if (param0 >= 82) {
                break L0;
              } else {
                var6 = null;
                String discarded$2 = ge.a((byte) -112, false, (CharSequence) null);
                break L0;
              }
            }
            var4 = 0;
            L1: while (true) {
              if (param2.length() > var4) {
                if (pa.a((byte) 58, param2.charAt(var4))) {
                  var4++;
                  continue L1;
                } else {
                  stackOut_11_0 = ul.field_g;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ge.K(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static int a(byte[] param0, int param1, int param2, int param3, CharSequence param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param3 + -param2;
              if (param5 <= -123) {
                break L1;
              } else {
                var10 = null;
                int discarded$1 = ge.a((byte[]) null, 67, 112, -126, (CharSequence) null, 48);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6_int) {
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param4.charAt(var7 + param2);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (var8 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (160 > var8) {
                        break L6;
                      } else {
                        if (255 < var8) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 == 8364) {
                      param0[var7 + param1] = (byte) -128;
                      break L3;
                    } else {
                      if (var8 != 8218) {
                        if (var8 == 402) {
                          param0[var7 + param1] = (byte) -125;
                          break L3;
                        } else {
                          if (var8 != 8222) {
                            if (8230 != var8) {
                              if (8224 != var8) {
                                if (var8 == 8225) {
                                  param0[param1 + var7] = (byte) -121;
                                  break L3;
                                } else {
                                  if (var8 == 710) {
                                    param0[param1 + var7] = (byte) -120;
                                    break L3;
                                  } else {
                                    if (var8 == 8240) {
                                      param0[param1 - -var7] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (352 != var8) {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param0[param1 - -var7] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (var8 == 381) {
                                              param0[var7 + param1] = (byte) -114;
                                              break L3;
                                            } else {
                                              if (var8 == 8216) {
                                                param0[var7 + param1] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (8217 != var8) {
                                                  if (var8 == 8220) {
                                                    param0[var7 + param1] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (8221 != var8) {
                                                      if (var8 != 8226) {
                                                        if (8211 == var8) {
                                                          param0[param1 - -var7] = (byte) -106;
                                                          break L3;
                                                        } else {
                                                          if (var8 == 8212) {
                                                            param0[var7 + param1] = (byte) -105;
                                                            break L3;
                                                          } else {
                                                            if (var8 == 732) {
                                                              param0[param1 - -var7] = (byte) -104;
                                                              break L3;
                                                            } else {
                                                              if (8482 != var8) {
                                                                if (var8 == 353) {
                                                                  param0[var7 + param1] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (8250 != var8) {
                                                                    if (var8 == 339) {
                                                                      param0[var7 + param1] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 == 376) {
                                                                          param0[var7 + param1] = (byte) -97;
                                                                          break L3;
                                                                        } else {
                                                                          param0[param1 + var7] = (byte) 63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param0[var7 + param1] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param0[param1 + var7] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              } else {
                                                                param0[param1 + var7] = (byte) -103;
                                                                break L3;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        param0[param1 + var7] = (byte) -107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      param0[param1 - -var7] = (byte) -108;
                                                      break L3;
                                                    }
                                                  }
                                                } else {
                                                  param0[param1 - -var7] = (byte) -110;
                                                  break L3;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          param0[var7 + param1] = (byte) -117;
                                          break L3;
                                        }
                                      } else {
                                        param0[param1 - -var7] = (byte) -118;
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              } else {
                                param0[param1 - -var7] = (byte) -122;
                                break L3;
                              }
                            } else {
                              param0[var7 + param1] = (byte) -123;
                              break L3;
                            }
                          } else {
                            param0[var7 + param1] = (byte) -124;
                            break L3;
                          }
                        }
                      } else {
                        param0[param1 - -var7] = (byte) -126;
                        break L3;
                      }
                    }
                  }
                  param0[var7 + param1] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("ge.J(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          L8: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param4 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L8;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param5 + 41);
        }
        return stackIn_69_0;
    }

    final long b(boolean param0) {
        if (!param0) {
            return -64L;
        }
        return ((ge) this).field_h;
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ((ge) this).field_q = 0;
        if (!(~((ge) this).field_a == ~((ge) this).field_e)) {
            ((ge) this).field_b.a(1536, ((ge) this).field_a);
            ((ge) this).field_e = ((ge) this).field_a;
        }
        ((ge) this).field_o = ((ge) this).field_a;
        while (((ge) this).field_q < ((ge) this).field_m.length) {
            var2 = -((ge) this).field_q + ((ge) this).field_m.length;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = ((ge) this).field_b.a(((ge) this).field_m, var2, -1, ((ge) this).field_q);
            if (var3 == -1) {
                break;
            }
            ((ge) this).field_e = ((ge) this).field_e + (long)var3;
            ((ge) this).field_q = ((ge) this).field_q + var3;
        }
    }

    final void a(long param0, byte param1) throws IOException {
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        if (param1 != -63) {
            return;
        }
        ((ge) this).field_a = param0;
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (-1L != ((ge) this).field_k) {
            L1: {
              if (~((ge) this).field_k == ~((ge) this).field_e) {
                break L1;
              } else {
                ((ge) this).field_b.a(1536, ((ge) this).field_k);
                ((ge) this).field_e = ((ge) this).field_k;
                break L1;
              }
            }
            L2: {
              ((ge) this).field_b.a((byte) -87, ((ge) this).field_j, 0, ((ge) this).field_l);
              ((ge) this).field_e = ((ge) this).field_e + (long)((ge) this).field_j;
              if (((ge) this).field_e <= ((ge) this).field_n) {
                break L2;
              } else {
                ((ge) this).field_n = ((ge) this).field_e;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((ge) this).field_k < ((ge) this).field_o) {
                  break L4;
                } else {
                  if (((ge) this).field_k >= (long)((ge) this).field_q + ((ge) this).field_o) {
                    break L4;
                  } else {
                    var2 = ((ge) this).field_k;
                    break L3;
                  }
                }
              }
              if (((ge) this).field_o < ((ge) this).field_k) {
                break L3;
              } else {
                if (~(((ge) this).field_k + (long)((ge) this).field_j) >= ~((ge) this).field_o) {
                  break L3;
                } else {
                  var2 = ((ge) this).field_o;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((ge) this).field_o >= ((ge) this).field_k + (long)((ge) this).field_j) {
                  break L6;
                } else {
                  if (((ge) this).field_k + (long)((ge) this).field_j <= ((ge) this).field_o - -(long)((ge) this).field_q) {
                    var4 = ((ge) this).field_k - -(long)((ge) this).field_j;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((ge) this).field_k >= (long)((ge) this).field_q + ((ge) this).field_o) {
                break L5;
              } else {
                if (((ge) this).field_o - -(long)((ge) this).field_q <= (long)((ge) this).field_j + ((ge) this).field_k) {
                  var4 = (long)((ge) this).field_q + ((ge) this).field_o;
                  break L5;
                } else {
                  L7: {
                    if (var2 <= -1L) {
                      break L7;
                    } else {
                      if (var4 <= var2) {
                        break L7;
                      } else {
                        var6 = (int)(-var2 + var4);
                        kg.a(((ge) this).field_l, (int)(var2 - ((ge) this).field_k), ((ge) this).field_m, (int)(var2 + -((ge) this).field_o), var6);
                        break L7;
                      }
                    }
                  }
                  ((ge) this).field_k = -1L;
                  ((ge) this).field_j = 0;
                  break L0;
                }
              }
            }
            L8: {
              if (var2 <= -1L) {
                break L8;
              } else {
                if (var4 <= var2) {
                  break L8;
                } else {
                  var6 = (int)(-var2 + var4);
                  kg.a(((ge) this).field_l, (int)(var2 - ((ge) this).field_k), ((ge) this).field_m, (int)(var2 + -((ge) this).field_o), var6);
                  break L8;
                }
              }
            }
            ((ge) this).field_k = -1L;
            ((ge) this).field_j = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final static f a(int param0, byte param1) {
        f var2 = new f();
        ql.field_i.a((gi) (Object) var2, 255);
        if (param1 >= -74) {
            f discarded$0 = ge.a(103, (byte) 124);
        }
        bj.a(2591, param0);
        return var2;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 + param2 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param2 + param0);
            } else {
              L1: {
                if (param3 <= -95) {
                  break L1;
                } else {
                  field_p = null;
                  break L1;
                }
              }
              L2: {
                if (((ge) this).field_k == -1L) {
                  break L2;
                } else {
                  if (~((ge) this).field_k < ~((ge) this).field_a) {
                    break L2;
                  } else {
                    if (~((long)((ge) this).field_j + ((ge) this).field_k) <= ~(((ge) this).field_a + (long)param2)) {
                      kg.a(((ge) this).field_l, (int)(-((ge) this).field_k + ((ge) this).field_a), param1, param0, param2);
                      ((ge) this).field_a = ((ge) this).field_a + (long)param2;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var5_long = ((ge) this).field_a;
                var7 = param0;
                var8 = param2;
                if (~((ge) this).field_o < ~((ge) this).field_a) {
                  break L3;
                } else {
                  if (((ge) this).field_a >= ((ge) this).field_o + (long)((ge) this).field_q) {
                    break L3;
                  } else {
                    L4: {
                      var9_int = (int)((long)((ge) this).field_q - (-((ge) this).field_o + ((ge) this).field_a));
                      if (var9_int <= param2) {
                        break L4;
                      } else {
                        var9_int = param2;
                        break L4;
                      }
                    }
                    kg.a(((ge) this).field_m, (int)(-((ge) this).field_o + ((ge) this).field_a), param1, param0, var9_int);
                    param2 = param2 - var9_int;
                    param0 = param0 + var9_int;
                    ((ge) this).field_a = ((ge) this).field_a + (long)var9_int;
                    break L3;
                  }
                }
              }
              L5: {
                if (param2 <= ((ge) this).field_m.length) {
                  if (param2 <= 0) {
                    break L5;
                  } else {
                    L6: {
                      this.a((byte) -102);
                      var9_int = param2;
                      if (var9_int <= ((ge) this).field_q) {
                        break L6;
                      } else {
                        var9_int = ((ge) this).field_q;
                        break L6;
                      }
                    }
                    kg.a(((ge) this).field_m, 0, param1, param0, var9_int);
                    param0 = param0 + var9_int;
                    ((ge) this).field_a = ((ge) this).field_a + (long)var9_int;
                    param2 = param2 - var9_int;
                    break L5;
                  }
                } else {
                  ((ge) this).field_b.a(1536, ((ge) this).field_a);
                  ((ge) this).field_e = ((ge) this).field_a;
                  L7: while (true) {
                    if (param2 <= 0) {
                      break L5;
                    } else {
                      var9_int = ((ge) this).field_b.a(param1, param2, -1, param0);
                      if (-1 == var9_int) {
                        break L5;
                      } else {
                        param2 = param2 - var9_int;
                        ((ge) this).field_a = ((ge) this).field_a + (long)var9_int;
                        param0 = param0 + var9_int;
                        ((ge) this).field_e = ((ge) this).field_e + (long)var9_int;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                if (((ge) this).field_k != -1L) {
                  L9: {
                    if (~((ge) this).field_a <= ~((ge) this).field_k) {
                      break L9;
                    } else {
                      if (param2 > 0) {
                        L10: {
                          var9_int = (int)(((ge) this).field_k - ((ge) this).field_a) + param0;
                          if (param2 + param0 < var9_int) {
                            var9_int = param0 + param2;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: while (true) {
                          if (param0 >= var9_int) {
                            break L9;
                          } else {
                            int incrementValue$1 = param0;
                            param0++;
                            param1[incrementValue$1] = (byte) 0;
                            param2--;
                            ((ge) this).field_a = ((ge) this).field_a + 1L;
                            continue L11;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                  L12: {
                    L13: {
                      var9 = -1L;
                      if (~var5_long < ~((ge) this).field_k) {
                        break L13;
                      } else {
                        if (((ge) this).field_k >= (long)var8 + var5_long) {
                          break L13;
                        } else {
                          var9 = ((ge) this).field_k;
                          break L12;
                        }
                      }
                    }
                    if (((ge) this).field_k > var5_long) {
                      break L12;
                    } else {
                      if (~(((ge) this).field_k - -(long)((ge) this).field_j) >= ~var5_long) {
                        break L12;
                      } else {
                        var9 = var5_long;
                        break L12;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      var11 = -1L;
                      if (~((long)((ge) this).field_j + ((ge) this).field_k) >= ~var5_long) {
                        break L15;
                      } else {
                        if ((long)((ge) this).field_j + ((ge) this).field_k > var5_long + (long)var8) {
                          break L15;
                        } else {
                          var11 = ((ge) this).field_k - -(long)((ge) this).field_j;
                          break L14;
                        }
                      }
                    }
                    if ((long)var8 + var5_long <= ((ge) this).field_k) {
                      break L14;
                    } else {
                      if ((long)((ge) this).field_j + ((ge) this).field_k >= var5_long + (long)var8) {
                        var11 = (long)var8 + var5_long;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L8;
                  } else {
                    if (~var9 <= ~var11) {
                      break L8;
                    } else {
                      var13 = (int)(-var9 + var11);
                      kg.a(((ge) this).field_l, (int)(var9 + -((ge) this).field_k), param1, var7 + (int)(-var5_long + var9), var13);
                      if (~((ge) this).field_a > ~var11) {
                        param2 = (int)((long)param2 - (-((ge) this).field_a + var11));
                        ((ge) this).field_a = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              if (param2 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ge) this).field_e = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) var5_ref;
            stackOut_60_1 = new StringBuilder().append("ge.C(").append(param0).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L16;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L16;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    ge(pf param0, int param1, int param2) throws IOException {
        ((ge) this).field_j = 0;
        ((ge) this).field_k = -1L;
        ((ge) this).field_o = -1L;
        try {
            ((ge) this).field_b = param0;
            long dupTemp$0 = param0.a(-105);
            ((ge) this).field_n = dupTemp$0;
            ((ge) this).field_h = dupTemp$0;
            ((ge) this).field_a = 0L;
            ((ge) this).field_l = new byte[param2];
            ((ge) this).field_m = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ge.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new he[1];
        field_i = "Score";
        field_c = "Email (Login):";
        field_g = "Play free version";
    }
}
