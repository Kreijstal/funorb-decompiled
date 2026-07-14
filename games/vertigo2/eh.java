/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static int field_c;
    static cr field_a;
    static int field_e;
    static String field_g;
    static String[] field_d;
    static int[] field_b;
    static int field_f;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        int var1 = 61 % ((0 - param0) / 56);
        field_a = null;
    }

    final static int a(int param0, byte param1) {
        param0 = (param0 & 1431655765) - -(-715827883 & param0 >>> -1138217023);
        param0 = ((-858993460 & param0) >>> 1931715138) + (858993459 & param0);
        param0 = (param0 >>> 613732516) + param0 & 252645135;
        param0 = param0 + (param0 >>> 488011976);
        if (param1 != -64) {
          return -96;
        } else {
          param0 = param0 + (param0 >>> -975357936);
          return param0 & 255;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        var6 = -param5 + param1;
        var7 = -param3 + param0;
        if (param2 == -4) {
          if (0 != var6) {
            if (var7 == 0) {
              e.a(param2 ^ -29, param1, param4, param3, param5);
              return;
            } else {
              var12 = (var7 << -39990932) / var6;
              var13 = -(param5 * var12 >> 148742604) + param3;
              if (ap.field_e <= param1) {
                if (param1 <= ib.field_a) {
                  var11 = param0;
                  var9 = param1;
                  if (ap.field_e <= param5) {
                    if (ib.field_a >= param5) {
                      var8 = param5;
                      var10 = param3;
                      if (ua.field_e > var11) {
                        var11 = ua.field_e;
                        var9 = (ua.field_e - var13 << -637454868) / var12;
                        if (var10 >= ua.field_e) {
                          if (var10 > cj.field_D) {
                            var8 = (cj.field_D + -var13 << 622425676) / var12;
                            var10 = cj.field_D;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          } else {
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          var10 = ua.field_e;
                          var8 = (ua.field_e + -var13 << 2007506956) / var12;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        if (var11 > cj.field_D) {
                          var9 = (cj.field_D + -var13 << 1420265900) / var12;
                          var11 = cj.field_D;
                          if (var10 >= ua.field_e) {
                            if (var10 > cj.field_D) {
                              var8 = (cj.field_D + -var13 << 622425676) / var12;
                              var10 = cj.field_D;
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            } else {
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            }
                          } else {
                            var10 = ua.field_e;
                            var8 = (ua.field_e + -var13 << 2007506956) / var12;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          if (var10 >= ua.field_e) {
                            if (var10 > cj.field_D) {
                              var8 = (cj.field_D + -var13 << 622425676) / var12;
                              var10 = cj.field_D;
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            } else {
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            }
                          } else {
                            var10 = ua.field_e;
                            var8 = (ua.field_e + -var13 << 2007506956) / var12;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        }
                      }
                    } else {
                      var10 = (ib.field_a * var12 >> -278828308) + var13;
                      var8 = ib.field_a;
                      if (ua.field_e > var11) {
                        var11 = ua.field_e;
                        var9 = (ua.field_e - var13 << -637454868) / var12;
                        if (var10 >= ua.field_e) {
                          if (var10 > cj.field_D) {
                            var8 = (cj.field_D + -var13 << 622425676) / var12;
                            var10 = cj.field_D;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          } else {
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          var10 = ua.field_e;
                          var8 = (ua.field_e + -var13 << 2007506956) / var12;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        if (var11 > cj.field_D) {
                          var9 = (cj.field_D + -var13 << 1420265900) / var12;
                          var11 = cj.field_D;
                          if (var10 >= ua.field_e) {
                            if (var10 > cj.field_D) {
                              var8 = (cj.field_D + -var13 << 622425676) / var12;
                              var10 = cj.field_D;
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            } else {
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            }
                          } else {
                            var10 = ua.field_e;
                            var8 = (ua.field_e + -var13 << 2007506956) / var12;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          if (var10 >= ua.field_e) {
                            if (var10 > cj.field_D) {
                              var8 = (cj.field_D + -var13 << 622425676) / var12;
                              var10 = cj.field_D;
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            } else {
                              uj.a(var8, var9, var11, true, var10, param4);
                              return;
                            }
                          } else {
                            var10 = ua.field_e;
                            var8 = (ua.field_e + -var13 << 2007506956) / var12;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    var10 = (var12 * ap.field_e >> 1674432204) + var13;
                    var8 = ap.field_e;
                    if (ua.field_e > var11) {
                      var11 = ua.field_e;
                      var9 = (ua.field_e - var13 << -637454868) / var12;
                      if (var10 >= ua.field_e) {
                        if (var10 > cj.field_D) {
                          var8 = (cj.field_D + -var13 << 622425676) / var12;
                          var10 = cj.field_D;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        } else {
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        var10 = ua.field_e;
                        var8 = (ua.field_e + -var13 << 2007506956) / var12;
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      }
                    } else {
                      if (var11 > cj.field_D) {
                        var9 = (cj.field_D + -var13 << 1420265900) / var12;
                        var11 = cj.field_D;
                        if (var10 >= ua.field_e) {
                          if (var10 > cj.field_D) {
                            var8 = (cj.field_D + -var13 << 622425676) / var12;
                            var10 = cj.field_D;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          } else {
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          var10 = ua.field_e;
                          var8 = (ua.field_e + -var13 << 2007506956) / var12;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        if (var10 >= ua.field_e) {
                          if (var10 > cj.field_D) {
                            var8 = (cj.field_D + -var13 << 622425676) / var12;
                            var10 = cj.field_D;
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          } else {
                            uj.a(var8, var9, var11, true, var10, param4);
                            return;
                          }
                        } else {
                          var10 = ua.field_e;
                          var8 = (ua.field_e + -var13 << 2007506956) / var12;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L0: {
                    var9 = ib.field_a;
                    var11 = (ib.field_a * var12 >> 1383530828) + var13;
                    if (ap.field_e <= param5) {
                      if (ib.field_a >= param5) {
                        var8 = param5;
                        var10 = param3;
                        break L0;
                      } else {
                        var10 = (ib.field_a * var12 >> -278828308) + var13;
                        var8 = ib.field_a;
                        break L0;
                      }
                    } else {
                      var10 = (var12 * ap.field_e >> 1674432204) + var13;
                      var8 = ap.field_e;
                      break L0;
                    }
                  }
                  if (ua.field_e > var11) {
                    var11 = ua.field_e;
                    var9 = (ua.field_e - var13 << -637454868) / var12;
                    if (var10 >= ua.field_e) {
                      if (var10 > cj.field_D) {
                        var8 = (cj.field_D + -var13 << 622425676) / var12;
                        var10 = cj.field_D;
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      } else {
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      }
                    } else {
                      var10 = ua.field_e;
                      var8 = (ua.field_e + -var13 << 2007506956) / var12;
                      uj.a(var8, var9, var11, true, var10, param4);
                      return;
                    }
                  } else {
                    if (var11 > cj.field_D) {
                      var9 = (cj.field_D + -var13 << 1420265900) / var12;
                      var11 = cj.field_D;
                      if (var10 >= ua.field_e) {
                        if (var10 > cj.field_D) {
                          var8 = (cj.field_D + -var13 << 622425676) / var12;
                          var10 = cj.field_D;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        } else {
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        var10 = ua.field_e;
                        var8 = (ua.field_e + -var13 << 2007506956) / var12;
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      }
                    } else {
                      if (var10 >= ua.field_e) {
                        if (var10 > cj.field_D) {
                          var8 = (cj.field_D + -var13 << 622425676) / var12;
                          var10 = cj.field_D;
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        } else {
                          uj.a(var8, var9, var11, true, var10, param4);
                          return;
                        }
                      } else {
                        var10 = ua.field_e;
                        var8 = (ua.field_e + -var13 << 2007506956) / var12;
                        uj.a(var8, var9, var11, true, var10, param4);
                        return;
                      }
                    }
                  }
                }
              } else {
                L1: {
                  var9 = ap.field_e;
                  var11 = var13 - -(var12 * ap.field_e >> -659717140);
                  if (ap.field_e <= param5) {
                    if (ib.field_a >= param5) {
                      var8 = param5;
                      var10 = param3;
                      break L1;
                    } else {
                      var10 = (ib.field_a * var12 >> -278828308) + var13;
                      var8 = ib.field_a;
                      break L1;
                    }
                  } else {
                    var10 = (var12 * ap.field_e >> 1674432204) + var13;
                    var8 = ap.field_e;
                    break L1;
                  }
                }
                L2: {
                  if (ua.field_e > var11) {
                    var11 = ua.field_e;
                    var9 = (ua.field_e - var13 << -637454868) / var12;
                    break L2;
                  } else {
                    if (var11 > cj.field_D) {
                      var9 = (cj.field_D + -var13 << 1420265900) / var12;
                      var11 = cj.field_D;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var10 >= ua.field_e) {
                  if (var10 > cj.field_D) {
                    var8 = (cj.field_D + -var13 << 622425676) / var12;
                    var10 = cj.field_D;
                    uj.a(var8, var9, var11, true, var10, param4);
                    return;
                  } else {
                    uj.a(var8, var9, var11, true, var10, param4);
                    return;
                  }
                } else {
                  var10 = ua.field_e;
                  var8 = (ua.field_e + -var13 << 2007506956) / var12;
                  uj.a(var8, var9, var11, true, var10, param4);
                  return;
                }
              }
            }
          } else {
            L3: {
              if (var7 != 0) {
                cr.b(param3, param0, param2 ^ 3, param5, param4);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        if (!(!param1.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (param1.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (param1.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (param0 != -1147375319) {
            field_d = null;
            if (!(!param1.equals((Object) (Object) "Z"))) {
                return Boolean.TYPE;
            }
            if (param1.equals((Object) (Object) "F")) {
                return Float.TYPE;
            }
            if (param1.equals((Object) (Object) "D")) {
                return Double.TYPE;
            }
            if (!(!param1.equals((Object) (Object) "C"))) {
                return Character.TYPE;
            }
            return Class.forName(param1);
        }
        if (!(!param1.equals((Object) (Object) "Z"))) {
            return Boolean.TYPE;
        }
        if (param1.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (param1.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1 != param7) {
          if (param4 == 16711680) {
            if (param0 + -param7 >= ap.field_e) {
              if (ib.field_a >= param7 + param0) {
                if (param2 - param1 >= ua.field_e) {
                  if (cj.field_D >= param2 + param1) {
                    ip.a(param3, param0, param5, (byte) -45, param6, param7, param2, param1);
                    return;
                  } else {
                    sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
                    return;
                  }
                } else {
                  sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
                  return;
                }
              } else {
                sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
                return;
              }
            } else {
              sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
              return;
            }
          } else {
            field_f = 45;
            if (param0 + -param7 >= ap.field_e) {
              if (ib.field_a >= param7 + param0) {
                if (param2 - param1 >= ua.field_e) {
                  if (cj.field_D >= param2 + param1) {
                    ip.a(param3, param0, param5, (byte) -45, param6, param7, param2, param1);
                    return;
                  } else {
                    sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
                    return;
                  }
                } else {
                  sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
                  return;
                }
              } else {
                sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
                return;
              }
            } else {
              sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
              return;
            }
          }
        } else {
          nf.a(param5, param6, (byte) 121, param0, param3, param7, param2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 200;
        field_g = "Invite players";
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
