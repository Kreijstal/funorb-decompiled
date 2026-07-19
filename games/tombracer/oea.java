/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oea extends vg {
    static volatile boolean field_k;
    fo field_h;
    static jpa field_j;
    static int field_f;
    static String field_g;
    static jea field_i;

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (0 == (65536 & param0)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == 0 | cra.a(param1, -31, param0)) {
          if (!ooa.a(param1, param0, -68)) {
            var3 = -66 % ((param2 - 4) / 48);
            if (0 == (55 & param1)) {
              if (!vua.e(param0, param1, 13650)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param0 > param3) {
          if (param4 <= param0) {
            if (param3 >= param4) {
              vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
              if (param1 == -8543) {
                return;
              } else {
                field_i = (jea) null;
                return;
              }
            } else {
              vb.a(-922437200, param2, param6, param3, param7, param5, param4, param0, bea.field_l);
              if (var9 == 0) {
                if (param1 == -8543) {
                  return;
                } else {
                  field_i = (jea) null;
                  return;
                }
              } else {
                vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                if (param1 == -8543) {
                  return;
                } else {
                  field_i = (jea) null;
                  return;
                }
              }
            }
          } else {
            vb.a(-922437200, param7, param6, param3, param2, param5, param0, param4, bea.field_l);
            if (var9 != 0) {
              if (param3 >= param4) {
                L0: {
                  vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                  if (param1 == -8543) {
                    break L0;
                  } else {
                    field_i = (jea) null;
                    break L0;
                  }
                }
                return;
              } else {
                vb.a(-922437200, param2, param6, param3, param7, param5, param4, param0, bea.field_l);
                if (var9 == 0) {
                  if (param1 == -8543) {
                    return;
                  } else {
                    field_i = (jea) null;
                    return;
                  }
                } else {
                  vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                  if (param1 != -8543) {
                    field_i = (jea) null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param1 != -8543) {
                field_i = (jea) null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param3 < param4) {
            vb.a(-922437200, param5, param6, param0, param2, param7, param3, param4, bea.field_l);
            if (var9 != 0) {
              L1: {
                L2: {
                  if (param4 <= param0) {
                    break L2;
                  } else {
                    vb.a(-922437200, param7, param6, param3, param2, param5, param0, param4, bea.field_l);
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param3 >= param4) {
                  vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                  break L1;
                } else {
                  vb.a(-922437200, param2, param6, param3, param7, param5, param4, param0, bea.field_l);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                    break L1;
                  }
                }
              }
              if (param1 != -8543) {
                field_i = (jea) null;
                return;
              } else {
                return;
              }
            } else {
              if (param1 != -8543) {
                field_i = (jea) null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param4 <= param0) {
              vb.a(-922437200, param7, param6, param4, param5, param2, param0, param3, bea.field_l);
              if (var9 != 0) {
                vb.a(-922437200, param2, param6, param0, param5, param7, param4, param3, bea.field_l);
                if (var9 == 0) {
                  if (param1 != -8543) {
                    field_i = (jea) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    vb.a(-922437200, param5, param6, param0, param2, param7, param3, param4, bea.field_l);
                    if (param4 <= param0) {
                      break L3;
                    } else {
                      vb.a(-922437200, param7, param6, param3, param2, param5, param0, param4, bea.field_l);
                      break L3;
                    }
                  }
                  L4: {
                    if (param3 >= param4) {
                      vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                      break L4;
                    } else {
                      vb.a(-922437200, param2, param6, param3, param7, param5, param4, param0, bea.field_l);
                      if (var9 == 0) {
                        break L4;
                      } else {
                        vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1 == -8543) {
                      break L5;
                    } else {
                      field_i = (jea) null;
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                if (param1 != -8543) {
                  field_i = (jea) null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              vb.a(-922437200, param2, param6, param0, param5, param7, param4, param3, bea.field_l);
              if (var9 == 0) {
                if (param1 != -8543) {
                  field_i = (jea) null;
                  return;
                } else {
                  return;
                }
              } else {
                L6: {
                  vb.a(-922437200, param5, param6, param0, param2, param7, param3, param4, bea.field_l);
                  if (param4 <= param0) {
                    break L6;
                  } else {
                    vb.a(-922437200, param7, param6, param3, param2, param5, param0, param4, bea.field_l);
                    break L6;
                  }
                }
                L7: {
                  if (param3 >= param4) {
                    vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                    break L7;
                  } else {
                    vb.a(-922437200, param2, param6, param3, param7, param5, param4, param0, bea.field_l);
                    if (var9 == 0) {
                      break L7;
                    } else {
                      vb.a(-922437200, param5, param6, param4, param7, param2, param3, param0, bea.field_l);
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param1 == -8543) {
                    break L8;
                  } else {
                    field_i = (jea) null;
                    break L8;
                  }
                }
                return;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_j = null;
        if (param0 != -49) {
            oea.a(80, -20, -71, 70, -11, -46, 20, 64);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int var3 = 0;
        var3 = param1 + -1 & param0 >> 759697279;
        if (param2 > -54) {
          discarded$2 = oea.a(28, -97, -108);
          return (param0 - -(param0 >>> -48471489)) % param1 - -var3;
        } else {
          return (param0 - -(param0 >>> -48471489)) % param1 - -var3;
        }
    }

    oea(fo param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "oea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = true;
        field_g = "Withdraw invitation to <%0> to join this game";
        field_f = 0;
    }
}
