/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ska extends nv implements mra {
    private boolean field_t;
    private mg field_n;
    private boolean field_o;
    static kia field_r;
    private boolean field_p;
    private roa field_u;
    private boolean field_s;
    static String[] field_q;

    final void a(boolean param0, fsa param1) {
        if (!param0) {
            ((ska) this).field_p = false;
            super.a(param0, param1);
            return;
        }
        super.a(param0, param1);
    }

    final static mi a(int param0, in param1) {
        int var2 = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        String var8 = null;
        String var12 = null;
        StringBuilder var22 = null;
        String var23 = null;
        String var26 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == -45) {
          param1.field_b = param1.field_b - 1;
          var2 = param1.field_b - 1;
          var7 = new StringBuilder();
          var3 = var7;
          L0: while (true) {
            if (!param1.a(0)) {
              L1: {
                var4 = param1.b(param0 + 21143);
                if (Character.isWhitespace((char) var4)) {
                  break L1;
                } else {
                  if (var4 == 44) {
                    break L1;
                  } else {
                    if (var4 == 40) {
                      break L1;
                    } else {
                      if (41 != var4) {
                        StringBuilder discarded$2 = var7.append(var4);
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              param1.field_b = param1.field_b - 1;
              var12 = var7.toString();
              if (!var12.equals((Object) (Object) "true")) {
                if (!var12.equals((Object) (Object) "false")) {
                  if (45 != var12.charAt(0)) {
                    if (Character.isDigit(var12.charAt(0))) {
                      var4 = dc.field_o;
                      return new mi(var4, var2, var12);
                    } else {
                      var4 = tr.field_f;
                      return new mi(var4, var2, var12);
                    }
                  } else {
                    var4 = dc.field_o;
                    return new mi(var4, var2, var12);
                  }
                } else {
                  var4 = dja.field_r;
                  return new mi(var4, var2, var12);
                }
              } else {
                var4 = dja.field_r;
                return new mi(var4, var2, var12);
              }
            } else {
              L2: {
                L3: {
                  var8 = var7.toString();
                  if (var8.equals((Object) (Object) "true")) {
                    break L3;
                  } else {
                    if (!var8.equals((Object) (Object) "false")) {
                      L4: {
                        if (45 == var8.charAt(0)) {
                          break L4;
                        } else {
                          if (Character.isDigit(var8.charAt(0))) {
                            break L4;
                          } else {
                            var4 = tr.field_f;
                            break L2;
                          }
                        }
                      }
                      var4 = dc.field_o;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4 = dja.field_r;
                break L2;
              }
              return new mi(var4, var2, var8);
            }
          }
        } else {
          field_r = null;
          param1.field_b = param1.field_b - 1;
          var2 = param1.field_b - 1;
          var22 = new StringBuilder();
          var3 = var22;
          L5: while (true) {
            if (param1.a(0)) {
              var26 = var22.toString();
              if (var26.equals((Object) (Object) "true")) {
                var4 = dja.field_r;
                return new mi(var4, var2, var26);
              } else {
                if (!var26.equals((Object) (Object) "false")) {
                  L6: {
                    if (45 == var26.charAt(0)) {
                      break L6;
                    } else {
                      if (Character.isDigit(var26.charAt(0))) {
                        break L6;
                      } else {
                        var4 = tr.field_f;
                        return new mi(var4, var2, var26);
                      }
                    }
                  }
                  var4 = dc.field_o;
                  return new mi(var4, var2, var26);
                } else {
                  var4 = dja.field_r;
                  return new mi(var4, var2, var26);
                }
              }
            } else {
              L7: {
                var4 = param1.b(param0 + 21143);
                if (Character.isWhitespace((char) var4)) {
                  break L7;
                } else {
                  if (var4 == 44) {
                    break L7;
                  } else {
                    if (var4 == 40) {
                      break L7;
                    } else {
                      if (41 != var4) {
                        StringBuilder discarded$3 = var22.append(var4);
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              L8: {
                L9: {
                  param1.field_b = param1.field_b - 1;
                  var23 = var22.toString();
                  if (var23.equals((Object) (Object) "true")) {
                    break L9;
                  } else {
                    if (!var23.equals((Object) (Object) "false")) {
                      L10: {
                        if (45 == var23.charAt(0)) {
                          break L10;
                        } else {
                          if (Character.isDigit(var23.charAt(0))) {
                            break L10;
                          } else {
                            var4 = tr.field_f;
                            break L8;
                          }
                        }
                      }
                      var4 = dc.field_o;
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var4 = dja.field_r;
                break L8;
              }
              return new mi(var4, var2, var23);
            }
          }
        }
    }

    final void a(roa param0, byte param1) {
        if (param1 < 40) {
            int discarded$0 = ((ska) this).a(true);
            ((ska) this).field_u = param0;
            return;
        }
        ((ska) this).field_u = param0;
    }

    public final void a(int param0, mg param1) {
        if (param0 < 81) {
            roa discarded$0 = ((ska) this).l(-69);
            ((ska) this).field_n = param1;
            return;
        }
        ((ska) this).field_n = param1;
    }

    ska(la param0, boolean param1) {
        super(param0, param1);
        ((ska) this).field_o = true;
        ((ska) this).field_n = new mg();
        ((ska) this).field_u = ci.a(0, -1);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        ((ska) this).field_n.a(15637, param1);
        ((ska) this).field_u.a(param1, (byte) 84);
        param1.a((byte) -128, ((ska) this).field_o ? 1 : 0, 1);
        param1.a((byte) -128, ((ska) this).field_p ? 1 : 0, 1);
    }

    public static void c(int param0) {
        field_r = null;
        if (param0 != 884207088) {
            return;
        }
        field_q = null;
    }

    public final boolean b(int param0) {
        int var2 = 0;
        var2 = -86 / ((param0 - 37) / 45);
        if (((ska) this).field_t) {
          if (!((ska) this).field_f) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final roa l(int param0) {
        if (param0 != -2) {
            ska.c(-6);
            return ((ska) this).field_u;
        }
        return ((ska) this).field_u;
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            ((ska) this).field_s = true;
            return true;
        }
        return true;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = 31 / ((59 - param0) / 41);
        if (param1 <= param2) {
          return rra.a(false, (param1 << 884207088) / param2);
        } else {
          return 2048 + -rra.a(false, (param2 << 1344739600) / param1);
        }
    }

    final boolean g(byte param0) {
        if (param0 == -68) {
          if (((ska) this).field_s) {
            if (!((ska) this).field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((ska) this).field_n = null;
          if (((ska) this).field_s) {
            if (!((ska) this).field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void m(int param0) {
        int var2 = 0;
        if (((ska) this).field_k) {
          return;
        } else {
          super.m(-65);
          var2 = 92 % ((param0 - 28) / 49);
          if (!((ska) this).field_f) {
            ((ska) this).field_t = false;
            return;
          } else {
            return;
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((ska) this).a(true, (kh) null);
            return 20;
        }
        return 20;
    }

    ska(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((ska) this).field_o = true;
        ((ska) this).field_n = new mg(param0.field_E, param1);
        ((ska) this).field_u = jl.a(param0, true, param1);
        ((ska) this).field_o = param1.b((byte) 44, 1) == -2 ? true : false;
        ((ska) this).field_u.a(90, ((ska) this).field_o);
        if (-9 <= param0.field_E) {
            ((ska) this).field_p = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        }
    }

    final void k(int param0) {
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        if (!((ska) this).field_p) {
          L0: {
            if (null == ((ska) this).field_n) {
              break L0;
            } else {
              ((ska) this).field_n.d(0);
              if (((ska) this).field_n.c(0)) {
                L1: {
                  stackOut_42_0 = this;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_43_0 = stackOut_42_0;
                  if (((ska) this).field_s) {
                    stackOut_44_0 = this;
                    stackOut_44_1 = 0;
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    break L1;
                  } else {
                    stackOut_43_0 = this;
                    stackOut_43_1 = 1;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_45_1 = stackOut_43_1;
                    break L1;
                  }
                }
                ((ska) this).field_s = stackIn_45_1 != 0;
                break L0;
              } else {
                ((ska) this).field_u.c(param0 + -5515);
                ((ska) this).field_t = false;
                if (param0 == 5418) {
                  if (((ska) this).field_s) {
                    ((ska) this).field_t = ((ska) this).field_u.a(((ska) this).field_g.g(-25787), ((ska) this).field_g.P(param0 + -5418) << -2002197072, (gma) (Object) ((ska) this).e(param0 + -5412), ((ska) this).field_g.d(3), ((ska) this).field_g.e(param0 + 4230), ((ska) this).b(true), 0, 0, et.b(((ska) this).field_g.a((byte) 55), ((ska) this).field_g.c(param0 ^ -5478), 123) / 2, false);
                    if (((ska) this).field_u.a(12111)) {
                      return;
                    } else {
                      ((ska) this).c(false);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L2: {
                    field_r = null;
                    if (!((ska) this).field_s) {
                      break L2;
                    } else {
                      ((ska) this).field_t = ((ska) this).field_u.a(((ska) this).field_g.g(-25787), ((ska) this).field_g.P(param0 + -5418) << -2002197072, (gma) (Object) ((ska) this).e(param0 + -5412), ((ska) this).field_g.d(3), ((ska) this).field_g.e(param0 + 4230), ((ska) this).b(true), 0, 0, et.b(((ska) this).field_g.a((byte) 55), ((ska) this).field_g.c(param0 ^ -5478), 123) / 2, false);
                      if (!((ska) this).field_u.a(12111)) {
                        ((ska) this).c(false);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          ((ska) this).field_u.c(param0 + -5515);
          ((ska) this).field_t = false;
          if (param0 == 5418) {
            if (((ska) this).field_s) {
              ((ska) this).field_t = ((ska) this).field_u.a(((ska) this).field_g.g(-25787), ((ska) this).field_g.P(param0 + -5418) << -2002197072, (gma) (Object) ((ska) this).e(param0 + -5412), ((ska) this).field_g.d(3), ((ska) this).field_g.e(param0 + 4230), ((ska) this).b(true), 0, 0, et.b(((ska) this).field_g.a((byte) 55), ((ska) this).field_g.c(param0 ^ -5478), 123) / 2, false);
              if (!((ska) this).field_u.a(12111)) {
                ((ska) this).c(false);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            field_r = null;
            if (((ska) this).field_s) {
              ((ska) this).field_t = ((ska) this).field_u.a(((ska) this).field_g.g(-25787), ((ska) this).field_g.P(param0 + -5418) << -2002197072, (gma) (Object) ((ska) this).e(param0 + -5412), ((ska) this).field_g.d(3), ((ska) this).field_g.e(param0 + 4230), ((ska) this).b(true), 0, 0, et.b(((ska) this).field_g.a((byte) 55), ((ska) this).field_g.c(param0 ^ -5478), 123) / 2, false);
              if (((ska) this).field_u.a(12111)) {
                return;
              } else {
                ((ska) this).c(false);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (!((ska) this).m((byte) 19).u(-25561)) {
            L3: {
              if (null == ((ska) this).field_n) {
                break L3;
              } else {
                ((ska) this).field_n.d(0);
                if (((ska) this).field_n.c(0)) {
                  L4: {
                    stackOut_12_0 = this;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (((ska) this).field_s) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  ((ska) this).field_s = stackIn_15_1 != 0;
                  break L3;
                } else {
                  L5: {
                    ((ska) this).field_u.c(param0 + -5515);
                    ((ska) this).field_t = false;
                    if (param0 == 5418) {
                      break L5;
                    } else {
                      field_r = null;
                      break L5;
                    }
                  }
                  L6: {
                    if (!((ska) this).field_s) {
                      break L6;
                    } else {
                      ((ska) this).field_t = ((ska) this).field_u.a(((ska) this).field_g.g(-25787), ((ska) this).field_g.P(param0 + -5418) << -2002197072, (gma) (Object) ((ska) this).e(param0 + -5412), ((ska) this).field_g.d(3), ((ska) this).field_g.e(param0 + 4230), ((ska) this).b(true), 0, 0, et.b(((ska) this).field_g.a((byte) 55), ((ska) this).field_g.c(param0 ^ -5478), 123) / 2, false);
                      if (!((ska) this).field_u.a(12111)) {
                        ((ska) this).c(false);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  return;
                }
              }
            }
            ((ska) this).field_u.c(param0 + -5515);
            ((ska) this).field_t = false;
            if (param0 == 5418) {
              if (((ska) this).field_s) {
                ((ska) this).field_t = ((ska) this).field_u.a(((ska) this).field_g.g(-25787), ((ska) this).field_g.P(param0 + -5418) << -2002197072, (gma) (Object) ((ska) this).e(param0 + -5412), ((ska) this).field_g.d(3), ((ska) this).field_g.e(param0 + 4230), ((ska) this).b(true), 0, 0, et.b(((ska) this).field_g.a((byte) 55), ((ska) this).field_g.c(param0 ^ -5478), 123) / 2, false);
                if (((ska) this).field_u.a(12111)) {
                  return;
                } else {
                  ((ska) this).c(false);
                  return;
                }
              } else {
                return;
              }
            } else {
              L7: {
                field_r = null;
                if (!((ska) this).field_s) {
                  break L7;
                } else {
                  ((ska) this).field_t = ((ska) this).field_u.a(((ska) this).field_g.g(-25787), ((ska) this).field_g.P(param0 + -5418) << -2002197072, (gma) (Object) ((ska) this).e(param0 + -5412), ((ska) this).field_g.d(3), ((ska) this).field_g.e(param0 + 4230), ((ska) this).b(true), 0, 0, et.b(((ska) this).field_g.a((byte) 55), ((ska) this).field_g.c(param0 ^ -5478), 123) / 2, false);
                  if (!((ska) this).field_u.a(12111)) {
                    ((ska) this).c(false);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a(int param0, int param1) {
        Object var4 = null;
        param0 = upa.a(((ska) this).field_s, param0, (byte) -55);
        if (param1 > -48) {
          var4 = null;
          mi discarded$2 = ska.a(-27, (in) null);
          param0 = upa.a(((ska) this).field_t, param0, (byte) -119);
          param0 = fs.a((byte) 89, param0, ((ska) this).field_u.b(524288));
          return param0;
        } else {
          param0 = upa.a(((ska) this).field_t, param0, (byte) -119);
          param0 = fs.a((byte) 89, param0, ((ska) this).field_u.b(524288));
          return param0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new kia();
        field_q = new String[100];
    }
}
