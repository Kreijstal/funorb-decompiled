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
            return (int[]) null;
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
        this.field_o = this.field_o & -3;
        this.field_p = 255;
        this.field_o = this.field_o | 4;
        if (param0) {
            hb.a((byte) 103);
        }
    }

    final static void a(int param0, ec param1, qg param2, int param3) {
        try {
            int[] discarded$2 = null;
            byte[] array$3 = null;
            RuntimeException var4 = null;
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
            Object var18 = null;
            oe var18_ref = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var14 = DungeonAssault.field_K;
            try {
              L0: {
                L1: {
                  var18_ref = new oe();
                  var18_ref.field_q = param1.c(true);
                  var18_ref.field_j = param1.h(-43);
                  var18_ref.field_o = new pn[var18_ref.field_q];
                  var18_ref.field_l = new int[var18_ref.field_q];
                  var18_ref.field_k = new byte[var18_ref.field_q][][];
                  var18_ref.field_s = new pn[var18_ref.field_q];
                  if (param0 == -5) {
                    break L1;
                  } else {
                    discarded$2 = hb.a((byte) -84, 16);
                    break L1;
                  }
                }
                var18_ref.field_r = new int[var18_ref.field_q];
                var18_ref.field_n = new int[var18_ref.field_q];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var18_ref.field_q) {
                    fe.field_k.a(var18_ref, false);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param1.c(true);
                            if (var6_int == 0) {
                              break L5;
                            } else {
                              if ((var6_int ^ -1) == -2) {
                                break L5;
                              } else {
                                if (2 == var6_int) {
                                  break L5;
                                } else {
                                  L6: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L6;
                                    } else {
                                      if (4 == var6_int) {
                                        break L6;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 0;
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param1.d(-111);
                                  var21 = param1.d(-127);
                                  var9 = param1.c(true);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var11_int >= var9) {
                                      L8: {
                                        var22 = new byte[var9][];
                                        var19 = var22;
                                        var11 = var19;
                                        if (3 != var6_int) {
                                          break L8;
                                        } else {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var9 <= var12_int) {
                                              break L8;
                                            } else {
                                              var13 = param1.h(-58);
                                              array$3 = new byte[var13];
                                              var11[var12_int] = array$3;
                                              param1.a((byte) -98, 0, var13, var22[var12_int]);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                      var18_ref.field_n[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          var18_ref.field_o[var5] = param2.a(var12, al.a(var20, (byte) -121), -1, var21);
                                          var18_ref.field_k[var5] = var22;
                                          break L4;
                                        } else {
                                          var12[var17] = al.a(var10[var17], (byte) -121);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param1.d(-116);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            var15 = param1.d(-119);
                            var16 = param1.d(-114);
                            var9 = 0;
                            if (var6_int != 1) {
                              break L11;
                            } else {
                              var9 = param1.h(-46);
                              break L11;
                            }
                          }
                          var18_ref.field_n[var5] = var6_int;
                          var18_ref.field_l[var5] = var9;
                          var18_ref.field_s[var5] = param2.a(65535, al.a(var15, (byte) -125), var16);
                          break L4;
                        }
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18_ref.field_r[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18_ref.field_r[var5] = -2;
                        decompiledRegionSelector0 = 1;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18_ref.field_r[var5] = -3;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18_ref.field_r[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18_ref.field_r[var5] = -5;
                        decompiledRegionSelector0 = 1;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_35_0 = (RuntimeException) (var4);
                stackOut_35_1 = new StringBuilder().append("hb.B(").append(param0).append(',');
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param1 == null) {
                  stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L17;
                } else {
                  stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L17;
                }
              }
              L18: {
                stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param2 == null) {
                  stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L18;
                } else {
                  stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L18;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param3 + ')');
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
        this.field_o = this.field_o | 2;
        this.field_p = param0;
    }

    hb(int param0, int param1) {
        this.field_j = param0;
        this.field_c = param1;
        this.field_n = hp.field_b[this.field_c];
        this.field_p = 0;
        this.field_o = 0;
        if (this.field_n != null) {
            this.field_k = this.field_n.field_o;
            this.field_g = this.field_n.field_r;
            this.field_e = this.field_n.field_m;
            this.field_f = this.field_n.field_b;
        }
    }

    static {
        field_l = "Search";
        field_h = "Raging Beast";
        field_m = new int[]{1, 2, 3, 5, 10, 15, 25, 50};
    }
}
