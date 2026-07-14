/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mea extends ksa {
    boolean field_f;
    static ij field_e;
    qfa field_d;

    abstract void a(int param0, int param1);

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param0 >= 112) {
          var2 = param1.charAt(0);
          var3 = 1;
          L0: while (true) {
            if (param1.length() > var3) {
              if (var2 == param1.charAt(var3)) {
                var3++;
                continue L0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          mea.a(-5, (byte) 121, 58, -64);
          var2 = param1.charAt(0);
          var3 = 1;
          L1: while (true) {
            if (param1.length() > var3) {
              if (var2 == param1.charAt(var3)) {
                var3++;
                continue L1;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final int d(int param0) {
        if (param0 != 23230) {
            ((mea) this).field_f = false;
            return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 >= -88) {
            field_e = null;
        }
    }

    abstract void c(byte param0);

    abstract void a(int param0, int param1, int param2);

    int d(byte param0) {
        if (param0 != 7) {
            ((mea) this).a(39, 72);
            return 0;
        }
        return 0;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final boolean e(byte param0) {
        if (param0 <= 56) {
            ((mea) this).field_f = false;
            return ((mea) this).field_f;
        }
        return ((mea) this).field_f;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param3 != 0) {
            break L0;
          } else {
            if (param0 != kib.field_d) {
              kib.field_d = param0;
              ebb.field_b = true;
              deb.a(40, param2);
              break L0;
            } else {
              if (param1 > -69) {
                field_e = null;
                if (-2 == (param3 ^ -1)) {
                  L1: {
                    if (idb.field_p != param0) {
                      ebb.field_b = true;
                      idb.field_p = param0;
                      deb.a(40, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (2 == param3) {
                    if (lla.field_h != param0) {
                      ebb.field_b = true;
                      lla.field_h = param0;
                      deb.a(40, param2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (2 == param3) {
                    if (lla.field_h != param0) {
                      ebb.field_b = true;
                      lla.field_h = param0;
                      deb.a(40, param2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L2: {
                  if (-2 != (param3 ^ -1)) {
                    break L2;
                  } else {
                    if (idb.field_p != param0) {
                      ebb.field_b = true;
                      idb.field_p = param0;
                      deb.a(40, param2);
                      break L2;
                    } else {
                      if (2 == param3) {
                        if (lla.field_h == param0) {
                          return;
                        } else {
                          ebb.field_b = true;
                          lla.field_h = param0;
                          deb.a(40, param2);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (2 == param3) {
                  if (lla.field_h == param0) {
                    return;
                  } else {
                    ebb.field_b = true;
                    lla.field_h = param0;
                    deb.a(40, param2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param1 <= -69) {
          L3: {
            if (-2 != (param3 ^ -1)) {
              break L3;
            } else {
              if (idb.field_p != param0) {
                ebb.field_b = true;
                idb.field_p = param0;
                deb.a(40, param2);
                break L3;
              } else {
                L4: {
                  if (2 != param3) {
                    break L4;
                  } else {
                    if (lla.field_h != param0) {
                      ebb.field_b = true;
                      lla.field_h = param0;
                      deb.a(40, param2);
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          L5: {
            if (2 != param3) {
              break L5;
            } else {
              if (lla.field_h != param0) {
                ebb.field_b = true;
                lla.field_h = param0;
                deb.a(40, param2);
                break L5;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L6: {
            field_e = null;
            if (-2 != (param3 ^ -1)) {
              break L6;
            } else {
              if (idb.field_p != param0) {
                ebb.field_b = true;
                idb.field_p = param0;
                deb.a(40, param2);
                break L6;
              } else {
                if (2 == param3) {
                  if (lla.field_h == param0) {
                    return;
                  } else {
                    ebb.field_b = true;
                    lla.field_h = param0;
                    deb.a(40, param2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          L7: {
            if (2 != param3) {
              break L7;
            } else {
              if (lla.field_h != param0) {
                ebb.field_b = true;
                lla.field_h = param0;
                deb.a(40, param2);
                break L7;
              } else {
                return;
              }
            }
          }
          return;
        }
    }

    abstract void a(aia param0, int param1, aia param2, int param3);

    abstract boolean f(int param0);

    abstract boolean a(int param0);

    mea(qfa param0) {
        ((mea) this).field_d = param0;
    }

    final static String a(boolean param0) {
        if (!param0) {
            field_e = null;
            return qga.field_b.a(-1);
        }
        return qga.field_b.a(-1);
    }

    static {
    }
}
