/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends pd {
    static long field_s;
    private int field_u;
    static String field_t;
    static hs field_v;

    final void g(byte param0) {
        if (param0 != 3) {
            ((ue) this).field_u = 4;
        }
    }

    final static boolean a(String param0, int param1) {
        Object var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        if (param1 != 0) {
          var3 = null;
          boolean discarded$2 = ue.a((String) null, -83);
          var4 = (CharSequence) (Object) param0;
          return tia.field_b.equals((Object) (Object) jd.a(1, var4));
        } else {
          var5 = (CharSequence) (Object) param0;
          return tia.field_b.equals((Object) (Object) jd.a(1, var5));
        }
    }

    public static void r(int param0) {
        field_t = null;
        field_v = null;
        if (param0 != 0) {
            ue.r(113);
        }
    }

    final int j(byte param0) {
        if (param0 >= -26) {
            return -74;
        }
        return ((ue) this).field_u;
    }

    ue(la param0, boolean param1) {
        super(param0, param1);
    }

    ue(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((ue) this).field_u = param1.b((byte) 44, 6);
    }

    final boolean a(int param0, hca param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (!param1.a((ue) this, (byte) 76)) {
          return false;
        } else {
          var3 = ((ue) this).field_u;
          if (var3 == 0) {
            param1.g(62, 106);
            if (param0 <= -114) {
              var3 = ((ue) this).field_u;
              if (var3 == -1) {
                if (param1.x(-70)) {
                  return false;
                } else {
                  param1.a(((ue) this).field_g.b(125), (byte) -102, 58982, 1);
                  ((ue) this).c(false);
                  return true;
                }
              } else {
                if (-2 != var3) {
                  if (-3 != var3) {
                    if (-4 == var3) {
                      if (!param1.x(49)) {
                        param1.a(((ue) this).field_g, false, 2);
                        param1.a(((ue) this).field_g.b(-77), (byte) -120, 52428, 0);
                        ((ue) this).c(false);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    param1.a(((ue) this).field_g, false, 1);
                    ((ue) this).c(false);
                    return true;
                  }
                } else {
                  param1.a(((ue) this).field_g, false, 0);
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            if (-2 != (var3 ^ -1)) {
              if (var3 == 2) {
                param1.g(64, 115);
                if (param0 <= -114) {
                  var3 = ((ue) this).field_u;
                  if (var3 == -1) {
                    if (param1.x(-70)) {
                      return false;
                    } else {
                      param1.a(((ue) this).field_g.b(125), (byte) -102, 58982, 1);
                      ((ue) this).c(false);
                      return true;
                    }
                  } else {
                    if (-2 != var3) {
                      if (-3 != var3) {
                        if (-4 == var3) {
                          if (param1.x(49)) {
                            return false;
                          } else {
                            param1.a(((ue) this).field_g, false, 2);
                            param1.a(((ue) this).field_g.b(-77), (byte) -120, 52428, 0);
                            ((ue) this).c(false);
                            return true;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        param1.a(((ue) this).field_g, false, 1);
                        ((ue) this).c(false);
                        return true;
                      }
                    } else {
                      param1.a(((ue) this).field_g, false, 0);
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                if (3 == var3) {
                  param1.g(65, 123);
                  if (param0 <= -114) {
                    var3 = ((ue) this).field_u;
                    if (var3 == -1) {
                      if (!param1.x(-70)) {
                        param1.a(((ue) this).field_g.b(125), (byte) -102, 58982, 1);
                        ((ue) this).c(false);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      if (-2 != var3) {
                        if (-3 != var3) {
                          if (-4 == var3) {
                            if (param1.x(49)) {
                              return false;
                            } else {
                              param1.a(((ue) this).field_g, false, 2);
                              param1.a(((ue) this).field_g.b(-77), (byte) -120, 52428, 0);
                              ((ue) this).c(false);
                              return true;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          param1.a(((ue) this).field_g, false, 1);
                          ((ue) this).c(false);
                          return true;
                        }
                      } else {
                        param1.a(((ue) this).field_g, false, 0);
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  param1.g(63, -74);
                  if (param0 <= -114) {
                    var3 = ((ue) this).field_u;
                    if (var3 == -1) {
                      if (param1.x(-70)) {
                        return false;
                      } else {
                        param1.a(((ue) this).field_g.b(125), (byte) -102, 58982, 1);
                        ((ue) this).c(false);
                        return true;
                      }
                    } else {
                      if (-2 != var3) {
                        if (-3 != var3) {
                          if (-4 == var3) {
                            if (!param1.x(49)) {
                              param1.a(((ue) this).field_g, false, 2);
                              param1.a(((ue) this).field_g.b(-77), (byte) -120, 52428, 0);
                              ((ue) this).c(false);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          param1.a(((ue) this).field_g, false, 1);
                          ((ue) this).c(false);
                          return true;
                        }
                      } else {
                        param1.a(((ue) this).field_g, false, 0);
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              param1.g(63, 110);
              if (param0 <= -114) {
                var3 = ((ue) this).field_u;
                if (var3 == -1) {
                  if (param1.x(-70)) {
                    return false;
                  } else {
                    param1.a(((ue) this).field_g.b(125), (byte) -102, 58982, 1);
                    ((ue) this).c(false);
                    return true;
                  }
                } else {
                  if (-2 != var3) {
                    if (-3 != var3) {
                      if (-4 == var3) {
                        if (!param1.x(49)) {
                          param1.a(((ue) this).field_g, false, 2);
                          param1.a(((ue) this).field_g.b(-77), (byte) -120, 52428, 0);
                          ((ue) this).c(false);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      param1.a(((ue) this).field_g, false, 1);
                      ((ue) this).c(false);
                      return true;
                    }
                  } else {
                    param1.a(((ue) this).field_g, false, 0);
                    return true;
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            return;
        }
        ((ue) this).field_u = param0;
    }

    final int a(boolean param0) {
        if (param0) {
            field_v = null;
            return 25;
        }
        return 25;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -128, ((ue) this).field_u, 6);
    }

    final void a(boolean param0, byte param1) {
        super.a(param0, param1);
        if (param0) {
          if (0 != ((ue) this).field_u) {
            return;
          } else {
            ((ue) this).b(true).a(0, 0, 67, 0, (byte) 6);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Enter Tomb";
        field_v = new hs();
    }
}
