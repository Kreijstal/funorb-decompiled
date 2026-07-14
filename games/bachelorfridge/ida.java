/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ida extends at {
    static String field_o;
    int field_l;
    int field_j;
    int field_q;
    int field_r;
    int field_k;
    gj field_s;
    int field_n;
    int field_m;
    nq field_p;

    final static String a(int param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        var10 = BachelorFridge.field_y;
        var16 = new char[param0];
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var4 = var12;
        var5 = 0;
        if (param3 == 258048) {
          var6 = param2;
          var7 = param2 - -param0;
          L0: while (true) {
            if (var7 <= var6) {
              return new String(var16, 0, var5);
            } else {
              L1: {
                var6++;
                var8 = param1[var6] & 255;
                if (var8 >= 128) {
                  if (var8 >= 192) {
                    if (var8 >= 224) {
                      if (240 > var8) {
                        L2: {
                          if (1 + var6 >= var7) {
                            break L2;
                          } else {
                            if (-129 != (192 & param1[var6])) {
                              break L2;
                            } else {
                              if (-129 == (param1[1 + var6] & 192)) {
                                var6++;
                                var6++;
                                var9 = param1[var6] << 1471130918 & 4032 | var8 << 2034350924 & 61440 | 63 & param1[var6];
                                if ((var9 ^ -1) <= -2049) {
                                  break L1;
                                } else {
                                  var9 = 65533;
                                  break L1;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var9 = 65533;
                        break L1;
                      } else {
                        if (var8 >= 248) {
                          var9 = 65533;
                          break L1;
                        } else {
                          L3: {
                            if (var6 - -2 >= var7) {
                              break L3;
                            } else {
                              if (128 != (192 & param1[var6])) {
                                break L3;
                              } else {
                                if ((param1[1 + var6] & 192) != 128) {
                                  break L3;
                                } else {
                                  if ((param1[2 + var6] & 192) != 128) {
                                    break L3;
                                  } else {
                                    L4: {
                                      var6++;
                                      var6++;
                                      var6++;
                                      var9 = 258048 & param1[var6] << -74573204 | 1835008 & var8 << 1214871954 | 4032 & param1[var6] << -886791098 | param1[var6] & 63;
                                      if (-65537 < var9) {
                                        break L4;
                                      } else {
                                        if (-1114112 < var9) {
                                          break L4;
                                        } else {
                                          var9 = 65533;
                                          break L1;
                                        }
                                      }
                                    }
                                    var9 = 65533;
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                          var9 = 65533;
                          break L1;
                        }
                      }
                    } else {
                      L5: {
                        if (var7 <= var6) {
                          break L5;
                        } else {
                          if (128 != (192 & param1[var6])) {
                            break L5;
                          } else {
                            var6++;
                            var9 = (var8 & 31) << 731110502 | 63 & param1[var6];
                            if ((var9 ^ -1) > -129) {
                              var9 = 65533;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      var9 = 65533;
                      break L1;
                    }
                  } else {
                    var9 = 65533;
                    break L1;
                  }
                } else {
                  if (0 != var8) {
                    var9 = var8;
                    break L1;
                  } else {
                    var9 = 65533;
                    break L1;
                  }
                }
              }
              var5++;
              var12[var5] = (char)var9;
              continue L0;
            }
          }
        } else {
          var11 = null;
          pn discarded$1 = ida.a(-52, (vr) null, -120);
          var6 = param2;
          var7 = param2 - -param0;
          L6: while (true) {
            if (var7 <= var6) {
              return new String(var16, 0, var5);
            } else {
              L7: {
                var6++;
                var8 = param1[var6] & 255;
                if (var8 >= 128) {
                  if (var8 >= 192) {
                    if (var8 >= 224) {
                      if (240 > var8) {
                        L8: {
                          if (1 + var6 >= var7) {
                            break L8;
                          } else {
                            if (-129 != (192 & param1[var6])) {
                              break L8;
                            } else {
                              if (-129 == (param1[1 + var6] & 192)) {
                                var6++;
                                var6++;
                                var9 = param1[var6] << 1471130918 & 4032 | var8 << 2034350924 & 61440 | 63 & param1[var6];
                                if ((var9 ^ -1) <= -2049) {
                                  break L7;
                                } else {
                                  var9 = 65533;
                                  break L7;
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        var9 = 65533;
                        break L7;
                      } else {
                        if (var8 >= 248) {
                          var9 = 65533;
                          break L7;
                        } else {
                          L9: {
                            if (var6 - -2 >= var7) {
                              break L9;
                            } else {
                              if (128 != (192 & param1[var6])) {
                                break L9;
                              } else {
                                if ((param1[1 + var6] & 192) != 128) {
                                  break L9;
                                } else {
                                  if ((param1[2 + var6] & 192) != 128) {
                                    break L9;
                                  } else {
                                    L10: {
                                      var6++;
                                      var6++;
                                      var6++;
                                      var9 = 258048 & param1[var6] << -74573204 | 1835008 & var8 << 1214871954 | 4032 & param1[var6] << -886791098 | param1[var6] & 63;
                                      if (-65537 < var9) {
                                        break L10;
                                      } else {
                                        if (-1114112 < var9) {
                                          break L10;
                                        } else {
                                          var9 = 65533;
                                          break L7;
                                        }
                                      }
                                    }
                                    var9 = 65533;
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var9 = 65533;
                          break L7;
                        }
                      }
                    } else {
                      L11: {
                        if (var7 <= var6) {
                          break L11;
                        } else {
                          if (128 != (192 & param1[var6])) {
                            break L11;
                          } else {
                            var6++;
                            var9 = (var8 & 31) << 731110502 | 63 & param1[var6];
                            if ((var9 ^ -1) > -129) {
                              var9 = 65533;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var9 = 65533;
                      break L7;
                    }
                  } else {
                    var9 = 65533;
                    break L7;
                  }
                } else {
                  if (0 != var8) {
                    var9 = var8;
                    break L7;
                  } else {
                    var9 = 65533;
                    break L7;
                  }
                }
              }
              var5++;
              var12[var5] = (char)var9;
              continue L6;
            }
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_o = null;
    }

    final static kv[] a(int param0, int param1, int param2, int param3) {
        if (param1 > -13) {
            return null;
        }
        return to.a(param0, param2, -25974, 1, param3);
    }

    final static pn a(int param0, vr param1, int param2) {
        if (param0 != 0) {
            field_o = null;
            return vw.field_a[param2];
        }
        return vw.field_a[param2];
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -109) {
          L0: {
            ((ida) this).field_l = 82;
            if (((ida) this).field_n <= ((ida) this).field_q) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ida) this).field_n <= ((ida) this).field_q) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        aga var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var4 = ((ida) this).field_p.a(64, ((ida) this).field_s.field_h);
        ad discarded$1 = ((ida) this).field_s.b(var4, -23990);
        if (param2 == 27230) {
          ((ida) this).field_l = 0;
          ((ida) this).field_j = 0;
          ((ida) this).field_n = 0;
          if (param0 != -3) {
            if (-2 != param0) {
              if (4 != param0) {
                if ((param0 ^ -1) != -4) {
                  return;
                } else {
                  ((ida) this).field_j = param1;
                  return;
                }
              } else {
                ((ida) this).field_l = param1;
                return;
              }
            } else {
              ((ida) this).field_j = -param1;
              return;
            }
          } else {
            ((ida) this).field_l = -param1;
            return;
          }
        } else {
          ((ida) this).field_n = -76;
          ((ida) this).field_l = 0;
          ((ida) this).field_j = 0;
          ((ida) this).field_n = 0;
          if (param0 != -3) {
            if (-2 != param0) {
              if (4 != param0) {
                if ((param0 ^ -1) != -4) {
                  return;
                } else {
                  ((ida) this).field_j = param1;
                  return;
                }
              } else {
                ((ida) this).field_l = param1;
                return;
              }
            } else {
              ((ida) this).field_j = -param1;
              return;
            }
          } else {
            ((ida) this).field_l = -param1;
            return;
          }
        }
    }

    final static n a(String param0, int param1) {
        Object var3 = null;
        if (param1 != -203) {
          var3 = null;
          n discarded$2 = ida.a((String) null, -32);
          return new n(param0);
        } else {
          return new n(param0);
        }
    }

    ida(gj param0, nq param1, int param2, int param3) {
        ((ida) this).field_k = param2;
        ((ida) this).field_s = param0;
        ((ida) this).field_r = param3;
        ((ida) this).field_p = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Actions";
    }
}
