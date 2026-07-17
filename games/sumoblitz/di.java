/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di extends ak {
    private int field_i;

    final void b(int param0) {
        Object var2 = null;
        nt var2_ref = null;
        int var3 = 0;
        L0: {
          var2 = null;
          var3 = Sumoblitz.field_L ? 1 : 0;
          super.b(param0);
          kf.field_u.d(param0 ^ 18481);
          if (((di) this).field_i % 50 == 0) {
            up.field_a = fi.a(640, he.field_o, (byte) -96) << 8;
            cv.field_E = fi.a(480, he.field_o, (byte) -96) << 8;
            break L0;
          } else {
            break L0;
          }
        }
        kf.field_u.a(false, cv.field_E, up.field_a);
        if (param0 == -18556) {
          if (0 != ((di) this).field_i % 100) {
            if (((di) this).field_i % 2 != 0) {
              im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96) + -1024 >> 8, -1024 + (kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 8, -1, 1, true), (byte) 39);
              im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, kf.field_u.field_z - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, -1, 3, true), (byte) 39);
              im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, -1024 + kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) >> 8, -1, 5, true), (byte) 39);
              var2_ref = (nt) (Object) im.field_b.b(68);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_ref == null) {
                      break L3;
                    } else {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!var2_ref.a(-2567)) {
                            break L4;
                          } else {
                            var2_ref.b(false);
                            if (!(var2_ref instanceof vi)) {
                              break L4;
                            } else {
                              if (fi.a(3, he.field_o, (byte) -96) != 1) {
                                break L4;
                              } else {
                                if (((vi) (Object) var2_ref).field_u) {
                                  break L4;
                                } else {
                                  uv.a(lr.field_a[fi.a(6, he.field_o, (byte) -96)], var2_ref.field_o, param0 ^ 18547, var2_ref.field_k, im.field_b, 20);
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        var2_ref = (nt) (Object) im.field_b.d((byte) 18);
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ((di) this).field_i = ((di) this).field_i + 1;
                  break L2;
                }
                return;
              }
            } else {
              im.field_b.a((ms) (Object) new eq(50, -1024 + (kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96)) >> 8, kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) - 1024 >> 8, -1, 0, false), (byte) 39);
              im.field_b.a((ms) (Object) new eq(50, -1024 + (kf.field_u.field_C + fi.a(2048, he.field_o, (byte) -96)) >> 8, -1024 + (kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96)) >> 8, -1, 2, false), (byte) 39);
              im.field_b.a((ms) (Object) new eq(50, -1024 + kf.field_u.field_C + fi.a(2048, he.field_o, (byte) -96) >> 8, kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96) - 1024 >> 8, -1, 4, false), (byte) 39);
              if (var3 != 0) {
                im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96) + -1024 >> 8, -1024 + (kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 8, -1, 1, true), (byte) 39);
                im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, kf.field_u.field_z - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, -1, 3, true), (byte) 39);
                im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, -1024 + kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) >> 8, -1, 5, true), (byte) 39);
                var2_ref = (nt) (Object) im.field_b.b(68);
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var2_ref == null) {
                        break L7;
                      } else {
                        if (var3 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (!var2_ref.a(-2567)) {
                              break L8;
                            } else {
                              var2_ref.b(false);
                              if (!(var2_ref instanceof vi)) {
                                break L8;
                              } else {
                                if (fi.a(3, he.field_o, (byte) -96) != 1) {
                                  break L8;
                                } else {
                                  if (((vi) (Object) var2_ref).field_u) {
                                    break L8;
                                  } else {
                                    uv.a(lr.field_a[fi.a(6, he.field_o, (byte) -96)], var2_ref.field_o, param0 ^ 18547, var2_ref.field_k, im.field_b, 20);
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var2_ref = (nt) (Object) im.field_b.d((byte) 18);
                          if (var3 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    ((di) this).field_i = ((di) this).field_i + 1;
                    break L6;
                  }
                  return;
                }
              } else {
                var2_ref = (nt) (Object) im.field_b.b(68);
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var2_ref == null) {
                        break L11;
                      } else {
                        if (var3 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (!var2_ref.a(-2567)) {
                              break L12;
                            } else {
                              var2_ref.b(false);
                              if (!(var2_ref instanceof vi)) {
                                break L12;
                              } else {
                                if (fi.a(3, he.field_o, (byte) -96) != 1) {
                                  break L12;
                                } else {
                                  if (((vi) (Object) var2_ref).field_u) {
                                    break L12;
                                  } else {
                                    uv.a(lr.field_a[fi.a(6, he.field_o, (byte) -96)], var2_ref.field_o, param0 ^ 18547, var2_ref.field_k, im.field_b, 20);
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          var2_ref = (nt) (Object) im.field_b.d((byte) 18);
                          if (var3 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    ((di) this).field_i = ((di) this).field_i + 1;
                    break L10;
                  }
                  return;
                }
              }
            }
          } else {
            L13: {
              L14: {
                ff.a(kf.field_u.field_C, 40, kf.field_u.field_z, im.field_b, lr.field_a[fi.a(6, he.field_o, (byte) -96)], (byte) 94);
                gn.a(34 - -fi.a(4, he.field_o, (byte) -96), true);
                if (((di) this).field_i % 2 != 0) {
                  break L14;
                } else {
                  im.field_b.a((ms) (Object) new eq(50, -1024 + (kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96)) >> 8, kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) - 1024 >> 8, -1, 0, false), (byte) 39);
                  im.field_b.a((ms) (Object) new eq(50, -1024 + (kf.field_u.field_C + fi.a(2048, he.field_o, (byte) -96)) >> 8, -1024 + (kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96)) >> 8, -1, 2, false), (byte) 39);
                  im.field_b.a((ms) (Object) new eq(50, -1024 + kf.field_u.field_C + fi.a(2048, he.field_o, (byte) -96) >> 8, kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96) - 1024 >> 8, -1, 4, false), (byte) 39);
                  if (var3 == 0) {
                    var2_ref = (nt) (Object) im.field_b.b(68);
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96) + -1024 >> 8, -1024 + (kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 8, -1, 1, true), (byte) 39);
              im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, kf.field_u.field_z - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, -1, 3, true), (byte) 39);
              im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, -1024 + kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) >> 8, -1, 5, true), (byte) 39);
              var2_ref = (nt) (Object) im.field_b.b(68);
              break L13;
            }
            L15: while (true) {
              L16: {
                L17: {
                  if (var2_ref == null) {
                    break L17;
                  } else {
                    if (var3 != 0) {
                      break L16;
                    } else {
                      L18: {
                        if (!var2_ref.a(-2567)) {
                          break L18;
                        } else {
                          var2_ref.b(false);
                          if (!(var2_ref instanceof vi)) {
                            break L18;
                          } else {
                            if (fi.a(3, he.field_o, (byte) -96) != 1) {
                              break L18;
                            } else {
                              if (((vi) (Object) var2_ref).field_u) {
                                break L18;
                              } else {
                                uv.a(lr.field_a[fi.a(6, he.field_o, (byte) -96)], var2_ref.field_o, param0 ^ 18547, var2_ref.field_k, im.field_b, 20);
                                break L18;
                              }
                            }
                          }
                        }
                      }
                      var2_ref = (nt) (Object) im.field_b.d((byte) 18);
                      if (var3 == 0) {
                        continue L15;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                ((di) this).field_i = ((di) this).field_i + 1;
                break L16;
              }
              return;
            }
          }
        } else {
          L19: {
            ((di) this).field_i = -126;
            if (0 != ((di) this).field_i % 100) {
              break L19;
            } else {
              ff.a(kf.field_u.field_C, 40, kf.field_u.field_z, im.field_b, lr.field_a[fi.a(6, he.field_o, (byte) -96)], (byte) 94);
              gn.a(34 - -fi.a(4, he.field_o, (byte) -96), true);
              break L19;
            }
          }
          L20: {
            L21: {
              if (((di) this).field_i % 2 != 0) {
                break L21;
              } else {
                im.field_b.a((ms) (Object) new eq(50, -1024 + (kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96)) >> 8, kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) - 1024 >> 8, -1, 0, false), (byte) 39);
                im.field_b.a((ms) (Object) new eq(50, -1024 + (kf.field_u.field_C + fi.a(2048, he.field_o, (byte) -96)) >> 8, -1024 + (kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96)) >> 8, -1, 2, false), (byte) 39);
                im.field_b.a((ms) (Object) new eq(50, -1024 + kf.field_u.field_C + fi.a(2048, he.field_o, (byte) -96) >> 8, kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96) - 1024 >> 8, -1, 4, false), (byte) 39);
                if (var3 == 0) {
                  var2_ref = (nt) (Object) im.field_b.b(68);
                  break L20;
                } else {
                  break L21;
                }
              }
            }
            im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - -fi.a(2048, he.field_o, (byte) -96) + -1024 >> 8, -1024 + (kf.field_u.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 8, -1, 1, true), (byte) 39);
            im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, kf.field_u.field_z - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, -1, 3, true), (byte) 39);
            im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o, (byte) -96) + 1024) >> 8, -1024 + kf.field_u.field_z - -fi.a(2048, he.field_o, (byte) -96) >> 8, -1, 5, true), (byte) 39);
            var2_ref = (nt) (Object) im.field_b.b(68);
            break L20;
          }
          L22: while (true) {
            L23: {
              L24: {
                if (var2_ref == null) {
                  break L24;
                } else {
                  if (var3 != 0) {
                    break L23;
                  } else {
                    L25: {
                      if (!var2_ref.a(-2567)) {
                        break L25;
                      } else {
                        var2_ref.b(false);
                        if (!(var2_ref instanceof vi)) {
                          break L25;
                        } else {
                          if (fi.a(3, he.field_o, (byte) -96) != 1) {
                            break L25;
                          } else {
                            if (((vi) (Object) var2_ref).field_u) {
                              break L25;
                            } else {
                              uv.a(lr.field_a[fi.a(6, he.field_o, (byte) -96)], var2_ref.field_o, param0 ^ 18547, var2_ref.field_k, im.field_b, 20);
                              break L25;
                            }
                          }
                        }
                      }
                    }
                    var2_ref = (nt) (Object) im.field_b.d((byte) 18);
                    if (var3 == 0) {
                      continue L22;
                    } else {
                      break L24;
                    }
                  }
                }
              }
              ((di) this).field_i = ((di) this).field_i + 1;
              break L23;
            }
            return;
          }
        }
    }

    final static String b(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String stackIn_4_0 = null;
        String stackIn_14_0 = null;
        String stackOut_3_0 = null;
        String stackOut_13_0 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 42 / ((param0 - -75) / 49);
        var7 = "(" + li.field_r + " " + vb.field_I + " " + ur.field_Q + ") " + iw.field_a;
        if (0 >= gu.field_d) {
          return var7;
        } else {
          var1 = var7 + ":";
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var3 >= gu.field_d) {
                  break L2;
                } else {
                  stackOut_3_0 = var1 + 32;
                  stackIn_14_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        var8 = stackIn_4_0;
                        var4 = ig.field_a.field_n[var3] & 255;
                        var5 = var4 >> 4;
                        var4 = var4 & 15;
                        if (10 > var5) {
                          break L4;
                        } else {
                          var5 += 55;
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 += 48;
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (10 > var4) {
                          break L6;
                        } else {
                          var4 += 55;
                          if (var6 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var4 += 48;
                      break L5;
                    }
                    var9 = var8 + (char)var5;
                    var1 = var9 + (char)var4;
                    var3++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_13_0 = (String) var1;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            }
            return stackIn_14_0;
          }
        }
    }

    public di() {
        super(12);
        im.field_b = new jn();
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException runtimeException = null;
        hr[] var5 = null;
        int var6 = 0;
        nt var7 = null;
        ha var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var8 = param1;
            var5 = hf.field_H;
            wo.a(var5, 60, 210, 0, 1, var8, 220, 350, 1, true);
            wo.a(hf.field_H, lu.field_e.a() + 20, -10 + (-(lu.field_e.c() >> 1) + 320), -1426063360, 3, param1, lu.field_e.c() - -20, 190 - (lu.field_e.a() >> 1), 1, true);
            lu.field_e.a(-(lu.field_e.c() >> 1) + 320, 200 - (lu.field_e.a() >> 1));
            var7 = (nt) (Object) im.field_b.b(-102);
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 == null) {
                    break L3;
                  } else {
                    var7.a(param1, param2 + 2230);
                    var7 = (nt) (Object) im.field_b.d((byte) 18);
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                kf.field_u.a(param1, param2 + 21754);
                super.a(param0, param1, param2);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("di.B(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    static {
    }
}
