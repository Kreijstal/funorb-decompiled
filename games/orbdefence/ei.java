/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static String field_b;
    static String field_a;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 139) {
            ei.a(102);
        }
    }

    final static qg[] a(byte param0, int param1, int param2, ki param3) {
        if (!pk.a(101, param2, param3, param1)) {
            return null;
        }
        if (param0 != 97) {
            return null;
        }
        return ba.a(17867);
    }

    final static void a(int param0) {
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        hj var7 = null;
        hj var10 = null;
        hj var11 = null;
        Object var12 = null;
        hj var15 = null;
        hj var20 = null;
        hj var24 = null;
        hj var28 = null;
        hj var38 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        ul.d(243, 197, 369, 143, 16777215);
        ul.h(244, 198, 367, 141, 0);
        if (dm.field_b == null) {
          L0: {
            if (rc.field_a != null) {
              int discarded$12 = rc.field_a.a(cj.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 == -463) {
              break L1;
            } else {
              var5 = null;
              qg[] discarded$13 = ei.a((byte) 4, -62, 74, (ki) null);
              break L1;
            }
          }
          var7 = dm.field_b[kb.field_m];
          if (var7 != null) {
            L2: {
              var7.c(245, 199);
              if (og.field_b > h.field_A) {
                var10 = dm.field_b[lj.field_u];
                if (var10 != null) {
                  var2_int = h.field_A * (var10.field_s + 60) / og.field_b;
                  var3 = -30 + var2_int;
                  if (bh.field_b) {
                    jf.a((byte) -20, var3 * -256 / 30, var10, 256 * (var10.field_s + -var3) / 30, 199, 245);
                    break L2;
                  } else {
                    jf.a((byte) -20, 256 * (-var3 + var10.field_s) / 30, var10, -256 * var3 / 30, 199, 245);
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (rc.field_a == null) {
                break L3;
              } else {
                L4: {
                  var12 = null;
                  var2 = (String) var12;
                  var6 = 0;
                  var3 = var6;
                  if (dm.field_b.length <= var6) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        L7: {
                          var11 = dm.field_b[var6];
                          if (var11 != null) {
                            L8: {
                              if (var11.field_s != 365) {
                                break L8;
                              } else {
                                if ((var11.field_t ^ -1) != -140) {
                                  break L8;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            if (var2 == null) {
                              var2 = Integer.toString(var6);
                              break L5;
                            } else {
                              var2 = var12 + ", " + var6;
                              break L6;
                            }
                          } else {
                            var6++;
                            break L7;
                          }
                        }
                        var6++;
                        break L6;
                      }
                      var6++;
                      break L5;
                    }
                    var6++;
                    var6++;
                    var6++;
                    var6++;
                    var6++;
                    break L4;
                  }
                }
                if (var2 == null) {
                  break L3;
                } else {
                  int discarded$14 = rc.field_a.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                  break L3;
                }
              }
            }
            return;
          } else {
            L9: {
              if (rc.field_a != null) {
                int discarded$15 = rc.field_a.a(cj.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L9;
              } else {
                break L9;
              }
            }
            if (og.field_b > h.field_A) {
              var24 = dm.field_b[lj.field_u];
              if (var24 != null) {
                var2_int = h.field_A * (var24.field_s + 60) / og.field_b;
                var3 = -30 + var2_int;
                if (bh.field_b) {
                  L10: {
                    jf.a((byte) -20, var3 * -256 / 30, var24, 256 * (var24.field_s + -var3) / 30, 199, 245);
                    if (rc.field_a == null) {
                      break L10;
                    } else {
                      var2 = null;
                      var6 = 0;
                      var3 = var6;
                      L11: while (true) {
                        if (dm.field_b.length <= var6) {
                          if (var2 == null) {
                            break L10;
                          } else {
                            int discarded$16 = rc.field_a.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                            return;
                          }
                        } else {
                          var38 = dm.field_b[var6];
                          if (var38 != null) {
                            L12: {
                              if (var38.field_s != 365) {
                                break L12;
                              } else {
                                if ((var38.field_t ^ -1) != -140) {
                                  break L12;
                                } else {
                                  var6++;
                                  continue L11;
                                }
                              }
                            }
                            if (var2 == null) {
                              var2 = Integer.toString(var6);
                              var6++;
                              continue L11;
                            } else {
                              var2 = var2 + ", " + var6;
                              var6++;
                              continue L11;
                            }
                          } else {
                            var6++;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  jf.a((byte) -20, 256 * (-var3 + var24.field_s) / 30, var24, -256 * var3 / 30, 199, 245);
                  if (rc.field_a != null) {
                    var2 = null;
                    var6 = 0;
                    var3 = var6;
                    L13: while (true) {
                      if (dm.field_b.length <= var6) {
                        if (var2 != null) {
                          int discarded$17 = rc.field_a.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var28 = dm.field_b[var6];
                        if (var28 != null) {
                          L14: {
                            if (var28.field_s != 365) {
                              break L14;
                            } else {
                              if ((var28.field_t ^ -1) != -140) {
                                break L14;
                              } else {
                                var6++;
                                continue L13;
                              }
                            }
                          }
                          if (var2 == null) {
                            var2 = Integer.toString(var6);
                            var6++;
                            continue L13;
                          } else {
                            var2 = var2 + ", " + var6;
                            var6++;
                            continue L13;
                          }
                        } else {
                          var6++;
                          continue L13;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (rc.field_a != null) {
                  var2 = null;
                  var6 = 0;
                  var3 = var6;
                  L15: while (true) {
                    if (dm.field_b.length <= var6) {
                      if (var2 != null) {
                        int discarded$18 = rc.field_a.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var20 = dm.field_b[var6];
                      if (var20 != null) {
                        L16: {
                          if (var20.field_s != 365) {
                            break L16;
                          } else {
                            if ((var20.field_t ^ -1) != -140) {
                              break L16;
                            } else {
                              var6++;
                              continue L15;
                            }
                          }
                        }
                        if (var2 == null) {
                          var2 = Integer.toString(var6);
                          var6++;
                          continue L15;
                        } else {
                          var2 = var2 + ", " + var6;
                          var6++;
                          continue L15;
                        }
                      } else {
                        var6++;
                        continue L15;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              if (rc.field_a != null) {
                var2 = null;
                var6 = 0;
                var3 = var6;
                L17: while (true) {
                  if (dm.field_b.length <= var6) {
                    if (var2 == null) {
                      return;
                    } else {
                      int discarded$19 = rc.field_a.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      return;
                    }
                  } else {
                    var15 = dm.field_b[var6];
                    if (var15 != null) {
                      L18: {
                        if (var15.field_s != 365) {
                          break L18;
                        } else {
                          if ((var15.field_t ^ -1) != -140) {
                            break L18;
                          } else {
                            var6++;
                            continue L17;
                          }
                        }
                      }
                      if (var2 == null) {
                        var2 = Integer.toString(var6);
                        var6++;
                        continue L17;
                      } else {
                        var2 = var2 + ", " + var6;
                        var6++;
                        continue L17;
                      }
                    } else {
                      var6++;
                      continue L17;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names should contain a maximum of 12 characters";
        field_b = "Area";
    }
}
