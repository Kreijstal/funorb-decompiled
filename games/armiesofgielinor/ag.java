/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends oj {
    private int field_y;
    int field_Q;
    static int[] field_L;
    boolean field_N;
    private boolean field_E;
    boolean field_M;
    int field_G;
    int field_K;
    int field_D;
    int field_R;
    static int[] field_A;
    static je field_I;
    boolean field_J;
    private int field_z;
    int field_F;
    static int field_P;
    int field_B;
    static String field_O;
    private int field_H;

    public static void e(byte param0) {
        field_A = null;
        if (param0 >= -122) {
          field_O = null;
          field_O = null;
          field_L = null;
          field_I = null;
          return;
        } else {
          field_O = null;
          field_L = null;
          field_I = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        bv var3 = null;
        var3 = vl.field_n;
        var3.h(32161, param0);
        var3.b(1, 3);
        var3.b(1, 8);
        if (param1 > -41) {
          ag.e((byte) 75);
          var3.b(true, param2);
          return;
        } else {
          var3.b(true, param2);
          return;
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        var4 = -122 / ((53 - param0) / 51);
        if (!param1) {
          var3 = "EventCombat: creature: " + ((ag) this).field_z + ", com:(" + ((ag) this).field_Q + "," + ((ag) this).field_G + ")" + ", att:(" + ((ag) this).field_F + "," + ((ag) this).field_B + ")" + ", dam:(" + ((ag) this).field_K + "," + ((ag) this).field_R + ")" + "\n" + "die:(" + ((ag) this).field_N + "," + ((ag) this).field_M + ")" + ", count:(" + ((ag) this).field_H + "," + ((ag) this).field_y + ")" + ", deployed:(" + ((ag) this).field_J + "," + ((ag) this).field_E + ")" + ", battleid:" + ((ag) this).field_D;
          return var3;
        } else {
          L0: {
            System.out.println("Combat event debug");
            System.out.println("Attacker at " + ((ag) this).field_Q + "," + ((ag) this).field_G);
            System.out.println("Attacks " + (((ag) this).field_Q + ((ag) this).field_F) + "," + (((ag) this).field_G + ((ag) this).field_B));
            System.out.println("Attacker deals " + ((ag) this).field_K + " damage");
            System.out.println("Defender deals " + ((ag) this).field_R + " damage");
            if (!((ag) this).field_N) {
              break L0;
            } else {
              System.out.println("Attacker dies");
              break L0;
            }
          }
          L1: {
            if (!((ag) this).field_M) {
              break L1;
            } else {
              System.out.println("Defender dies");
              break L1;
            }
          }
          System.out.println(((ag) this).field_H + " attackers in anim");
          System.out.println(((ag) this).field_y + " defenders in anim");
          System.out.println("Unseen type is" + ((ag) this).field_z);
          var3 = "EventCombat: creature: " + ((ag) this).field_z + ", com:(" + ((ag) this).field_Q + "," + ((ag) this).field_G + ")" + ", att:(" + ((ag) this).field_F + "," + ((ag) this).field_B + ")" + ", dam:(" + ((ag) this).field_K + "," + ((ag) this).field_R + ")" + "\n" + "die:(" + ((ag) this).field_N + "," + ((ag) this).field_M + ")" + ", count:(" + ((ag) this).field_H + "," + ((ag) this).field_y + ")" + ", deployed:(" + ((ag) this).field_J + "," + ((ag) this).field_E + ")" + ", battleid:" + ((ag) this).field_D;
          return var3;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        jd var6 = null;
        jd var7 = null;
        jd var8 = null;
        var6 = param2.field_xb.c(((ag) this).field_G, true, ((ag) this).field_Q);
        if (param1 > -84) {
          ((ag) this).field_G = -99;
          var8 = param2.field_xb.c(((ag) this).field_B + ((ag) this).field_G, true, ((ag) this).field_Q - -((ag) this).field_F);
          if (((ag) this).field_B * ((ag) this).field_B + ((ag) this).field_F * ((ag) this).field_F != 1) {
            if (var6 == null) {
              param2.d(((ag) this).field_D, 4);
              if (!uc.field_a) {
                return ((ag) this).a((byte) -39, param2, param0, true);
              } else {
                param2.e(((ag) this).field_D, -56);
                ((ag) this).a(param2.field_xb, -26661);
                param2.a(true, var6);
                ((ag) this).c((byte) -125);
                return false;
              }
            } else {
              var6.e(118, 2048 - (int)(2048.0 * Math.atan2((double)((ag) this).field_B, (double)(-((ag) this).field_F)) / 3.141592653589793 / 2.0) - -256 & 2047);
              param2.d(((ag) this).field_D, 4);
              if (!uc.field_a) {
                return ((ag) this).a((byte) -39, param2, param0, true);
              } else {
                param2.e(((ag) this).field_D, -56);
                ((ag) this).a(param2.field_xb, -26661);
                param2.a(true, var6);
                ((ag) this).c((byte) -125);
                return false;
              }
            }
          } else {
            L0: {
              if (var6 == null) {
                break L0;
              } else {
                L1: {
                  if (((ag) this).field_F > 0) {
                    var6.e(74, 1280);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (((ag) this).field_B > 0) {
                    var6.e(-118, 1792);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if ((((ag) this).field_F ^ -1) > -1) {
                  var6.e(-127, 256);
                  if (((ag) this).field_B > -1) {
                    var6.e(-122, 768);
                    break L0;
                  } else {
                    L3: {
                      if (var8 != null) {
                        L4: {
                          if (-1 >= ((ag) this).field_F) {
                            break L4;
                          } else {
                            var8.e(72, 256);
                            break L4;
                          }
                        }
                        L5: {
                          if (((ag) this).field_B < -1) {
                            var8.e(-117, 768);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (-1 > ((ag) this).field_F) {
                            var8.e(-121, 1280);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if ((((ag) this).field_B ^ -1) > -1) {
                          var8.e(3, 1792);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    param2.d(((ag) this).field_D, 4);
                    if (!uc.field_a) {
                      return ((ag) this).a((byte) -39, param2, param0, true);
                    } else {
                      param2.e(((ag) this).field_D, -56);
                      ((ag) this).a(param2.field_xb, -26661);
                      param2.a(true, var6);
                      ((ag) this).c((byte) -125);
                      return false;
                    }
                  }
                } else {
                  if (((ag) this).field_B > -1) {
                    var6.e(-122, 768);
                    if (var8 != null) {
                      if (-1 <= (((ag) this).field_F ^ -1)) {
                        L7: {
                          if (((ag) this).field_B < -1) {
                            var8.e(-117, 768);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (-1 > ((ag) this).field_F) {
                            var8.e(-121, 1280);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if ((((ag) this).field_B ^ -1) > -1) {
                          var8.e(3, 1792);
                          param2.d(((ag) this).field_D, 4);
                          if (!uc.field_a) {
                            return ((ag) this).a((byte) -39, param2, param0, true);
                          } else {
                            param2.e(((ag) this).field_D, -56);
                            ((ag) this).a(param2.field_xb, -26661);
                            param2.a(true, var6);
                            ((ag) this).c((byte) -125);
                            return false;
                          }
                        } else {
                          param2.d(((ag) this).field_D, 4);
                          if (!uc.field_a) {
                            return ((ag) this).a((byte) -39, param2, param0, true);
                          } else {
                            param2.e(((ag) this).field_D, -56);
                            ((ag) this).a(param2.field_xb, -26661);
                            param2.a(true, var6);
                            ((ag) this).c((byte) -125);
                            return false;
                          }
                        }
                      } else {
                        L9: {
                          var8.e(72, 256);
                          if (((ag) this).field_B < -1) {
                            var8.e(-117, 768);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (-1 > ((ag) this).field_F) {
                            var8.e(-121, 1280);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if ((((ag) this).field_B ^ -1) > -1) {
                            var8.e(3, 1792);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        param2.d(((ag) this).field_D, 4);
                        if (!uc.field_a) {
                          return ((ag) this).a((byte) -39, param2, param0, true);
                        } else {
                          param2.e(((ag) this).field_D, -56);
                          ((ag) this).a(param2.field_xb, -26661);
                          param2.a(true, var6);
                          ((ag) this).c((byte) -125);
                          return false;
                        }
                      }
                    } else {
                      param2.d(((ag) this).field_D, 4);
                      if (!uc.field_a) {
                        return ((ag) this).a((byte) -39, param2, param0, true);
                      } else {
                        param2.e(((ag) this).field_D, -56);
                        ((ag) this).a(param2.field_xb, -26661);
                        param2.a(true, var6);
                        ((ag) this).c((byte) -125);
                        return false;
                      }
                    }
                  } else {
                    L12: {
                      if (var8 != null) {
                        L13: {
                          if (-1 >= ((ag) this).field_F) {
                            break L13;
                          } else {
                            var8.e(72, 256);
                            break L13;
                          }
                        }
                        L14: {
                          if (((ag) this).field_B < -1) {
                            var8.e(-117, 768);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if (-1 > ((ag) this).field_F) {
                            var8.e(-121, 1280);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if ((((ag) this).field_B ^ -1) > -1) {
                          var8.e(3, 1792);
                          break L12;
                        } else {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    param2.d(((ag) this).field_D, 4);
                    if (uc.field_a) {
                      param2.e(((ag) this).field_D, -56);
                      ((ag) this).a(param2.field_xb, -26661);
                      param2.a(true, var6);
                      ((ag) this).c((byte) -125);
                      return false;
                    } else {
                      return ((ag) this).a((byte) -39, param2, param0, true);
                    }
                  }
                }
              }
            }
            if (var8 != null) {
              if (-1 <= (((ag) this).field_F ^ -1)) {
                L16: {
                  if (((ag) this).field_B < -1) {
                    var8.e(-117, 768);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (-1 > ((ag) this).field_F) {
                    var8.e(-121, 1280);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                if ((((ag) this).field_B ^ -1) > -1) {
                  var8.e(3, 1792);
                  param2.d(((ag) this).field_D, 4);
                  if (!uc.field_a) {
                    return ((ag) this).a((byte) -39, param2, param0, true);
                  } else {
                    param2.e(((ag) this).field_D, -56);
                    ((ag) this).a(param2.field_xb, -26661);
                    param2.a(true, var6);
                    ((ag) this).c((byte) -125);
                    return false;
                  }
                } else {
                  param2.d(((ag) this).field_D, 4);
                  if (!uc.field_a) {
                    return ((ag) this).a((byte) -39, param2, param0, true);
                  } else {
                    param2.e(((ag) this).field_D, -56);
                    ((ag) this).a(param2.field_xb, -26661);
                    param2.a(true, var6);
                    ((ag) this).c((byte) -125);
                    return false;
                  }
                }
              } else {
                L18: {
                  var8.e(72, 256);
                  if (((ag) this).field_B < -1) {
                    var8.e(-117, 768);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-1 > ((ag) this).field_F) {
                    var8.e(-121, 1280);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if ((((ag) this).field_B ^ -1) > -1) {
                    var8.e(3, 1792);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                param2.d(((ag) this).field_D, 4);
                if (!uc.field_a) {
                  return ((ag) this).a((byte) -39, param2, param0, true);
                } else {
                  param2.e(((ag) this).field_D, -56);
                  ((ag) this).a(param2.field_xb, -26661);
                  param2.a(true, var6);
                  ((ag) this).c((byte) -125);
                  return false;
                }
              }
            } else {
              param2.d(((ag) this).field_D, 4);
              if (!uc.field_a) {
                return ((ag) this).a((byte) -39, param2, param0, true);
              } else {
                param2.e(((ag) this).field_D, -56);
                ((ag) this).a(param2.field_xb, -26661);
                param2.a(true, var6);
                ((ag) this).c((byte) -125);
                return false;
              }
            }
          }
        } else {
          var7 = param2.field_xb.c(((ag) this).field_B + ((ag) this).field_G, true, ((ag) this).field_Q - -((ag) this).field_F);
          if (((ag) this).field_B * ((ag) this).field_B + ((ag) this).field_F * ((ag) this).field_F != 1) {
            if (var6 == null) {
              param2.d(((ag) this).field_D, 4);
              if (uc.field_a) {
                param2.e(((ag) this).field_D, -56);
                ((ag) this).a(param2.field_xb, -26661);
                param2.a(true, var6);
                ((ag) this).c((byte) -125);
                return false;
              } else {
                return ((ag) this).a((byte) -39, param2, param0, true);
              }
            } else {
              var6.e(118, 2048 - (int)(2048.0 * Math.atan2((double)((ag) this).field_B, (double)(-((ag) this).field_F)) / 3.141592653589793 / 2.0) - -256 & 2047);
              param2.d(((ag) this).field_D, 4);
              if (uc.field_a) {
                param2.e(((ag) this).field_D, -56);
                ((ag) this).a(param2.field_xb, -26661);
                param2.a(true, var6);
                ((ag) this).c((byte) -125);
                return false;
              } else {
                return ((ag) this).a((byte) -39, param2, param0, true);
              }
            }
          } else {
            L21: {
              if (var6 == null) {
                break L21;
              } else {
                L22: {
                  if (((ag) this).field_F > 0) {
                    var6.e(74, 1280);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (((ag) this).field_B > 0) {
                    var6.e(-118, 1792);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if ((((ag) this).field_F ^ -1) <= -1) {
                    break L24;
                  } else {
                    var6.e(-127, 256);
                    break L24;
                  }
                }
                if (((ag) this).field_B > -1) {
                  var6.e(-122, 768);
                  break L21;
                } else {
                  L25: {
                    if (var7 != null) {
                      L26: {
                        if (-1 >= ((ag) this).field_F) {
                          break L26;
                        } else {
                          var7.e(72, 256);
                          break L26;
                        }
                      }
                      L27: {
                        if (((ag) this).field_B < -1) {
                          var7.e(-117, 768);
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      L28: {
                        if (-1 > ((ag) this).field_F) {
                          var7.e(-121, 1280);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      if ((((ag) this).field_B ^ -1) > -1) {
                        var7.e(3, 1792);
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  param2.d(((ag) this).field_D, 4);
                  if (uc.field_a) {
                    param2.e(((ag) this).field_D, -56);
                    ((ag) this).a(param2.field_xb, -26661);
                    param2.a(true, var6);
                    ((ag) this).c((byte) -125);
                    return false;
                  } else {
                    return ((ag) this).a((byte) -39, param2, param0, true);
                  }
                }
              }
            }
            if (var7 != null) {
              if (-1 <= (((ag) this).field_F ^ -1)) {
                L29: {
                  if (((ag) this).field_B < -1) {
                    var7.e(-117, 768);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (-1 > ((ag) this).field_F) {
                    var7.e(-121, 1280);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                if ((((ag) this).field_B ^ -1) > -1) {
                  var7.e(3, 1792);
                  param2.d(((ag) this).field_D, 4);
                  if (uc.field_a) {
                    param2.e(((ag) this).field_D, -56);
                    ((ag) this).a(param2.field_xb, -26661);
                    param2.a(true, var6);
                    ((ag) this).c((byte) -125);
                    return false;
                  } else {
                    return ((ag) this).a((byte) -39, param2, param0, true);
                  }
                } else {
                  param2.d(((ag) this).field_D, 4);
                  if (uc.field_a) {
                    param2.e(((ag) this).field_D, -56);
                    ((ag) this).a(param2.field_xb, -26661);
                    param2.a(true, var6);
                    ((ag) this).c((byte) -125);
                    return false;
                  } else {
                    return ((ag) this).a((byte) -39, param2, param0, true);
                  }
                }
              } else {
                L31: {
                  var7.e(72, 256);
                  if (((ag) this).field_B < -1) {
                    var7.e(-117, 768);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (-1 > ((ag) this).field_F) {
                    var7.e(-121, 1280);
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if ((((ag) this).field_B ^ -1) > -1) {
                    var7.e(3, 1792);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                param2.d(((ag) this).field_D, 4);
                if (uc.field_a) {
                  param2.e(((ag) this).field_D, -56);
                  ((ag) this).a(param2.field_xb, -26661);
                  param2.a(true, var6);
                  ((ag) this).c((byte) -125);
                  return false;
                } else {
                  return ((ag) this).a((byte) -39, param2, param0, true);
                }
              }
            } else {
              param2.d(((ag) this).field_D, 4);
              if (uc.field_a) {
                param2.e(((ag) this).field_D, -56);
                ((ag) this).a(param2.field_xb, -26661);
                param2.a(true, var6);
                ((ag) this).c((byte) -125);
                return false;
              } else {
                return ((ag) this).a((byte) -39, param2, param0, true);
              }
            }
          }
        }
    }

    final void a(ha param0, int param1) {
        param0.a(((ag) this).field_G, ((ag) this).field_F, ((ag) this).field_N, ((ag) this).field_Q, ((ag) this).field_B, 111, ((ag) this).field_M, ((ag) this).field_K, ((ag) this).field_R, ((ag) this).field_z);
        hf.a(param0, (byte) 9, true);
        if (param1 != -26661) {
            ((ag) this).field_B = -38;
        }
    }

    final static java.applet.Applet d(byte param0) {
        if (null != la.field_g) {
            return la.field_g;
        }
        int var1 = 90 % ((param0 - -67) / 44);
        return (java.applet.Applet) (Object) lr.field_a;
    }

    ag(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, boolean param8, int param9, int param10, boolean param11, boolean param12, int param13) {
        ((ag) this).field_m = 1;
        ((ag) this).field_K = param5;
        ((ag) this).field_D = param13;
        ((ag) this).field_J = param11 ? true : false;
        ((ag) this).field_y = param10;
        ((ag) this).field_G = param2;
        ((ag) this).field_F = param3;
        ((ag) this).field_N = param7 ? true : false;
        ((ag) this).field_R = param6;
        ((ag) this).field_E = param12 ? true : false;
        ((ag) this).field_H = param9;
        ((ag) this).field_M = param8 ? true : false;
        ((ag) this).field_z = param0;
        ((ag) this).field_B = param4;
        ((ag) this).field_Q = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new int[4];
        field_A = new int[5];
        field_O = "To Customer Support";
        field_P = 0;
    }
}
