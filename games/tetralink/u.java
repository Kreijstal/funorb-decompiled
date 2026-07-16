/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    private ec field_f;
    private ah field_c;
    static String field_d;
    static int field_a;
    static hl field_b;
    static fg field_g;
    private ah field_e;

    public static void b(int param0) {
        if (param0 != 32768) {
          u.b(61);
          field_b = null;
          field_g = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(int param0) {
        if (cl.field_e) {
          if (param0 > 79) {
            if (sf.field_d != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            field_b = null;
            if (sf.field_d != 0) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static String a(int param0, fj param1) {
        Object var3_ref = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        Object var6 = null;
        String var7 = null;
        String var8 = null;
        var3_ref = null;
        var4 = TetraLink.field_J;
        var6 = null;
        var2 = var6;
        if (param0 == 18440) {
          L0: {
            if (param1.field_e == null) {
              break L0;
            } else {
              L1: {
                var8 = param1.field_e;
                var2 = (Object) (Object) var8;
                var3_ref = var2;
                var2 = (Object) (Object) var8;
                if (param1.field_k == 1) {
                  var2 = (Object) (Object) ("<img=0>" + var8);
                  break L1;
                } else {
                  break L1;
                }
              }
              if ((param1.field_k ^ -1) != -3) {
                break L0;
              } else {
                var2 = (Object) (Object) ("<img=1>" + var2);
                var3_ref = var2;
                var3_ref = var2;
                break L0;
              }
            }
          }
          L2: {
            var3 = "";
            if (-3 == (param1.field_i ^ -1)) {
              break L2;
            } else {
              L3: {
                if (0 != param1.field_i) {
                  break L3;
                } else {
                  if (!go.field_c) {
                    break L3;
                  } else {
                    var3 = "[" + nm.field_v + "] ";
                    break L3;
                  }
                }
              }
              L4: {
                if (param1.field_i != 1) {
                  break L4;
                } else {
                  var3 = "[" + sk.a(new String[1], qe.field_e, 127) + "] ";
                  break L4;
                }
              }
              L5: {
                if (-5 != (param1.field_i ^ -1)) {
                  break L5;
                } else {
                  if (ec.field_h == null) {
                    break L5;
                  } else {
                    var3 = "[" + ec.field_h + "] ";
                    break L5;
                  }
                }
              }
              L6: {
                if (-4 != (param1.field_i ^ -1)) {
                  break L6;
                } else {
                  var3 = "[#" + param1.field_c + "] ";
                  break L6;
                }
              }
              if (!param1.field_l) {
                var3 = var3 + var2 + ": ";
                if (var4 != 0) {
                  break L2;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          }
          if (param1.field_l) {
            return var3;
          } else {
            L7: {
              if (param1.field_g != 0) {
                break L7;
              } else {
                if (0 != param1.field_s) {
                  break L7;
                } else {
                  var3 = sk.a(new String[1], vd.field_b, 119);
                  break L7;
                }
              }
            }
            var3 = sk.a(new String[1], mc.field_h, param0 ^ 18544);
            return var3;
          }
        } else {
          field_d = null;
          if (param1.field_e != null) {
            L8: {
              var7 = param1.field_e;
              var2 = (Object) (Object) var7;
              var3 = (String) var2;
              var2 = (Object) (Object) var7;
              if (param1.field_k == 1) {
                var2 = (Object) (Object) ("<img=0>" + var7);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((param1.field_k ^ -1) != -3) {
                break L9;
              } else {
                var2 = (Object) (Object) ("<img=1>" + var2);
                var3 = (String) var2;
                var3 = (String) var2;
                break L9;
              }
            }
            var3 = "";
            if (-3 != (param1.field_i ^ -1)) {
              L10: {
                if (0 != param1.field_i) {
                  break L10;
                } else {
                  if (!go.field_c) {
                    break L10;
                  } else {
                    var3 = "[" + nm.field_v + "] ";
                    break L10;
                  }
                }
              }
              L11: {
                if (param1.field_i != 1) {
                  break L11;
                } else {
                  var3 = "[" + sk.a(new String[1], qe.field_e, 127) + "] ";
                  break L11;
                }
              }
              L12: {
                if (-5 != (param1.field_i ^ -1)) {
                  break L12;
                } else {
                  if (ec.field_h == null) {
                    break L12;
                  } else {
                    var3 = "[" + ec.field_h + "] ";
                    break L12;
                  }
                }
              }
              L13: {
                if (-4 != (param1.field_i ^ -1)) {
                  break L13;
                } else {
                  var3 = "[#" + param1.field_c + "] ";
                  break L13;
                }
              }
              if (!param1.field_l) {
                var3 = var3 + var2 + ": ";
                if (var4 != 0) {
                  if (param1.field_l) {
                    return var3;
                  } else {
                    L14: {
                      if (param1.field_g != 0) {
                        break L14;
                      } else {
                        if (0 != param1.field_s) {
                          break L14;
                        } else {
                          var3 = sk.a(new String[1], vd.field_b, 119);
                          break L14;
                        }
                      }
                    }
                    var3 = sk.a(new String[1], mc.field_h, param0 ^ 18544);
                    return var3;
                  }
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              if (param1.field_l) {
                return var3;
              } else {
                L15: {
                  L16: {
                    if (param1.field_g != 0) {
                      break L16;
                    } else {
                      if (0 != param1.field_s) {
                        break L16;
                      } else {
                        var3 = sk.a(new String[1], vd.field_b, 119);
                        if (var4 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  var3 = sk.a(new String[1], mc.field_h, param0 ^ 18544);
                  break L15;
                }
                return var3;
              }
            }
          } else {
            L17: {
              L18: {
                var3 = "";
                if (-3 == (param1.field_i ^ -1)) {
                  break L18;
                } else {
                  L19: {
                    if (0 != param1.field_i) {
                      break L19;
                    } else {
                      if (!go.field_c) {
                        break L19;
                      } else {
                        var3 = "[" + nm.field_v + "] ";
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if (param1.field_i != 1) {
                      break L20;
                    } else {
                      var3 = "[" + sk.a(new String[1], qe.field_e, 127) + "] ";
                      break L20;
                    }
                  }
                  L21: {
                    if (-5 != (param1.field_i ^ -1)) {
                      break L21;
                    } else {
                      if (ec.field_h == null) {
                        break L21;
                      } else {
                        var3 = "[" + ec.field_h + "] ";
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if (-4 != (param1.field_i ^ -1)) {
                      break L22;
                    } else {
                      var3 = "[#" + param1.field_c + "] ";
                      break L22;
                    }
                  }
                  if (!param1.field_l) {
                    var3 = var3 + var6 + ": ";
                    if (var4 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  } else {
                    break L17;
                  }
                }
              }
              if (!param1.field_l) {
                L23: {
                  var6 = var2;
                  if (param1.field_g != 0) {
                    break L23;
                  } else {
                    if (0 != param1.field_s) {
                      break L23;
                    } else {
                      var3 = sk.a(new String[1], vd.field_b, 119);
                      break L23;
                    }
                  }
                }
                var6 = var2;
                var3 = sk.a(new String[1], mc.field_h, param0 ^ 18544);
                break L17;
              } else {
                break L17;
              }
            }
            return var3;
          }
        }
    }

    final j a(int param0, int param1) {
        j var3 = null;
        byte[] var4 = null;
        j var5 = null;
        j var6 = null;
        var3 = (j) ((u) this).field_f.a((byte) 119, (long)param0);
        if (var3 == null) {
          L0: {
            L1: {
              if (-32769 < (param0 ^ -1)) {
                break L1;
              } else {
                var4 = ((u) this).field_c.a(-107, param0 & 32767, 1);
                if (TetraLink.field_J == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = ((u) this).field_e.a(22, param0, 1);
            break L0;
          }
          if (param1 < -125) {
            L2: {
              var6 = new j();
              if (var4 != null) {
                var6.a(new bh(var4), 15067);
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 >= 32768) {
              var6.g(25271);
              ((u) this).field_f.a((Object) (Object) var6, (long)param0, (byte) 50);
              return var6;
            } else {
              ((u) this).field_f.a((Object) (Object) var6, (long)param0, (byte) 50);
              return var6;
            }
          } else {
            L3: {
              j discarded$1 = ((u) this).a(-123, -16);
              var5 = new j();
              if (var4 != null) {
                var5.a(new bh(var4), 15067);
                break L3;
              } else {
                break L3;
              }
            }
            if (param0 < 32768) {
              ((u) this).field_f.a((Object) (Object) var5, (long)param0, (byte) 50);
              return var5;
            } else {
              var5.g(25271);
              ((u) this).field_f.a((Object) (Object) var5, (long)param0, (byte) 50);
              return var5;
            }
          }
        } else {
          return var3;
        }
    }

    u(int param0, ah param1, ah param2, sm param3) {
        ((u) this).field_f = new ec(64);
        ((u) this).field_c = param2;
        ((u) this).field_e = param1;
        if (((u) this).field_e != null) {
            int discarded$0 = ((u) this).field_e.b(-23126, 1);
        }
        if (null != ((u) this).field_c) {
            int discarded$1 = ((u) this).field_c.b(-23126, 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Play free version";
    }
}
