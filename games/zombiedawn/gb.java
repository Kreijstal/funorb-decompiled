/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb extends fb {
    private int field_D;
    private int field_E;
    private boolean field_F;

    gb(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((gb) this).field_E = 0;
        ((gb) this).field_D = pb.a(so.field_a, 5, 1);
        ((gb) this).field_F = true;
        ((gb) this).d((byte) 121);
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        L0: {
          var14 = ZombieDawn.field_J;
          if (param0 <= -76) {
            break L0;
          } else {
            var15 = null;
            oi discarded$1 = gb.a((String) null, -100, (dj) null, (String) null, (dj) null);
            break L0;
          }
        }
        L1: {
          var3 = 0;
          if (((gb) this).field_F) {
            L2: {
              var3 = ((gb) this).field_E % 30;
              if (var3 <= 15) {
                break L2;
              } else {
                var3 = 30 + -var3;
                break L2;
              }
            }
            if (var3 > 8) {
              var3 = 4;
              break L1;
            } else {
              if (var3 <= 3) {
                if (1 >= var3) {
                  var3 = 1;
                  break L1;
                } else {
                  var3 = 2;
                  break L1;
                }
              } else {
                var3 = 3;
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        L3: {
          var4 = param1.a(((gb) this).a(true), (byte) -81);
          var5 = -24 + param1.a(((gb) this).f(237239984) + -var3, 0);
          if ((var4 ^ -1) > 47) {
            break L3;
          } else {
            if (var5 < -48) {
              break L3;
            } else {
              if (var4 > qj.field_d) {
                break L3;
              } else {
                if (var5 > me.field_Bb) {
                  break L3;
                } else {
                  L4: {
                    if (!ng.field_e) {
                      break L4;
                    } else {
                      if (((gb) this).field_C) {
                        bi.g(12 + var4, var5 - -12, 14, 16711680);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (!((gb) this).field_F) {
                      break L5;
                    } else {
                      var6 = -1 + var4 - -12;
                      var7 = -1 + var5 + 12;
                      var9 = 10;
                      var10 = 2;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= 6) {
                          break L5;
                        } else {
                          var8 = (((gb) this).field_E + var11 * 6) % 120;
                          var12 = var11 * var9;
                          var13 = var11 * var10;
                          bi.d(gj.field_u[var8] + var6, gj.field_e[var8] + var7, 6, 0, var12);
                          bi.a(gj.field_u[var8] + var6 << -1533893596, gj.field_e[var8] + var7 << 531961604, 96, var13, gj.field_b[((gb) this).field_t]);
                          var8 = (var8 + 60) % 120;
                          bi.d(gj.field_u[var8] + var6, gj.field_e[var8] + var7, 6, 0, var12);
                          bi.a(gj.field_u[var8] + var6 << -1810232092, var7 + gj.field_e[var8] << 344814884, 96, var13, gj.field_b[((gb) this).field_t]);
                          var11++;
                          continue L6;
                        }
                      }
                    }
                  }
                  kb.field_i[((gb) this).field_t].b(var4, var5);
                  return;
                }
              }
            }
          }
        }
    }

    final static oi a(String param0, int param1, dj param2, String param3, dj param4) {
        int var5 = param4.a(param3, (byte) 8);
        int var6 = param4.a(var5, param0, true);
        if (param1 != -1) {
            return null;
        }
        return la.a(param2, var6, param4, (byte) -126, var5);
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        va var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        kd var8 = null;
        L0: {
          var6 = ZombieDawn.field_J;
          if (5 != dj.field_e.field_H.field_A.field_a) {
            break L0;
          } else {
            L1: {
              var2 = (((gb) this).a(true) + 12) / 24;
              var3 = (-1 + ((gb) this).f(237239984)) / 24;
              if (-1 < (var2 ^ -1)) {
                break L1;
              } else {
                if (var3 < 0) {
                  break L1;
                } else {
                  if (dj.field_e.field_H.field_A.field_f[0].length <= var2) {
                    break L1;
                  } else {
                    if (dj.field_e.field_H.field_A.field_f.length > var3) {
                      var4 = ub.a(127, dj.field_e.field_H.field_A.field_f[var3][var2]);
                      if (var4 == null) {
                        break L0;
                      } else {
                        L2: {
                          if (0 <= var4.field_h) {
                            if ((var4.field_h ^ -1) >= -1) {
                              ((gb) this).field_y = ((gb) this).field_y + var4.field_h;
                              break L2;
                            } else {
                              var5 = (var4.field_h + ((gb) this).field_y) % 1572864;
                              if (var4.field_h > var5) {
                                ((gb) this).field_y = var4.field_h + (-var5 + ((gb) this).field_y);
                                break L2;
                              } else {
                                ((gb) this).field_y = ((gb) this).field_y + var4.field_h;
                                break L2;
                              }
                            }
                          } else {
                            var5 = ((gb) this).field_y % 1572864;
                            if (-var4.field_h <= var5) {
                              ((gb) this).field_y = ((gb) this).field_y + var4.field_h;
                              break L2;
                            } else {
                              ((gb) this).field_y = -1 + -var5 + ((gb) this).field_y;
                              break L2;
                            }
                          }
                        }
                        L3: {
                          ((gb) this).field_F = false;
                          if (var4.field_i >= 0) {
                            if (var4.field_i > 0) {
                              var5 = (var4.field_i + ((gb) this).field_x) % 1572864;
                              if (var4.field_i <= var5) {
                                ((gb) this).field_x = ((gb) this).field_x + var4.field_i;
                                break L3;
                              } else {
                                ((gb) this).field_x = var4.field_i - (var5 - ((gb) this).field_x);
                                break L3;
                              }
                            } else {
                              ((gb) this).field_x = ((gb) this).field_x + var4.field_i;
                              break L3;
                            }
                          } else {
                            var5 = ((gb) this).field_x % 1572864;
                            if (-var4.field_i <= var5) {
                              ((gb) this).field_x = ((gb) this).field_x + var4.field_i;
                              break L3;
                            } else {
                              ((gb) this).field_x = ((gb) this).field_x + (-var5 - 1);
                              break L3;
                            }
                          }
                        }
                        ((gb) this).d((byte) 120);
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return;
          }
        }
        L4: {
          ((gb) this).field_E = ((gb) this).field_E + 1;
          if (param0 >= 95) {
            break L4;
          } else {
            var7 = null;
            oi discarded$2 = gb.a((String) null, 58, (dj) null, (String) null, (dj) null);
            break L4;
          }
        }
        L5: {
          if (((gb) this).field_E <= -121) {
            ((gb) this).field_E = 0;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          ((gb) this).field_D = ((gb) this).field_D + 1;
          if (-6 < ((gb) this).field_D) {
            ((gb) this).field_D = 0;
            var8 = (kd) (Object) ((gb) this).a((byte) -74, 36, 2);
            L7: while (true) {
              if (var8 == null) {
                break L6;
              } else {
                L8: {
                  if (!var8.i((byte) -126)) {
                    break L8;
                  } else {
                    if (dj.field_e.field_Q.b(-4149, ((gb) this).field_t)) {
                      L9: {
                        fn discarded$3 = kh.a(9, false);
                        ck.a(((gb) this).field_t, 6836);
                        if (dj.field_e.field_q != 4) {
                          break L9;
                        } else {
                          if (dj.field_e.field_h != 0) {
                            break L9;
                          } else {
                            L10: {
                              if (cm.field_c != null) {
                                break L10;
                              } else {
                                if (-13 == (((gb) this).field_t ^ -1)) {
                                  cm.field_c = var8;
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (cm.field_c != var8) {
                              break L9;
                            } else {
                              if (((gb) this).field_t != 0) {
                                break L9;
                              } else {
                                if (!var8.x(124)) {
                                  dj.field_e.a(241, 14, (byte) -23);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      ((gb) this).b(-27598);
                      return;
                    } else {
                      break L8;
                    }
                  }
                }
                var8 = (kd) (Object) ((gb) this).e((byte) 32);
                continue L7;
              }
            }
          } else {
            break L6;
          }
        }
    }

    static {
    }
}
