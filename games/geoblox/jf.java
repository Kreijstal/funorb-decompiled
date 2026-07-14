/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf implements dh {
    private int field_i;
    static int field_g;
    private int field_d;
    static int[] field_b;
    private int field_e;
    static int field_j;
    static dm field_a;
    private int field_h;
    private m field_f;
    private int field_k;
    private int field_l;
    static int field_c;

    final static void a(byte param0) {
        gf.field_d = new qh();
        if (param0 < 19) {
          field_a = null;
          hk.field_C.b((el) (Object) gf.field_d, -54);
          return;
        } else {
          hk.field_C.b((el) (Object) gf.field_d, -54);
          return;
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ol var12 = null;
        el stackIn_3_0 = null;
        el stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = Geoblox.field_C;
          if (param4 instanceof ol) {
            stackOut_2_0 = (el) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (el) (Object) stackOut_1_0;
            break L0;
          }
        }
        var12 = (ol) (Object) stackIn_3_0;
        if (param1 < -5) {
          L1: {
            if (var12 == null) {
              break L1;
            } else {
              break L1;
            }
          }
          vb.a(param4.field_v + param0, param4.field_m + param2, param4.field_r, param4.field_h, ((jf) this).field_h);
          var7 = -(2 * var12.field_H) + param4.field_r;
          var8 = param0 - (-param4.field_v - var12.field_H);
          var9 = var12.field_G + param2 + param4.field_m;
          vb.g(var8, var9, var7 + var8, var9, ((jf) this).field_d);
          var10 = var12.a((byte) 86) - 1;
          L2: while (true) {
            if ((var10 ^ -1) > -1) {
              if (null != ((jf) this).field_f) {
                ((jf) this).field_f.b(var12.field_s, var8 - -(var7 / 2), ((jf) this).field_f.field_p + var9 + var12.field_G, ((jf) this).field_k, ((jf) this).field_l);
                return;
              } else {
                return;
              }
            } else {
              vb.d(var7 * var12.c(-113, var10) / var12.g(-128) + var8, var9, ((jf) this).field_i, ((jf) this).field_e);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final static java.awt.Container a(boolean param0) {
        if (sg.field_a != null) {
            return (java.awt.Container) (Object) sg.field_a;
        }
        if (!param0) {
            field_c = 78;
            return (java.awt.Container) (Object) k.c(122);
        }
        return (java.awt.Container) (Object) k.c(122);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = Geoblox.field_C;
        L0: while (true) {
          param7--;
          if ((param7 ^ -1) > -1) {
            if (param2 != 33423689) {
              field_c = -7;
              return;
            } else {
              return;
            }
          } else {
            var17 = param9;
            var10 = var17;
            var11 = param0;
            var12 = param3;
            var13 = param5;
            var14 = param8;
            var15 = var17[var11] >> -1748235839 & 8355711;
            var10[var11] = cd.a(255, var14 >> -1416780783) + ((cd.a(33423689, var13) >> -151652535) + (cd.a(33423360, var12) >> -400894207)) + var15;
            param0++;
            param8 = param8 + param4;
            param3 = param3 + param1;
            param5 = param5 + param6;
            continue L0;
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = 14 % ((param0 - 27) / 47);
        field_b = null;
    }

    final static void a(dm[] param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = Geoblox.field_C;
        if (param0 != null) {
          if (-1 > (param3 ^ -1)) {
            var6 = param0[0].field_s;
            var7 = param0[2].field_s;
            var8 = param0[1].field_s;
            param0[0].e(param2, param4, param1);
            param0[2].e(-var7 + (param2 - -param3), param4, param1);
            vb.a(da.field_d);
            vb.b(var6 + param2, param4, -var7 + param3 + param2, param4 - -param0[1].field_o);
            var9 = param2 - -var6;
            var10 = -var7 + (param2 + param3);
            param2 = var9;
            L0: while (true) {
              if (param2 >= var10) {
                vb.b(da.field_d);
                if (param5 != -17154) {
                  var12 = null;
                  byte[] discarded$1 = jf.a((CharSequence) null, (byte) 66);
                  return;
                } else {
                  return;
                }
              } else {
                param0[1].e(param2, param4, param1);
                param2 = param2 + var8;
                continue L0;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static byte[] a(CharSequence param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = Geoblox.field_C;
        if (param1 >= 117) {
          L0: {
            var2 = param0.length();
            var3 = new byte[var2];
            var4 = 0;
            if (var2 <= var4) {
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param0.charAt(var4);
                    if (var5 <= 0) {
                      break L3;
                    } else {
                      if (var5 < 128) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 < 160) {
                      break L4;
                    } else {
                      if (255 < var5) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              L19: {
                                                L20: {
                                                  L21: {
                                                    L22: {
                                                      L23: {
                                                        L24: {
                                                          L25: {
                                                            L26: {
                                                              L27: {
                                                                L28: {
                                                                  L29: {
                                                                    L30: {
                                                                      L31: {
                                                                        if (8364 != var5) {
                                                                          if (var5 != 8218) {
                                                                            if (402 != var5) {
                                                                              if (8222 != var5) {
                                                                                if (var5 == 8230) {
                                                                                  var3[var4] = (byte)-123;
                                                                                  break L5;
                                                                                } else {
                                                                                  if (var5 != 8224) {
                                                                                    if (var5 != 8225) {
                                                                                      if (var5 != 710) {
                                                                                        if (var5 == 8240) {
                                                                                          var3[var4] = (byte)-119;
                                                                                          break L6;
                                                                                        } else {
                                                                                          if (352 == var5) {
                                                                                            var3[var4] = (byte)-118;
                                                                                            break L7;
                                                                                          } else {
                                                                                            if (8249 == var5) {
                                                                                              var3[var4] = (byte)-117;
                                                                                              break L8;
                                                                                            } else {
                                                                                              if (338 != var5) {
                                                                                                if (var5 == 381) {
                                                                                                  var3[var4] = (byte)-114;
                                                                                                  break L9;
                                                                                                } else {
                                                                                                  if (8216 == var5) {
                                                                                                    var3[var4] = (byte)-111;
                                                                                                    break L10;
                                                                                                  } else {
                                                                                                    if (8217 == var5) {
                                                                                                      var3[var4] = (byte)-110;
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      if (var5 != 8220) {
                                                                                                        if (var5 == 8221) {
                                                                                                          var3[var4] = (byte)-108;
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          if (var5 == 8226) {
                                                                                                            var3[var4] = (byte)-107;
                                                                                                            break L13;
                                                                                                          } else {
                                                                                                            if (8211 == var5) {
                                                                                                              var3[var4] = (byte)-106;
                                                                                                              break L14;
                                                                                                            } else {
                                                                                                              if (var5 != 8212) {
                                                                                                                if (var5 != 732) {
                                                                                                                  if (var5 != 8482) {
                                                                                                                    if (var5 != 353) {
                                                                                                                      if (var5 == 8250) {
                                                                                                                        var3[var4] = (byte)-101;
                                                                                                                        break L15;
                                                                                                                      } else {
                                                                                                                        if (var5 == 339) {
                                                                                                                          var3[var4] = (byte)-100;
                                                                                                                          break L16;
                                                                                                                        } else {
                                                                                                                          if (var5 == 382) {
                                                                                                                            var3[var4] = (byte)-98;
                                                                                                                            break L17;
                                                                                                                          } else {
                                                                                                                            if (var5 != 376) {
                                                                                                                              var3[var4] = (byte)63;
                                                                                                                              break L18;
                                                                                                                            } else {
                                                                                                                              var3[var4] = (byte)-97;
                                                                                                                              break L19;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      var3[var4] = (byte)-102;
                                                                                                                      break L20;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    var3[var4] = (byte)-103;
                                                                                                                    break L21;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  var3[var4] = (byte)-104;
                                                                                                                  break L22;
                                                                                                                }
                                                                                                              } else {
                                                                                                                var3[var4] = (byte)-105;
                                                                                                                break L23;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var3[var4] = (byte)-109;
                                                                                                        break L24;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var3[var4] = (byte)-116;
                                                                                                break L25;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var3[var4] = (byte)-120;
                                                                                        break L26;
                                                                                      }
                                                                                    } else {
                                                                                      var3[var4] = (byte)-121;
                                                                                      break L27;
                                                                                    }
                                                                                  } else {
                                                                                    var3[var4] = (byte)-122;
                                                                                    break L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var3[var4] = (byte)-124;
                                                                                break L29;
                                                                              }
                                                                            } else {
                                                                              var3[var4] = (byte)-125;
                                                                              break L30;
                                                                            }
                                                                          } else {
                                                                            var3[var4] = (byte)-126;
                                                                            break L31;
                                                                          }
                                                                        } else {
                                                                          var3[var4] = (byte)-128;
                                                                          var4++;
                                                                          break L31;
                                                                        }
                                                                      }
                                                                      var4++;
                                                                      break L30;
                                                                    }
                                                                    var4++;
                                                                    break L29;
                                                                  }
                                                                  var4++;
                                                                  break L28;
                                                                }
                                                                var4++;
                                                                break L27;
                                                              }
                                                              var4++;
                                                              break L26;
                                                            }
                                                            var4++;
                                                            break L25;
                                                          }
                                                          var4++;
                                                          break L24;
                                                        }
                                                        var4++;
                                                        break L23;
                                                      }
                                                      var4++;
                                                      break L22;
                                                    }
                                                    var4++;
                                                    break L21;
                                                  }
                                                  var4++;
                                                  break L20;
                                                }
                                                var4++;
                                                break L19;
                                              }
                                              var4++;
                                              break L18;
                                            }
                                            var4++;
                                            break L17;
                                          }
                                          var4++;
                                          break L16;
                                        }
                                        var4++;
                                        break L15;
                                      }
                                      var4++;
                                      break L14;
                                    }
                                    var4++;
                                    break L13;
                                  }
                                  var4++;
                                  break L12;
                                }
                                var4++;
                                break L11;
                              }
                              var4++;
                              break L10;
                            }
                            var4++;
                            break L9;
                          }
                          var4++;
                          break L8;
                        }
                        var4++;
                        break L7;
                      }
                      var4++;
                      break L6;
                    }
                    var4++;
                    break L5;
                  }
                  var4++;
                  break L1;
                }
                var3[var4] = (byte)var5;
                var4++;
                break L1;
              }
              var4++;
              var4++;
              break L0;
            }
          }
          return var3;
        } else {
          var7 = null;
          jf.a(25, 87, -85, 85, 111, -85, 50, 110, -77, (int[]) null);
          var2 = param0.length();
          var3 = new byte[var2];
          var4 = 0;
          L32: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              L33: {
                L34: {
                  L35: {
                    var5 = param0.charAt(var4);
                    if (var5 <= 0) {
                      break L35;
                    } else {
                      if (var5 < 128) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    if (var5 < 160) {
                      break L36;
                    } else {
                      if (255 < var5) {
                        break L36;
                      } else {
                        break L34;
                      }
                    }
                  }
                  if (8364 != var5) {
                    if (var5 != 8218) {
                      if (402 != var5) {
                        if (8222 != var5) {
                          if (var5 == 8230) {
                            var3[var4] = (byte)-123;
                            break L33;
                          } else {
                            if (var5 != 8224) {
                              if (var5 != 8225) {
                                if (var5 != 710) {
                                  if (var5 == 8240) {
                                    var3[var4] = (byte)-119;
                                    break L33;
                                  } else {
                                    if (352 == var5) {
                                      var3[var4] = (byte)-118;
                                      break L33;
                                    } else {
                                      if (8249 == var5) {
                                        var3[var4] = (byte)-117;
                                        break L33;
                                      } else {
                                        if (338 != var5) {
                                          if (var5 == 381) {
                                            var3[var4] = (byte)-114;
                                            break L33;
                                          } else {
                                            if (8216 == var5) {
                                              var3[var4] = (byte)-111;
                                              break L33;
                                            } else {
                                              if (8217 == var5) {
                                                var3[var4] = (byte)-110;
                                                break L33;
                                              } else {
                                                if (var5 != 8220) {
                                                  if (var5 == 8221) {
                                                    var3[var4] = (byte)-108;
                                                    break L33;
                                                  } else {
                                                    if (var5 == 8226) {
                                                      var3[var4] = (byte)-107;
                                                      break L33;
                                                    } else {
                                                      if (8211 == var5) {
                                                        var3[var4] = (byte)-106;
                                                        break L33;
                                                      } else {
                                                        if (var5 != 8212) {
                                                          if (var5 != 732) {
                                                            if (var5 != 8482) {
                                                              if (var5 != 353) {
                                                                if (var5 == 8250) {
                                                                  var3[var4] = (byte)-101;
                                                                  break L33;
                                                                } else {
                                                                  if (var5 == 339) {
                                                                    var3[var4] = (byte)-100;
                                                                    break L33;
                                                                  } else {
                                                                    if (var5 == 382) {
                                                                      var3[var4] = (byte)-98;
                                                                      break L33;
                                                                    } else {
                                                                      if (var5 != 376) {
                                                                        var3[var4] = (byte)63;
                                                                        break L33;
                                                                      } else {
                                                                        var3[var4] = (byte)-97;
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-102;
                                                                break L33;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-103;
                                                              break L33;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-104;
                                                            break L33;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-105;
                                                          break L33;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-109;
                                                  break L33;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var3[var4] = (byte)-116;
                                          break L33;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-120;
                                  break L33;
                                }
                              } else {
                                var3[var4] = (byte)-121;
                                break L33;
                              }
                            } else {
                              var3[var4] = (byte)-122;
                              break L33;
                            }
                          }
                        } else {
                          var3[var4] = (byte)-124;
                          break L33;
                        }
                      } else {
                        var3[var4] = (byte)-125;
                        break L33;
                      }
                    } else {
                      var3[var4] = (byte)-126;
                      break L33;
                    }
                  } else {
                    var3[var4] = (byte)-128;
                    break L33;
                  }
                }
                var3[var4] = (byte)var5;
                var4++;
                break L33;
              }
              var4++;
              continue L32;
            }
          }
        }
    }

    jf(m param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((jf) this).field_d = param3;
        ((jf) this).field_h = param4;
        ((jf) this).field_e = param6;
        ((jf) this).field_f = param0;
        ((jf) this).field_i = param5;
        ((jf) this).field_k = param1;
        ((jf) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_g = 3;
    }
}
