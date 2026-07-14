/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    private at field_e;
    static boolean field_a;
    static String field_d;
    static int field_c;
    private tc field_f;
    static wk[] field_b;

    final static byte[] a(int param0, String param1) {
        if (param0 != 50) {
          field_c = -105;
          return qk.field_e.a(param1, param0 ^ -72, "");
        } else {
          return qk.field_e.a(param1, param0 ^ -72, "");
        }
    }

    public static void a(byte param0) {
        if (param0 > -68) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final tc a(boolean param0, tc param1) {
        tc var3 = null;
        if (param0) {
            return null;
        }
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((bb) this).field_e.field_d.field_j;
        }
        if (!(((bb) this).field_e.field_d != var3)) {
            ((bb) this).field_f = null;
            return null;
        }
        ((bb) this).field_f = var3.field_j;
        return var3;
    }

    final tc b(int param0) {
        if (param0 != 50) {
            return null;
        }
        tc var2 = ((bb) this).field_f;
        if (!(var2 != ((bb) this).field_e.field_d)) {
            ((bb) this).field_f = null;
            return null;
        }
        ((bb) this).field_f = var2.field_b;
        return var2;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (null != tn.field_Z) {
          if (!tn.field_Z.c((byte) -121)) {
            if (null == ik.field_b) {
              if (param3 == 50) {
                if (!jt.a((byte) -92)) {
                  if (!vt.a(param1, param0, param2, (byte) 28)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                field_b = null;
                if (!jt.a((byte) -92)) {
                  if (!vt.a(param1, param0, param2, (byte) 28)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (!ik.field_b.l(18585)) {
                if (param3 == 50) {
                  if (!jt.a((byte) -92)) {
                    if (!vt.a(param1, param0, param2, (byte) 28)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  field_b = null;
                  if (!jt.a((byte) -92)) {
                    if (vt.a(param1, param0, param2, (byte) 28)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                ik.field_b = null;
                ot.g(76);
                return true;
              }
            }
          } else {
            ot.g(76);
            return true;
          }
        } else {
          if (null == ik.field_b) {
            if (param3 == 50) {
              if (!jt.a((byte) -92)) {
                if (vt.a(param1, param0, param2, (byte) 28)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              field_b = null;
              if (!jt.a((byte) -92)) {
                if (vt.a(param1, param0, param2, (byte) 28)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            if (!ik.field_b.l(18585)) {
              if (param3 == 50) {
                if (!jt.a((byte) -92)) {
                  if (vt.a(param1, param0, param2, (byte) 28)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                field_b = null;
                if (!jt.a((byte) -92)) {
                  if (vt.a(param1, param0, param2, (byte) 28)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              ik.field_b = null;
              ot.g(76);
              return true;
            }
          }
        }
    }

    final tc b(byte param0) {
        tc var2 = null;
        if (param0 == -112) {
          var2 = ((bb) this).field_f;
          if (var2 == ((bb) this).field_e.field_d) {
            ((bb) this).field_f = null;
            return null;
          } else {
            ((bb) this).field_f = var2.field_j;
            return var2;
          }
        } else {
          return null;
        }
    }

    final tc a(int param0) {
        tc var2 = null;
        var2 = ((bb) this).field_e.field_d.field_j;
        if (param0 == 50) {
          if (var2 == ((bb) this).field_e.field_d) {
            ((bb) this).field_f = null;
            return null;
          } else {
            ((bb) this).field_f = var2.field_j;
            return var2;
          }
        } else {
          field_d = null;
          if (var2 == ((bb) this).field_e.field_d) {
            ((bb) this).field_f = null;
            return null;
          } else {
            ((bb) this).field_f = var2.field_j;
            return var2;
          }
        }
    }

    final tc c(int param0) {
        tc var2 = null;
        var2 = ((bb) this).field_e.field_d.field_b;
        if (var2 != ((bb) this).field_e.field_d) {
          if (param0 != 50) {
            return null;
          } else {
            ((bb) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          ((bb) this).field_f = null;
          return null;
        }
    }

    final tc a(tc param0, boolean param1) {
        tc var3 = null;
        if (!param1) {
            return null;
        }
        if (param0 == null) {
            var3 = ((bb) this).field_e.field_d.field_b;
        } else {
            var3 = param0;
        }
        if (!(((bb) this).field_e.field_d != var3)) {
            ((bb) this).field_f = null;
            return null;
        }
        ((bb) this).field_f = var3.field_b;
        return var3;
    }

    bb(at param0) {
        ((bb) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_d = "Your email address is used to identify this account";
        field_c = 50;
    }
}
