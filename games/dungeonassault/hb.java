/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    h field_n;
    int field_c;
    int field_p;
    static String field_l;
    static int[] field_m;
    wb[] field_i;
    int field_o;
    wd field_b;
    int field_j;
    int field_e;
    int field_k;
    int field_g;
    int field_d;
    int field_f;
    static String field_h;
    static bb field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 3) {
            hb.a((byte) 75);
        }
        field_h = null;
        field_l = null;
        field_m = null;
    }

    final static int[] a(byte param0, int param1) {
        int var5 = DungeonAssault.field_K;
        if (param0 != -111) {
            return null;
        }
        int var2 = param1;
        int var3 = 0;
        while (true) {
            var2 = jb.field_Sb[var2];
            if (-1 == jb.field_Sb[var2]) {
                break;
            }
            var3++;
        }
        int[] var4 = new int[var3];
        var2 = param1;
        while (-1 != jb.field_Sb[var2]) {
            var3--;
            var4[var3] = var2;
            var2 = jb.field_Sb[var2];
        }
        return var4;
    }

    final void a(boolean param0) {
        ((hb) this).field_o = ((hb) this).field_o & -3;
        ((hb) this).field_p = 255;
        ((hb) this).field_o = ((hb) this).field_o | 4;
        if (param0) {
            hb.a((byte) 103);
        }
    }

    final static void a(int param0, ec param1, qg param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            oe var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = DungeonAssault.field_K;
              var18 = new oe();
              var18.field_q = param1.c(true);
              var18.field_j = param1.h(-43);
              var18.field_o = new pn[var18.field_q];
              var18.field_l = new int[var18.field_q];
              var18.field_k = new byte[var18.field_q][][];
              var18.field_s = new pn[var18.field_q];
              if (param0 == -5) {
                break L0;
              } else {
                int[] discarded$1 = hb.a((byte) -84, 16);
                break L0;
              }
            }
            var18.field_r = new int[var18.field_q];
            var18.field_n = new int[var18.field_q];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var18.field_q) {
                var6_ref4 = decompiledCaughtException;
                var18.field_r[var5] = -5;
                var5++;
              } else {
                try {
                  L2: {
                    L3: {
                      var6_int = param1.c(true);
                      if (var6_int == 0) {
                        break L3;
                      } else {
                        if ((var6_int ^ -1) == -2) {
                          break L3;
                        } else {
                          if (2 == var6_int) {
                            break L3;
                          } else {
                            L4: {
                              if ((var6_int ^ -1) == -4) {
                                break L4;
                              } else {
                                if (4 == var6_int) {
                                  break L4;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                            }
                            var20 = param1.d(-111);
                            var21 = param1.d(-127);
                            var9 = param1.c(true);
                            var10 = new String[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var24 = new byte[var9][];
                                  var23 = var24;
                                  var22 = var23;
                                  var19 = var22;
                                  var11 = var19;
                                  if (3 != var6_int) {
                                    break L6;
                                  } else {
                                    var12_int = 0;
                                    L7: while (true) {
                                      if (var9 <= var12_int) {
                                        break L6;
                                      } else {
                                        var13 = param1.h(-58);
                                        var11[var12_int] = new byte[var13];
                                        param1.a((byte) -98, 0, var13, var24[var12_int]);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var18.field_n[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L8: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_o[var5] = param2.a(var12, al.a(var20, (byte) -121), -1, var21);
                                    var18.field_k[var5] = var24;
                                    var5++;
                                    break L2;
                                  } else {
                                    var12[var17] = al.a(var10[var17], (byte) -121);
                                    var17++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var10[var11_int] = param1.d(-116);
                                var11_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      var15 = param1.d(-119);
                      var16 = param1.d(-114);
                      var9 = 0;
                      if (var6_int != 1) {
                        break L9;
                      } else {
                        var9 = param1.h(-46);
                        break L9;
                      }
                    }
                    var18.field_n[var5] = var6_int;
                    var18.field_l[var5] = var9;
                    var18.field_s[var5] = param2.a(65535, al.a(var15, (byte) -125), var16);
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_r[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_r[var5] = -4;
                  var5++;
                }
                continue L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param0 == -38) {
          L0: {
            L1: {
              L2: {
                if (0 >= param1) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 > 255) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              if (param1 == 8364) {
                var2 = -128;
                break L0;
              } else {
                if (param1 == 8218) {
                  var2 = -126;
                  break L0;
                } else {
                  if (param1 == 402) {
                    var2 = -125;
                    break L0;
                  } else {
                    if (param1 == 8222) {
                      var2 = -124;
                      break L0;
                    } else {
                      if (param1 != 8230) {
                        if (param1 == 8224) {
                          var2 = -122;
                          break L0;
                        } else {
                          if (8225 != param1) {
                            if (param1 == 710) {
                              var2 = -120;
                              break L0;
                            } else {
                              if (param1 == 8240) {
                                var2 = -119;
                                break L0;
                              } else {
                                if (param1 == 352) {
                                  var2 = -118;
                                  break L0;
                                } else {
                                  if (param1 != 8249) {
                                    if (param1 == 338) {
                                      var2 = -116;
                                      break L0;
                                    } else {
                                      if (381 != param1) {
                                        if (param1 != 8216) {
                                          if (8217 == param1) {
                                            var2 = -110;
                                            break L0;
                                          } else {
                                            if (param1 == 8220) {
                                              var2 = -109;
                                              break L0;
                                            } else {
                                              if (param1 != 8221) {
                                                if (param1 == 8226) {
                                                  var2 = -107;
                                                  break L0;
                                                } else {
                                                  if (param1 != 8211) {
                                                    if (8212 == param1) {
                                                      var2 = -105;
                                                      break L0;
                                                    } else {
                                                      if (param1 != 732) {
                                                        if (8482 != param1) {
                                                          if (param1 != 353) {
                                                            if (param1 == 8250) {
                                                              var2 = -101;
                                                              break L0;
                                                            } else {
                                                              if (param1 == 339) {
                                                                var2 = -100;
                                                                break L0;
                                                              } else {
                                                                if (param1 == 382) {
                                                                  var2 = -98;
                                                                  break L0;
                                                                } else {
                                                                  if (param1 != 376) {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  }
                                                                }
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
                                                      } else {
                                                        var2 = -104;
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                var2 = -108;
                                                break L0;
                                              }
                                            }
                                          }
                                        } else {
                                          var2 = -111;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -114;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                    break L0;
                                  }
                                }
                              }
                            }
                          } else {
                            var2 = -121;
                            break L0;
                          }
                        }
                      } else {
                        var2 = -123;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            var2 = (byte)param1;
            break L0;
          }
          return (byte) var2;
        } else {
          return (byte) 27;
        }
    }

    final void a(int param0) {
        ((hb) this).field_o = ((hb) this).field_o | 2;
        ((hb) this).field_p = param0;
    }

    hb(int param0, int param1) {
        ((hb) this).field_j = param0;
        ((hb) this).field_c = param1;
        ((hb) this).field_n = hp.field_b[((hb) this).field_c];
        ((hb) this).field_p = 0;
        ((hb) this).field_o = 0;
        if (((hb) this).field_n != null) {
            ((hb) this).field_k = ((hb) this).field_n.field_o;
            ((hb) this).field_g = ((hb) this).field_n.field_r;
            ((hb) this).field_e = ((hb) this).field_n.field_m;
            ((hb) this).field_f = ((hb) this).field_n.field_b;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Search";
        field_h = "Raging Beast";
        field_m = new int[]{1, 2, 3, 5, 10, 15, 25, 50};
    }
}
