/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends c implements bp {
    static int field_ib;
    static String field_eb;
    static ak field_cb;
    static int field_db;
    static int field_fb;
    static int field_bb;
    static ak field_kb;
    static ak field_lb;
    static String field_jb;
    private ml field_gb;
    private int field_hb;

    gk(String param0, fn param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2, ng param3) {
        super.a(param0, param1, param2, param3);
        ((gk) this).field_hb = uf.field_d - (((gk) this).field_z + param2);
    }

    public final ml a(int param0) {
        if (param0 != 1) {
            field_fb = -57;
        }
        return ((gk) this).field_gb;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        if (param2 == -128) {
          L0: {
            var5 = param3 + param0;
            var6 = param4 + param1;
            if (t.field_e < param0) {
              stackOut_4_0 = param0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = t.field_e;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (param1 > t.field_f) {
              stackOut_7_0 = param1;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = t.field_f;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (t.field_h > var5) {
              stackOut_10_0 = var5;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = t.field_h;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (t.field_a > var6) {
              stackOut_13_0 = var6;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = t.field_a;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_14_0;
            if (t.field_e > param0) {
              break L4;
            } else {
              if (t.field_h <= param0) {
                break L4;
              } else {
                var11 = param0 + var8 * t.field_j;
                var12 = var10 + 1 + -var8 >> 1392153825;
                L5: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L4;
                  } else {
                    t.field_k[var11] = 16777215;
                    var11 = var11 + t.field_j * 2;
                    continue L5;
                  }
                }
              }
            }
          }
          L6: {
            if (param1 < t.field_f) {
              break L6;
            } else {
              if (var6 >= t.field_a) {
                break L6;
              } else {
                var11 = var7 + param1 * t.field_j;
                var12 = -var7 + 1 - -var9 >> -773675615;
                L7: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L6;
                  } else {
                    t.field_k[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              }
            }
          }
          L8: {
            if (t.field_e > var5) {
              break L8;
            } else {
              if (var5 >= t.field_h) {
                break L8;
              } else {
                var11 = var5 + ((-param0 + var5 & 1) + var8) * t.field_j;
                var12 = -var8 + var10 + 1 >> -1275793535;
                L9: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L8;
                  } else {
                    t.field_k[var11] = 16777215;
                    var11 = var11 + 2 * t.field_j;
                    continue L9;
                  }
                }
              }
            }
          }
          L10: {
            if (t.field_f > param1) {
              break L10;
            } else {
              if (t.field_a <= var6) {
                break L10;
              } else {
                var11 = var7 + (t.field_j * var6 - -(-param1 + var6 & 1));
                var12 = var9 + (1 - var7) >> 564298145;
                L11: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L10;
                  } else {
                    t.field_k[var11] = 16777215;
                    var11 += 2;
                    continue L11;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void f(boolean param0) {
        field_eb = null;
        field_kb = null;
        field_jb = null;
        field_lb = null;
        if (param0) {
            field_kb = null;
        }
        field_cb = null;
    }

    final void a(byte param0, ml param1) {
        if (param0 <= 16) {
            ((gk) this).field_hb = 89;
        }
        ((gk) this).field_gb = param1;
    }

    final String b(byte param0) {
        if (!((gk) this).field_D) {
            return null;
        }
        if (null == ((gk) this).field_l) {
            return null;
        }
        if (param0 <= 16) {
            field_cb = null;
        }
        nk.a(bg.field_k, ((gk) this).field_E - ((gk) this).field_hb + uf.field_d, 5818);
        return ((gk) this).field_l;
    }

    final static byte[] b(CharSequence param0, int param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          if (param1 == 353) {
            break L0;
          } else {
            field_ib = 30;
            break L0;
          }
        }
        var2 = param0.length();
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param0.charAt(var4);
                  if (var5 <= 0) {
                    break L4;
                  } else {
                    if (var5 < 128) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (160 > var5) {
                    break L5;
                  } else {
                    if (var5 <= 255) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var5 == 8364) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (var5 != 8218) {
                    if (402 != var5) {
                      if (8222 == var5) {
                        var3[var4] = (byte)-124;
                        break L2;
                      } else {
                        if (var5 != 8230) {
                          if (var5 != 8224) {
                            if (var5 != 8225) {
                              if (710 == var5) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 != 352) {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (338 == var5) {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      } else {
                                        if (var5 != 381) {
                                          if (8216 != var5) {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            } else {
                                              if (8220 == var5) {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              } else {
                                                if (var5 == 8221) {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                } else {
                                                  if (var5 == 8226) {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8211) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (var5 == 8212) {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      } else {
                                                        if (var5 != 732) {
                                                          if (8482 == var5) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 353) {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            } else {
                                                              if (var5 != 8250) {
                                                                if (var5 == 339) {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                } else {
                                                                  if (382 != var5) {
                                                                    if (var5 != 376) {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              var3[var4] = (byte)-121;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte)-122;
                            break L2;
                          }
                        } else {
                          var3[var4] = (byte)-123;
                          break L2;
                        }
                      }
                    } else {
                      var3[var4] = (byte)-125;
                      break L2;
                    }
                  } else {
                    var3[var4] = (byte)-126;
                    break L2;
                  }
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

    final void n(int param0) {
        super.n(param0 + 0);
        if (((gk) this).field_gb != null) {
            ((gk) this).field_gb.b(2048);
        }
        if (param0 != 1392153825) {
            Object var3 = null;
            ((gk) this).a(-125, 48, -57, (ng) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = "No";
        field_bb = 0;
        field_jb = "Account created successfully!";
    }
}
