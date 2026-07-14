/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends vm {
    static String field_o;
    private qn field_q;
    static un field_p;
    static String field_r;
    static int[] field_n;
    static jk field_l;
    static String field_m;

    public static void h(int param0) {
        Object var2 = null;
        field_r = null;
        field_p = null;
        field_n = null;
        field_o = null;
        field_l = null;
        field_m = null;
        if (param0 == 0) {
          return;
        } else {
          var2 = null;
          String discarded$2 = oc.a((String) null, (String[]) null, (byte) 51);
          return;
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (0 > var6_int) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L1: while (true) {
              var8 = param0.indexOf("<%", var5);
              if ((var8 ^ -1) <= -1) {
                var5 = 2 + var8;
                L2: while (true) {
                  L3: {
                    if (var3 <= var5) {
                      break L3;
                    } else {
                      if (!di.a(-49, param0.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var9 = param0.substring(2 + var8, var5);
                  if (lg.a((byte) 74, (CharSequence) (Object) var9)) {
                    if (var3 <= var5) {
                      continue L1;
                    } else {
                      if (62 != param0.charAt(var5)) {
                        continue L1;
                      } else {
                        var5++;
                        var10 = fn.a((CharSequence) (Object) var9, 0);
                        StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$4 = var6.append(param1[var10]);
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param0.substring(var7));
                if (param2 >= -41) {
                  field_o = null;
                  return var6.toString();
                } else {
                  return var6.toString();
                }
              }
            }
          } else {
            var5 = var6_int - -2;
            L4: while (true) {
              L5: {
                if (var3 <= var5) {
                  break L5;
                } else {
                  if (!di.a(-49, param0.charAt(var5))) {
                    break L5;
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
              var7_ref = param0.substring(var6_int - -2, var5);
              if (lg.a((byte) 72, (CharSequence) (Object) var7_ref)) {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param0.charAt(var5) != 62) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = fn.a((CharSequence) (Object) var7_ref, 0);
                    var4 = var4 + (var6_int + -var5 + param1[var8].length());
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        }
    }

    final String a(String param0, int param1) {
        vb var3 = null;
        if (((oc) this).field_q instanceof ee) {
          var3 = ((ee) (Object) ((oc) this).field_q).a(param1 + 9210);
          if (var3 != null) {
            if (var3.a(21314) == oa.field_a) {
              if (param0.equals((Object) (Object) ((oc) this).field_q.field_v)) {
                return var3.a(false);
              } else {
                return gg.field_z;
              }
            } else {
              return var3.a(false);
            }
          } else {
            if (param1 == -9316) {
              if (!param0.equals((Object) (Object) ((oc) this).field_q.field_v)) {
                return gg.field_z;
              } else {
                return null;
              }
            } else {
              field_r = null;
              if (!param0.equals((Object) (Object) ((oc) this).field_q.field_v)) {
                return gg.field_z;
              } else {
                return null;
              }
            }
          }
        } else {
          if (param1 == -9316) {
            if (!param0.equals((Object) (Object) ((oc) this).field_q.field_v)) {
              return gg.field_z;
            } else {
              return null;
            }
          } else {
            field_r = null;
            if (!param0.equals((Object) (Object) ((oc) this).field_q.field_v)) {
              return gg.field_z;
            } else {
              return null;
            }
          }
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param2 = qm.a('_', param2, "", (byte) -51);
        if (param1 < -114) {
          var3 = i.a(0, param2);
          if ((param0.indexOf(param2) ^ -1) == 0) {
            if (param0.indexOf(var3) != -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var4 = null;
          String discarded$2 = oc.a((String) null, (String[]) null, (byte) -72);
          var3 = i.a(0, param2);
          if ((param0.indexOf(param2) ^ -1) != 0) {
            return true;
          } else {
            L0: {
              if (param0.indexOf(var3) == -1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final mk a(byte param0, String param1) {
        int var3 = 0;
        vb var3_ref = null;
        mk stackIn_4_0 = null;
        mk stackIn_9_0 = null;
        mk stackIn_15_0 = null;
        mk stackOut_14_0 = null;
        mk stackOut_13_0 = null;
        mk stackOut_8_0 = null;
        mk stackOut_7_0 = null;
        mk stackOut_3_0 = null;
        mk stackOut_2_0 = null;
        if (((oc) this).field_q instanceof ee) {
          var3_ref = ((ee) (Object) ((oc) this).field_q).a(-89);
          if (var3_ref != null) {
            if (var3_ref.a(21314) == oa.field_a) {
              L0: {
                var3 = 125 % ((param0 - -49) / 62);
                if (!param1.equals((Object) (Object) ((oc) this).field_q.field_v)) {
                  stackOut_14_0 = qk.field_b;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = oa.field_a;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return (mk) (Object) stackIn_15_0;
            } else {
              return qk.field_b;
            }
          } else {
            L1: {
              var3 = 125 % ((param0 - -49) / 62);
              if (!param1.equals((Object) (Object) ((oc) this).field_q.field_v)) {
                stackOut_8_0 = qk.field_b;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = oa.field_a;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            return (mk) (Object) stackIn_9_0;
          }
        } else {
          L2: {
            var3 = 125 % ((param0 - -49) / 62);
            if (!param1.equals((Object) (Object) ((oc) this).field_q.field_v)) {
              stackOut_3_0 = qk.field_b;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = oa.field_a;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          return (mk) (Object) stackIn_4_0;
        }
    }

    oc(qn param0, qn param1) {
        super(param0);
        ((oc) this).field_q = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Enter name of friend to add to list";
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
