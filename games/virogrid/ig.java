/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static long[] field_b;
    static String field_d;
    static je field_c;
    static String field_a;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 >= -46) {
          var2 = null;
          ig.a(true, (r) null, (eh) null, 84);
          field_a = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static rn a(int param0, String param1, int param2) {
        ph var3 = null;
        var3 = new ph();
        if (param2 >= -48) {
          field_b = null;
          ((rn) (Object) var3).field_b = param0;
          ((rn) (Object) var3).field_d = param1;
          return (rn) (Object) var3;
        } else {
          ((rn) (Object) var3).field_b = param0;
          ((rn) (Object) var3).field_d = param1;
          return (rn) (Object) var3;
        }
    }

    final static boolean a(byte param0, char param1) {
        if (32 <= param1) {
          if (param1 > 126) {
            if (param0 < -104) {
              if (param1 < 160) {
                if (param1 != 8364) {
                  if (338 != param1) {
                    if (param1 != 8212) {
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
                    if (338 != param1) {
                      if (param1 != 8212) {
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
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (param0 < -104) {
            if (param1 < 160) {
              if (param1 != 8364) {
                if (338 != param1) {
                  if (param1 != 8212) {
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
                  if (338 != param1) {
                    if (param1 != 8212) {
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
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static void a(boolean param0, r param1, eh param2, int param3) {
        of.field_a = wh.a((byte) 5) * param3 / 1000;
        la.a(1048576, param2);
        pm.a(param2, 106);
        Virogrid.a(param2, (byte) -9);
        ag.a(255);
        qk.a(param0);
        kf.field_e = -of.field_a + 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
        field_d = "Players: ";
        field_a = "Your ignore list is full. Max of 100 hit.";
    }
}
