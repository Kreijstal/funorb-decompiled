/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends ah {
    static int field_n;
    static String field_o;
    static String field_p;

    public static void g(int param0) {
        if (param0 != -17) {
            field_o = null;
            field_p = null;
            field_o = null;
            return;
        }
        field_p = null;
        field_o = null;
    }

    kl(ul param0) {
        super(param0);
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 0) {
            return true;
        }
        return fk.a(-1465, param0) != null ? true : false;
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          if (hi.a(param1, -2)) {
            if (param0 != 2) {
              if (4 != param0) {
                if (param0 == 8) {
                  return true;
                } else {
                  if ((param0 ^ -1) != -13) {
                    if (16 != param0) {
                      if (2 == param1) {
                        if (4 == param0) {
                          return true;
                        } else {
                          if ((param0 ^ -1) != -9) {
                            if (param0 != 12) {
                              if ((param0 ^ -1) == -17) {
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
                        }
                      } else {
                        return false;
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
            } else {
              return true;
            }
          } else {
            if (2 == param1) {
              if (4 == param0) {
                return true;
              } else {
                if ((param0 ^ -1) != -9) {
                  if (param0 != 12) {
                    if ((param0 ^ -1) == -17) {
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
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final String a(byte param0, String param1) {
        int var3 = 95 / ((param0 - 10) / 51);
        if (((kl) this).a(-1, param1) != ob.field_a) {
            return null;
        }
        return tb.field_E;
    }

    final rf a(int param0, String param1) {
        int var3 = 0;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var5 = (CharSequence) (Object) param1;
        if (fk.a(false, var5)) {
          var6 = (CharSequence) (Object) param1;
          var3 = gn.a(param0 ^ -16777216, var6);
          if (param0 == -1) {
            if (0 < var3) {
              if (130 < var3) {
                return ob.field_a;
              } else {
                return df.field_h;
              }
            } else {
              return ob.field_a;
            }
          } else {
            var4 = null;
            rf discarded$4 = ((kl) this).a(-6, (String) null);
            if (0 < var3) {
              if (130 < var3) {
                return ob.field_a;
              } else {
                return df.field_h;
              }
            } else {
              return ob.field_a;
            }
          }
        } else {
          return ob.field_a;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Names should contain a maximum of 12 characters";
    }
}
