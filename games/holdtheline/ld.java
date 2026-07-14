/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    private gn field_a;
    private gn field_g;
    static String field_f;
    static gn field_c;
    static int field_b;
    private og field_d;
    private og field_e;

    public static void a(int param0) {
        field_c = null;
        int var1 = 99 / ((param0 - 4) / 49);
        field_f = null;
    }

    private final el a(int param0, int[] param1, String param2) {
        if (param0 == -1610608641) {
          if (((ld) this).field_a.a("", true)) {
            return this.a("", param1, 24340, param2);
          } else {
            return this.a(param2, param1, param0 ^ -1610592021, "");
          }
        } else {
          ld.a(64);
          if (((ld) this).field_a.a("", true)) {
            return this.a("", param1, 24340, param2);
          } else {
            return this.a(param2, param1, param0 ^ -1610592021, "");
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (-1 != param1) {
          if (param0 <= -65) {
            if (param1 > 0) {
              L0: {
                var2 = 1;
                if (-65536 <= (param1 ^ -1)) {
                  break L0;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L0;
                }
              }
              L1: {
                if (255 < param1) {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (15 < param1) {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 < param1) {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 <= 1) {
                  break L4;
                } else {
                  param1 = param1 >> 1;
                  var2++;
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                var2 = 2;
                if (param1 >= -65536) {
                  break L5;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L5;
                }
              }
              L6: {
                if (param1 >= -256) {
                  break L6;
                } else {
                  param1 = param1 >> 8;
                  var2 += 8;
                  break L6;
                }
              }
              L7: {
                if (15 < (param1 ^ -1)) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param1 >= -4) {
                  break L8;
                } else {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L8;
                }
              }
              L9: {
                if (-2 > param1) {
                  var2++;
                  param1 = param1 >> 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            }
          } else {
            field_f = null;
            if (param1 > 0) {
              L10: {
                var2 = 1;
                if (-65536 >= param1) {
                  break L10;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L10;
                }
              }
              L11: {
                if (255 < param1) {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (15 < param1) {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (3 < param1) {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (param1 <= 1) {
                  break L14;
                } else {
                  param1 = param1 >> 1;
                  var2++;
                  break L14;
                }
              }
              return var2;
            } else {
              L15: {
                var2 = 2;
                if (param1 >= -65536) {
                  break L15;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L15;
                }
              }
              L16: {
                if (param1 >= -256) {
                  break L16;
                } else {
                  param1 = param1 >> 8;
                  var2 += 8;
                  break L16;
                }
              }
              L17: {
                if (15 < (param1 ^ -1)) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (param1 >= -4) {
                  break L18;
                } else {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L18;
                }
              }
              L19: {
                if (-2 > param1) {
                  var2++;
                  param1 = param1 >> 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              return var2;
            }
          }
        } else {
          return 0;
        }
    }

    private final el a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        el var8 = null;
        el var8_ref = null;
        el var10 = null;
        pm var11 = null;
        el var12 = null;
        pm var13 = null;
        el var14 = null;
        var5 = (param3 >>> -1623309940 | (param3 & -1610608641) << -874076508) ^ param1;
        var5 = var5 | param3 << 453811120;
        var6 = (long)var5;
        var8 = (el) (Object) ((ld) this).field_e.a((byte) 114, var6);
        if (var8 == null) {
          if (param0 != null) {
            if (param0[0] > 0) {
              var13 = pm.a(((ld) this).field_a, param3, param1);
              if (var13 != null) {
                var14 = var13.b();
                var10 = var14;
                var8_ref = var14;
                ((ld) this).field_e.a((hl) (Object) var8_ref, var6, false);
                if (param2 != -14322) {
                  return null;
                } else {
                  L0: {
                    if (param0 != null) {
                      param0[0] = param0[0] - var14.field_n.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var11 = pm.a(((ld) this).field_a, param3, param1);
            if (var11 != null) {
              var12 = var11.b();
              var8_ref = var12;
              ((ld) this).field_e.a((hl) (Object) var8_ref, var6, false);
              if (param2 != -14322) {
                return null;
              } else {
                L1: {
                  if (param0 != null) {
                    param0[0] = param0[0] - var12.field_n.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          return var8;
        }
    }

    final el a(String param0, byte param1) {
        int var3 = -124 / ((-61 - param1) / 62);
        return this.a(-1610608641, (int[]) null, param0);
    }

    final el a(int[] param0, int param1, byte param2) {
        Object var5 = null;
        if ((((ld) this).field_g.b(-1) ^ -1) == -2) {
          return this.a(param1, param0, 0, 0);
        } else {
          if (param2 == 115) {
            if (1 == ((ld) this).field_g.a((byte) 120, param1)) {
              return this.a(0, param0, 0, param1);
            } else {
              throw new RuntimeException();
            }
          } else {
            var5 = null;
            String discarded$4 = ld.a(false, true, (CharSequence) null);
            if (1 == ((ld) this).field_g.a((byte) 120, param1)) {
              return this.a(0, param0, 0, param1);
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final el a(int param0, String param1) {
        if (param0 != -32660) {
            ld.a(49);
            return this.a((int[]) null, param1, -343045972);
        }
        return this.a((int[]) null, param1, -343045972);
    }

    final el a(int param0, byte param1, int[] param2) {
        if (((ld) this).field_a.b(-1) != 1) {
          if ((((ld) this).field_a.a((byte) 125, param0) ^ -1) == -2) {
            return this.a(param2, 0, -14322, param0);
          } else {
            if (param1 < 91) {
              return null;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return this.a(param2, param0, -14322, 0);
        }
    }

    private final el a(int[] param0, String param1, int param2) {
        Object var5 = null;
        if (!((ld) this).field_g.a("", true)) {
          if (param2 != -343045972) {
            var5 = null;
            el discarded$2 = ((ld) this).a(124, (byte) 87, (int[]) null);
            return this.a("", param0, (byte) 104, param1);
          } else {
            return this.a("", param0, (byte) 104, param1);
          }
        } else {
          return this.a(param1, param0, (byte) 104, "");
        }
    }

    private final el a(String param0, int[] param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((ld) this).field_a.c(param0, param2 + -24337);
        if ((var5 ^ -1) <= -1) {
          var6 = ((ld) this).field_a.a(var5, param3, false);
          if (var6 < 0) {
            return null;
          } else {
            L0: {
              if (param2 == 24340) {
                break L0;
              } else {
                field_b = 100;
                break L0;
              }
            }
            return this.a(param1, var6, param2 ^ -26854, var5);
          }
        } else {
          return null;
        }
    }

    private final el a(String param0, int[] param1, byte param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          if (param2 == 104) {
            break L0;
          } else {
            var7 = null;
            el discarded$2 = this.a((String) null, (int[]) null, (byte) -52, (String) null);
            break L0;
          }
        }
        var5 = ((ld) this).field_g.c(param3, 3);
        if (0 <= var5) {
          var6 = ((ld) this).field_g.a(var5, param0, false);
          if (var6 < 0) {
            return null;
          } else {
            return this.a(var6, param1, param2 + -104, var5);
          }
        } else {
          return null;
        }
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = HoldTheLine.field_D;
        if (param2 == null) {
          return ao.field_e;
        } else {
          var3 = param2.length();
          if (1 <= var3) {
            if (var3 <= 12) {
              if (!param0) {
                L0: {
                  var10 = kf.a(param2, (byte) -98);
                  if (var10 == null) {
                    break L0;
                  } else {
                    if (var10.length() < 1) {
                      break L0;
                    } else {
                      if (ag.a(-2821, var10.charAt(0))) {
                        return mj.field_b;
                      } else {
                        if (!ag.a(-2821, var10.charAt(-1 + var10.length()))) {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param2.length() <= var6) {
                              if (0 < var5) {
                                return mj.field_b;
                              } else {
                                return null;
                              }
                            } else {
                              L2: {
                                var7 = param2.charAt(var6);
                                if (ag.a(-2821, (char) var7)) {
                                  var5++;
                                  break L2;
                                } else {
                                  var5 = 0;
                                  break L2;
                                }
                              }
                              if (-3 < (var5 ^ -1)) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param1) {
                                  return kd.field_a;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        } else {
                          return mj.field_b;
                        }
                      }
                    }
                  }
                }
                return ao.field_e;
              } else {
                ld.a(18);
                var9 = kf.a(param2, (byte) -98);
                if (var9 != null) {
                  if (var9.length() >= 1) {
                    if (ag.a(-2821, var9.charAt(0))) {
                      return mj.field_b;
                    } else {
                      if (!ag.a(-2821, var9.charAt(-1 + var9.length()))) {
                        var5 = 0;
                        var6 = 0;
                        L3: while (true) {
                          if (param2.length() <= var6) {
                            if (0 < var5) {
                              return mj.field_b;
                            } else {
                              return null;
                            }
                          } else {
                            L4: {
                              var7 = param2.charAt(var6);
                              if (ag.a(-2821, (char) var7)) {
                                var5++;
                                break L4;
                              } else {
                                var5 = 0;
                                break L4;
                              }
                            }
                            if (-3 < (var5 ^ -1)) {
                              var6++;
                              var6++;
                              continue L3;
                            } else {
                              if (!param1) {
                                return kd.field_a;
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        }
                      } else {
                        return mj.field_b;
                      }
                    }
                  } else {
                    return ao.field_e;
                  }
                } else {
                  return ao.field_e;
                }
              }
            } else {
              return ao.field_e;
            }
          } else {
            return ao.field_e;
          }
        }
    }

    private final el a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        el var8 = null;
        el var8_ref = null;
        sn var9 = null;
        sn var9_ref = null;
        var5 = param0 ^ (param3 >>> -343045972 | 65531 & param3 << 1687916868);
        var5 = var5 | param3 << 587235568;
        var6 = 4294967296L ^ (long)var5;
        var8 = (el) (Object) ((ld) this).field_e.a((byte) 121, var6);
        if (var8 == null) {
          if (param1 != null) {
            if (param1[0] > 0) {
              L0: {
                var9 = (sn) (Object) ((ld) this).field_d.a((byte) 120, var6);
                if (var9 == null) {
                  var9_ref = sn.a(((ld) this).field_g, param3, param0);
                  if (var9_ref != null) {
                    ((ld) this).field_d.a((hl) (Object) var9_ref, var6, false);
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  break L0;
                }
              }
              var8_ref = var9_ref.a(param1);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.d(param2);
                ((ld) this).field_e.a((hl) (Object) var8_ref, var6, false);
                return var8_ref;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (sn) (Object) ((ld) this).field_d.a((byte) 120, var6);
              if (var9 == null) {
                var9_ref = sn.a(((ld) this).field_g, param3, param0);
                if (var9_ref != null) {
                  ((ld) this).field_d.a((hl) (Object) var9_ref, var6, false);
                  break L1;
                } else {
                  return null;
                }
              } else {
                break L1;
              }
            }
            var8_ref = var9_ref.a(param1);
            if (var8_ref == null) {
              return null;
            } else {
              var9_ref.d(param2);
              ((ld) this).field_e.a((hl) (Object) var8_ref, var6, false);
              return var8_ref;
            }
          }
        } else {
          return var8;
        }
    }

    ld(gn param0, gn param1) {
        ((ld) this).field_d = new og(256);
        ((ld) this).field_e = new og(256);
        ((ld) this).field_g = param1;
        ((ld) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Log in/Register";
        field_b = -1;
    }
}
