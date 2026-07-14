/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mm {
    int field_f;
    int field_c;
    static ji[] field_a;
    static float field_d;
    static ah field_e;
    int[] field_h;
    java.awt.Image field_b;
    static String field_g;

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    public static void b(boolean param0) {
        field_e = null;
        if (param0) {
            field_e = null;
        }
        field_g = null;
        field_a = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final static boolean a(vk param0, int param1) {
        wm var3 = null;
        int var4 = 0;
        int var5 = 0;
        ei var6 = null;
        var5 = HoldTheLine.field_D;
        if (param1 == -65) {
          if (param0.field_r) {
            return false;
          } else {
            L0: {
              if (param0.field_j != null) {
                break L0;
              } else {
                var6 = new ei();
                var3 = (wm) (Object) param0.field_m.b((byte) 85);
                L1: while (true) {
                  if (var3 == null) {
                    var3 = (wm) (Object) param0.field_k.b((byte) 101);
                    L2: while (true) {
                      if (var3 == null) {
                        param0.field_j = new om[var6.field_e];
                        var4 = 0;
                        L3: while (true) {
                          if (var6.field_e <= var4) {
                            param0.field_n = 0;
                            break L0;
                          } else {
                            param0.field_j[var4] = (om) var6.field_b[var4];
                            var4++;
                            continue L3;
                          }
                        }
                      } else {
                        var4 = 0;
                        L4: while (true) {
                          L5: {
                            if (var4 >= var6.field_e) {
                              var6.a((Object) (Object) var3.field_E, (byte) 6);
                              break L5;
                            } else {
                              if (var6.field_b[var4] != (Object) (Object) var3.field_E) {
                                var4++;
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var3 = (wm) (Object) param0.field_k.c((byte) 105);
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = 0;
                    L6: while (true) {
                      L7: {
                        if (var4 >= var6.field_e) {
                          var6.a((Object) (Object) var3.field_E, (byte) 6);
                          break L7;
                        } else {
                          if (var6.field_b[var4] != (Object) (Object) var3.field_E) {
                            var4++;
                            continue L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3 = (wm) (Object) param0.field_m.c((byte) -70);
                      continue L1;
                    }
                  }
                }
              }
            }
            L8: {
              if (param0.field_o != 0) {
                if (param0.field_o != 1) {
                  if (2 != param0.field_o) {
                    if ((param0.field_o ^ -1) != -4) {
                      if (param0.field_o != 4) {
                        if (param0.field_o == -6) {
                          if (null == ha.field_i.a(8192)) {
                            return false;
                          } else {
                            if (null == kc.field_b.a(8192)) {
                              return false;
                            } else {
                              break L8;
                            }
                          }
                        } else {
                          if (-7 == param0.field_o) {
                            if (hg.field_Q.a(param1 ^ -8257) == null) {
                              return false;
                            } else {
                              if (null != fd.field_e.a(8192)) {
                                break L8;
                              } else {
                                return false;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        if (ug.field_b.a(8192) == null) {
                          return false;
                        } else {
                          if (ha.field_i.a(8192) != null) {
                            break L8;
                          } else {
                            return false;
                          }
                        }
                      }
                    } else {
                      if (null == kc.field_b.a(8192)) {
                        return false;
                      } else {
                        if (null == ug.field_b.a(8192)) {
                          return false;
                        } else {
                          break L8;
                        }
                      }
                    }
                  } else {
                    if (a.field_F.a(8192) != null) {
                      if (lk.field_a.a(8192) == null) {
                        return false;
                      } else {
                        break L8;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  if (a.field_F.a(param1 + 8257) != null) {
                    if (hf.field_h.a(8192) != null) {
                      break L8;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                if (null == ol.field_h.a(param1 ^ -8257)) {
                  return false;
                } else {
                  if (fd.field_e.a(param1 ^ -8257) != null) {
                    break L8;
                  } else {
                    return false;
                  }
                }
              }
            }
            L9: while (true) {
              if (param0.field_j.length <= param0.field_n) {
                return true;
              } else {
                if (!param0.field_j[param0.field_n].b((byte) 48)) {
                  return false;
                } else {
                  param0.field_n = param0.field_n + 1;
                  continue L9;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final static sh a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = HoldTheLine.field_D;
        var2 = param0.length();
        if (var2 != 0) {
          if ((var2 ^ -1) < -65) {
            return wb.field_h;
          } else {
            if ((char)param1 == param0.charAt(0)) {
              if (34 != param0.charAt(-1 + var2)) {
                return qj.field_F;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (var4 < -1 + var2) {
                    var5 = param0.charAt(var4);
                    if (var5 != 92) {
                      L1: {
                        if (var5 != 34) {
                          break L1;
                        } else {
                          if (var3 == 0) {
                            return qj.field_F;
                          } else {
                            break L1;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var3 != 0) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L2;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L2;
                        }
                      }
                      var3 = stackIn_17_0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var3 = 0;
              var4 = 0;
              L3: while (true) {
                if (var4 < var2) {
                  var5 = param0.charAt(var4);
                  if (var5 != 46) {
                    if (-1 != qk.field_I.indexOf(var5)) {
                      var3 = 0;
                      var4++;
                      continue L3;
                    } else {
                      return qj.field_F;
                    }
                  } else {
                    L4: {
                      if (var4 == 0) {
                        break L4;
                      } else {
                        if (var4 == var2 - 1) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    return qj.field_F;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return fo.field_k;
        }
    }

    final void a(boolean param0) {
        if (param0) {
            field_d = -1.6866915225982666f;
        }
        tc.a(((mm) this).field_h, ((mm) this).field_f, ((mm) this).field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ah();
        field_g = "Unpacking graphics";
    }
}
