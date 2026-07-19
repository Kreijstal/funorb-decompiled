/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;

    public static void a(int param0) {
        if (param0 != -15180) {
            ac.a((byte) 86);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        o var5 = null;
        o var6 = null;
        o var7 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            mi.g(243, 197, 369, 143, 16777215);
            mi.b(244, 198, 367, 141, 0);
            if (null == jb.field_d) {
              L1: {
                if (sk.field_n != null) {
                  discarded$4 = sk.field_n.a(te.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                L3: {
                  var5 = jb.field_d[we.field_h];
                  var6 = var5;
                  var6 = var5;
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.d(245, 199);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (null == sk.field_n) {
                  break L2;
                } else {
                  discarded$5 = sk.field_n.a(te.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L2;
                }
              }
              L4: {
                if (ti.field_e < uc.field_e) {
                  var6 = jb.field_d[vb.field_g];
                  if (var6 == null) {
                    break L4;
                  } else {
                    L5: {
                      var2_int = (var6.field_q - -60) * ti.field_e / uc.field_e;
                      var3 = -30 + var2_int;
                      if (!fh.field_g) {
                        break L5;
                      } else {
                        fl.a(256 * (var6.field_q + -var3) / 30, -256 * var3 / 30, 245, -128, 199, var6);
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    fl.a(var3 * -256 / 30, 256 * (-var3 + var6.field_q) / 30, 245, 51, 199, var6);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (sk.field_n != null) {
                  var2 = null;
                  var3 = 0;
                  L7: while (true) {
                    L8: {
                      if (var3 >= jb.field_d.length) {
                        break L8;
                      } else {
                        var7 = jb.field_d[var3];
                        if (var4 != 0) {
                          break L6;
                        } else {
                          L9: {
                            if (var7 == null) {
                              break L9;
                            } else {
                              L10: {
                                if (365 != var7.field_q) {
                                  break L10;
                                } else {
                                  if ((var7.field_r ^ -1) != -140) {
                                    break L10;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L11: {
                                if (var2 != null) {
                                  break L11;
                                } else {
                                  var2 = Integer.toString(var3);
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var2 = (String) (var2) + ", " + var3;
                              break L9;
                            }
                          }
                          var3++;
                          if (var4 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    if (var2 == null) {
                      break L6;
                    } else {
                      discarded$6 = sk.field_n.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      break L6;
                    }
                  }
                } else {
                  break L6;
                }
              }
              if (param0 < -110) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                discarded$7 = ac.a(61, false);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ac.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, boolean param1) {
        if (!param1) {
          return -57;
        } else {
          param0--;
          param0 = param0 | param0 >>> 1664989313;
          param0 = param0 | param0 >>> 1943770146;
          param0 = param0 | param0 >>> -1869216828;
          param0 = param0 | param0 >>> -1103602104;
          param0 = param0 | param0 >>> 325046672;
          return param0 - -1;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
          return 0;
        } else {
          if (0 >= param0) {
            L0: {
              var2 = 2;
              if (param0 >= -65536) {
                break L0;
              } else {
                param0 = param0 >> 16;
                var2 += 16;
                break L0;
              }
            }
            if (param1 < 123) {
              return -17;
            } else {
              L1: {
                if (param0 < -256) {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (15 < (param0 ^ -1)) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((param0 ^ -1) > 3) {
                  param0 = param0 >> 2;
                  var2 += 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param0 >= -2) {
                  break L4;
                } else {
                  var2++;
                  param0 = param0 >> 1;
                  break L4;
                }
              }
              return var2;
            }
          } else {
            L5: {
              var2 = 1;
              if (param0 > 65535) {
                param0 = param0 >> 16;
                var2 += 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 > 255) {
                var2 += 8;
                param0 = param0 >> 8;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-16 <= (param0 ^ -1)) {
                break L7;
              } else {
                param0 = param0 >> 4;
                var2 += 4;
                break L7;
              }
            }
            L8: {
              if (-4 <= (param0 ^ -1)) {
                break L8;
              } else {
                param0 = param0 >> 2;
                var2 += 2;
                break L8;
              }
            }
            L9: {
              if (1 >= param0) {
                break L9;
              } else {
                var2++;
                param0 = param0 >> 1;
                break L9;
              }
            }
            return var2;
          }
        }
    }

    static {
        field_a = "Press the left mouse button to fire";
    }
}
