/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends hf {
    kl field_g;
    int field_i;
    static wl field_j;
    hf field_f;
    static sk[] field_h;

    final static void c(byte param0) {
        p var1 = null;
        p var1_ref = null;
        int var2 = 0;
        var2 = Geoblox.field_C;
        if (!hj.field_c) {
          if (null != vk.field_b) {
            if (vk.field_b.field_f) {
              ra.field_d = vk.field_b.field_j;
              hj.field_c = true;
              ug.field_c = ug.field_c & (ra.field_d ^ -1);
              vl.field_p = vl.field_p | ra.field_d;
              if (param0 >= -119) {
                L0: {
                  field_j = null;
                  if (fh.c(-91)) {
                    break L0;
                  } else {
                    L1: while (true) {
                      var1_ref = (p) (Object) ja.field_A.b((byte) -118);
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        sj.a(var1_ref, -56, 4);
                        continue L1;
                      }
                    }
                  }
                }
                return;
              } else {
                L2: {
                  if (fh.c(-91)) {
                    break L2;
                  } else {
                    L3: while (true) {
                      var1_ref = (p) (Object) ja.field_A.b((byte) -118);
                      if (var1_ref == null) {
                        break L2;
                      } else {
                        sj.a(var1_ref, -56, 4);
                        continue L3;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              if (param0 >= -119) {
                L4: {
                  field_j = null;
                  if (fh.c(-91)) {
                    break L4;
                  } else {
                    L5: while (true) {
                      var1_ref = (p) (Object) ja.field_A.b((byte) -118);
                      if (var1_ref == null) {
                        break L4;
                      } else {
                        sj.a(var1_ref, -56, 4);
                        continue L5;
                      }
                    }
                  }
                }
                return;
              } else {
                L6: {
                  if (fh.c(-91)) {
                    break L6;
                  } else {
                    L7: while (true) {
                      var1_ref = (p) (Object) ja.field_A.b((byte) -118);
                      if (var1_ref == null) {
                        break L6;
                      } else {
                        sj.a(var1_ref, -56, 4);
                        continue L7;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (param0 >= -119) {
              L8: {
                field_j = null;
                if (fh.c(-91)) {
                  break L8;
                } else {
                  L9: while (true) {
                    var1_ref = (p) (Object) ja.field_A.b((byte) -118);
                    if (var1_ref == null) {
                      break L8;
                    } else {
                      sj.a(var1_ref, -56, 4);
                      continue L9;
                    }
                  }
                }
              }
              return;
            } else {
              L10: {
                if (fh.c(-91)) {
                  break L10;
                } else {
                  L11: while (true) {
                    var1_ref = (p) (Object) ja.field_A.b((byte) -118);
                    if (var1_ref == null) {
                      break L10;
                    } else {
                      sj.a(var1_ref, -56, 4);
                      continue L11;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          if (param0 >= -119) {
            field_j = null;
            if (!fh.c(-91)) {
              L12: while (true) {
                var1 = (p) (Object) ja.field_A.b((byte) -118);
                if (var1 != null) {
                  sj.a(var1, -56, 4);
                  continue L12;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L13: {
              if (fh.c(-91)) {
                break L13;
              } else {
                L14: while (true) {
                  var1_ref = (p) (Object) ja.field_A.b((byte) -118);
                  if (var1_ref == null) {
                    break L13;
                  } else {
                    sj.a(var1_ref, -56, 4);
                    continue L14;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final static rh a(int param0, boolean param1, boolean param2, boolean param3, byte param4) {
        int var5 = 55 / ((param4 - -65) / 46);
        return am.a(-128, param0, param2, !param1 ? 0 : 1, param3, false);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2_ref = null;
            try {
                var2_ref = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(wf.a(var2_ref, -84, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            int var2 = 91 % ((50 - param0) / 49);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 <= 49) {
            je.c((byte) -123);
            field_h = null;
            return;
        }
        field_h = null;
    }

    je(kl param0, hf param1) {
        ((je) this).field_g = param0;
        ((je) this).field_i = param0.i();
        ((je) this).field_f = param1;
        ((je) this).field_g.f(((je) this).field_i * j.field_gb / 80);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new wl();
    }
}
