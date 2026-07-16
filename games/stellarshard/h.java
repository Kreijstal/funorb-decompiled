/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static wb field_a;
    static int field_d;
    static int field_c;
    static int field_b;

    final static String a(String param0, int param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_25_0 = false;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_24_0 = false;
        var11 = stellarshard.field_B;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          stackOut_1_0 = -1;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 >= (var6_int ^ -1)) {
                  break L3;
                } else {
                  if (var11 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_4_0 = var6_int - -2;
              stackIn_6_0 = stackOut_4_0;
              L4: while (true) {
                var5 = stackIn_6_0;
                L5: while (true) {
                  L6: {
                    if (var3 <= var5) {
                      break L6;
                    } else {
                      stackOut_8_0 = bh.a(param1 + -1, param0.charAt(var5));
                      stackIn_2_0 = stackOut_8_0 ? 1 : 0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var11 != 0) {
                        continue L1;
                      } else {
                        if (!stackIn_9_0) {
                          break L6;
                        } else {
                          var5++;
                          if (var11 == 0) {
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (!rg.a((byte) 19, (CharSequence) (Object) var7_ref_String)) {
                    continue L0;
                  } else {
                    stackOut_13_0 = var5;
                    stackOut_13_1 = var3;
                    stackIn_5_0 = stackOut_13_0;
                    stackIn_5_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (var11 != 0) {
                      stackOut_5_0 = stackIn_5_0 - stackIn_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      continue L4;
                    } else {
                      L7: {
                        if (stackIn_14_0 >= stackIn_14_1) {
                          break L7;
                        } else {
                          if (param0.charAt(var5) == 62) {
                            var5++;
                            var8 = pf.a((CharSequence) (Object) var7_ref_String, (byte) 125);
                            var4 = var4 + (param2[var8].length() - (var5 - var6_int));
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var11 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = param1;
            L8: while (true) {
              var8 = param0.indexOf("<%", var5);
              stackOut_20_0 = -1;
              stackIn_21_0 = stackOut_20_0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (stackIn_21_0 < (var8 ^ -1)) {
                      break L11;
                    } else {
                      var5 = 2 + var8;
                      L12: while (true) {
                        L13: {
                          if ((var5 ^ -1) <= (var3 ^ -1)) {
                            break L13;
                          } else {
                            stackOut_24_0 = bh.a(-1, param0.charAt(var5));
                            stackIn_21_0 = stackOut_24_0 ? 1 : 0;
                            stackIn_25_0 = stackOut_24_0;
                            if (var11 != 0) {
                              continue L9;
                            } else {
                              if (!stackIn_25_0) {
                                break L13;
                              } else {
                                var5++;
                                if (var11 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                        var9 = param0.substring(2 + var8, var5);
                        if (!rg.a((byte) 19, (CharSequence) (Object) var9)) {
                          continue L8;
                        } else {
                          if (var11 != 0) {
                            break L10;
                          } else {
                            L14: {
                              if (var5 >= var3) {
                                break L14;
                              } else {
                                if (param0.charAt(var5) == 62) {
                                  var5++;
                                  var10 = pf.a((CharSequence) (Object) var9, (byte) 125);
                                  StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                                  var7 = var5;
                                  StringBuilder discarded$4 = var6.append(param2[var10]);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (var11 == 0) {
                              continue L8;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                  }
                  StringBuilder discarded$5 = var6.append(param0.substring(var7));
                  break L10;
                }
                return var6.toString();
              }
            }
          }
        }
    }

    final static boolean a(ka param0, int param1) {
        int var2 = param0.f(param1 + -31180);
        int var3 = var2 != 1 ? 0 : 1;
        if (param1 != 31184) {
            field_d = 3;
            return var3 != 0;
        }
        return var3 != 0;
    }

    final static sk a(String param0, byte param1, boolean param2, String param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var4 = 0L;
        if (param1 <= -95) {
          L0: {
            L1: {
              var6 = null;
              if ((param3.indexOf('@') ^ -1) != 0) {
                break L1;
              } else {
                var8 = (CharSequence) (Object) param3;
                var4 = nd.a(var8, (byte) -35);
                if (stellarshard.field_B == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (Object) (Object) param3;
            break L0;
          }
          return wf.a(var4, (String) var6, -79, param0, param2);
        } else {
          L2: {
            L3: {
              boolean discarded$2 = h.a((ka) null, 24);
              var6 = null;
              if ((param3.indexOf('@') ^ -1) != 0) {
                break L3;
              } else {
                var7 = (CharSequence) (Object) param3;
                var4 = nd.a(var7, (byte) -35);
                if (stellarshard.field_B == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var6 = (Object) (Object) param3;
            break L2;
          }
          return wf.a(var4, (String) var6, -79, param0, param2);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= 20) {
            return;
        }
        field_c = -122;
    }

    final static void a(int param0, int param1) {
        gg var2 = null;
        int var3 = 0;
        le var4 = null;
        var3 = stellarshard.field_B;
        var4 = (le) (Object) fg.field_G.b(-126);
        L0: while (true) {
          if (var4 == null) {
            var2 = gg.field_b.b(-109);
            L1: while (true) {
              if (var2 != null) {
                ff.a(1, param1);
                var2 = gg.field_b.b((byte) 103);
                if (var3 == 0) {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    if (param0 > -25) {
                      sk discarded$5 = h.a((String) null, (byte) 67, false, (String) null);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L2: {
                  if (param0 <= -25) {
                    break L2;
                  } else {
                    sk discarded$6 = h.a((String) null, (byte) 67, false, (String) null);
                    break L2;
                  }
                }
                return;
              }
            }
          } else {
            nh.a(var4, (byte) -30, param1);
            var4 = (le) (Object) fg.field_G.b((byte) -32);
            if (var3 == 0) {
              if (var3 == 0) {
                continue L0;
              } else {
                var2 = gg.field_b.b(-109);
                L3: while (true) {
                  L4: {
                    if (var2 == null) {
                      break L4;
                    } else {
                      ff.a(1, param1);
                      var2 = gg.field_b.b((byte) 103);
                      if (var3 == 0) {
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  if (param0 <= -25) {
                    return;
                  } else {
                    sk discarded$7 = h.a((String) null, (byte) 67, false, (String) null);
                    return;
                  }
                }
              }
            } else {
              L5: while (true) {
                if (var4 == null) {
                  if (param0 <= -25) {
                    return;
                  } else {
                    sk discarded$8 = h.a((String) null, (byte) 67, false, (String) null);
                    return;
                  }
                } else {
                  ff.a(1, param1);
                  var2 = gg.field_b.b((byte) 103);
                  if (var3 == 0) {
                    if (var3 == 0) {
                      continue L5;
                    } else {
                      if (param0 <= -25) {
                        return;
                      } else {
                        sk discarded$9 = h.a((String) null, (byte) 67, false, (String) null);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wb();
        field_c = -1;
        field_b = 4;
    }
}
