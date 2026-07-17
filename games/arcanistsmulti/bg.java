/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bg {
    static kg field_d;
    static String field_b;
    static int field_c;
    static boolean field_a;
    static qb field_e;

    public static void a() {
        field_e = null;
        field_d = null;
        field_b = null;
    }

    abstract void a(int param0, byte[] param1);

    final static boolean a(int param0, char param1) {
        if (param1 < 32) {
          if (param1 < 160) {
            if (param1 != 8364) {
              if (param1 != 338) {
                if (8212 != param1) {
                  if (param1 != 339) {
                    if (param1 == 376) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param1 > 255) {
              if (param1 != 8364) {
                if (param1 != 338) {
                  if (8212 != param1) {
                    if (param1 != 339) {
                      if (param1 != 376) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          if (126 < param1) {
            if (param1 >= 160) {
              if (param1 <= 255) {
                return true;
              } else {
                if (param1 != 8364) {
                  if (param1 != 338) {
                    if (8212 != param1) {
                      if (param1 != 339) {
                        if (param1 == 376) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (param1 != 8364) {
                if (param1 != 338) {
                  if (8212 != param1) {
                    if (param1 != 339) {
                      if (param1 == 376) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (nm.field_h != -1) {
          if (param1 == nm.field_h) {
            nm.field_h = param1;
            int discarded$4 = 112;
            boolean discarded$5 = lc.a();
            he.field_e.b((byte) -76, 66);
            he.field_e.f(param1, (byte) -78);
            if (2 <= qf.field_d) {
              if (ua.field_P + ta.a(true, param1) <= jf.field_j) {
                if ((cb.field_e & 1L << param1) != 0L) {
                  return;
                } else {
                  ua.field_P = ua.field_P + ta.a(true, param1);
                  nm.field_h = -1;
                  cb.field_e = cb.field_e | 1L << param1;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          nm.field_h = param1;
          int discarded$6 = 112;
          boolean discarded$7 = lc.a();
          he.field_e.b((byte) -76, 66);
          he.field_e.f(param1, (byte) -78);
          if (2 <= qf.field_d) {
            if (ua.field_P + ta.a(true, param1) <= jf.field_j) {
              if ((cb.field_e & 1L << param1) != 0L) {
                return;
              } else {
                ua.field_P = ua.field_P + ta.a(true, param1);
                nm.field_h = -1;
                cb.field_e = cb.field_e | 1L << param1;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0) {
        n.field_g.a(param0, true);
        cn var2 = ln.field_U;
        if (var2 != null) {
            var2.a(n.field_g.field_V, true, n.field_g.field_nb);
            return;
        }
    }

    abstract byte[] b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Real-life threats";
        field_c = 32;
    }
}
