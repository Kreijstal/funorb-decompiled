/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lob implements dja {
    static int field_b;
    static String field_a;
    static llb[] field_c;

    public final tv a(byte param0) {
        lua stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 13 / ((-64 - param0) / 50);
          stackIn_1_0 = new lua();
          return (tv) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "lob.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        vu stackIn_66_0 = null;
        RuntimeException decompiledCaughtException = null;
        faa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        vu var6 = null;
        String var7 = null;
        vu var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        vu var6Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          var1 = qga.field_b;
          if (!param0) {
            field_b = -108;
          }
          var2 = var1.e((byte) -91);
          if (var2 == 0) {
            if (om.field_c == null) {
              om.field_c = new pr(128);
              mq.field_k = 0;
            }
            stackIn_14_0 = (var1.e((byte) -101) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.a(-1);
            if (var3_int == 0) {
              var5 = var4_ref_String;
            }
            if (var3_int != 0 ||
              var9 != 0) {
              var5 = var1.a(-1);
            }
            var6 = nf.a(var4_ref_String, false);
            var7 = var1.a(-1);
            var8 = jwa.a(false, (CharSequence) ((Object) var4_ref_String));
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = nf.a(var7, false);
              if (null != var6) {
                om.field_c.a(var6, (byte) -124, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new vu();
              om.field_c.a(var6, (byte) -106, (long)var8.hashCode());
              fieldTemp$0 = mq.field_k;
              mq.field_k = mq.field_k + 1;
              var6.field_yb = fieldTemp$0;
              st.field_o.b(-10258, var6);
            }
            var6.field_vb = var7;
            var6.field_Fb = var4_ref_String;
            var6.field_Cb = var5;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (iwa.field_b == 1) {
                iwa.field_b = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (iwa.field_b == 2) {
                iwa.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              gna.a((Throwable) null, "F1: " + hm.e(-13514), 0);
              ifb.l(-125);
              return;
            }
            iwa.field_b = 1;
            var3 = var1.a(-1);
            kbb.field_q = ((String) (var3)).intern();
            var4 = var1.e((byte) -126);
            rma.b(var4, (byte) 71);
            return;
          }
          if (ae.field_f == null) {
            ae.field_f = new pr(128);
            vob.field_p = 0;
          }
          var3Lifetime1 = var1.a(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.a(-1);
          var5Lifetime1 = var1.a(-1);
          var6Lifetime1 = di.a(var4_ref_StringLifetime1, 0);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = di.a(var5Lifetime1, 0);
            if (null != var6Lifetime1) {
              ae.field_f.a(var6Lifetime1, (byte) -31, (long)jwa.a(false, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new vu();
            ae.field_f.a(var6Lifetime1, (byte) -112, (long)jwa.a(false, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            fieldTemp$1 = vob.field_p;
            vob.field_p = vob.field_p + 1;
            var6Lifetime1.field_yb = fieldTemp$1;
            mr.field_M.b(-10258, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Fb = var4_ref_StringLifetime1;
          var6Lifetime1.field_vb = var5Lifetime1;
          var6Lifetime1.field_Ab = (String) (var3Lifetime1);
          var6Lifetime1.b(-3846);
          var7_ref = (vu) (mr.field_M.d(0));
          L17: while (true) {
            if (var7_ref != null) {
              stackIn_66_0 = var7_ref;
              if (var9 != 0) {
                break L17;
              }
              if (qob.a(stackIn_66_0, 7569, var6Lifetime1)) {
                var7_ref = (vu) (mr.field_M.a((byte) 78));
                continue;
              }
            }
            if (null == var7_ref) {
              mr.field_M.b(-10258, var6Lifetime1);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_66_0 = var6Lifetime1;
            break;
          }
          al.a(stackIn_66_0, var7_ref, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "lob.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var8Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (hab.field_i >= param4 &&
            param5 >= lua.field_c) {
            if (ob.field_j > param2) {
              param2 = ob.field_j;
              var6_int = 0;
              if (var10 != 0) {
                if (param2 > mt.field_o) {
                  var6_int = 0;
                  param2 = mt.field_o;
                  var6_int = 1;
                } else {
                  var6_int = 1;
                }
              }
            } else {
              if (param2 > mt.field_o) {
                var6_int = 0;
                param2 = mt.field_o;
                if (var10 != 0) {
                  var6_int = 1;
                }
              } else {
                var6_int = 1;
              }
            }
            if (ob.field_j > param0) {
              param0 = ob.field_j;
              var7 = 0;
              if (var10 != 0) {
                if (mt.field_o >= param0) {
                  var7 = 1;
                  param0 = mt.field_o;
                  var7 = 0;
                } else {
                  param0 = mt.field_o;
                  var7 = 0;
                }
              }
            } else {
              if (mt.field_o >= param0) {
                var7 = 1;
                if (var10 != 0) {
                  param0 = mt.field_o;
                  var7 = 0;
                }
              } else {
                param0 = mt.field_o;
                var7 = 0;
              }
            }
            boolean decompiledSharedTail1 = !(param4 < lua.field_c);
            if (!decompiledSharedTail1) {
              param4 = lua.field_c;
              decompiledSharedTail1 = (var10 != 0);
            }
            if (decompiledSharedTail1) {
              incrementValue$0 = param4;
              param4++;
              ww.a(param1, param0, rba.field_b[incrementValue$0], (byte) 75, param2);
            }
            boolean decompiledSharedTail0 = !(param5 > hab.field_i);
            if (!decompiledSharedTail0) {
              param5 = hab.field_i;
              decompiledSharedTail0 = (var10 != 0);
            }
            if (decompiledSharedTail0) {
              incrementValue$1 = param5;
              param5--;
              ww.a(param1, param0, rba.field_b[incrementValue$1], (byte) 75, param2);
            }
            if (var6_int != 0 &&
              var7 != 0) {
              var8 = param4;
              while (param5 >= var8) {
                var9 = rba.field_b[var8];
                var9[param0] = param1;
                var9[param2] = param1;
                var8++;
                if (var10 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted1) && (var6_int == 0 ||
              var7 == 0 || var10 != 0)) {
              if (var6_int != 0) {
                var8Lifetime1 = param4;
                while (param5 >= var8Lifetime1) {
                  rba.field_b[var8Lifetime1][param2] = param1;
                  var8Lifetime1++;
                  if (var10 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (var6_int == 0 ||
                var10 != 0) &&
                (var7 != 0)) {
                var8Lifetime1Lifetime1 = param4;
                while (var8Lifetime1Lifetime1 <= param5) {
                  rba.field_b[var8Lifetime1Lifetime1][param0] = param1;
                  var8Lifetime1Lifetime1++;
                  if (var10 != 0) {
                    return;
                  }
                }
              }
            }
          }
          if (param3 != 256) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var6), "lob.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -59 % ((param0 + 31) / 40);
          stackIn_1_0 = ua.a(true, param1, true, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("lob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final tv[] a(int param0, int param1) {
        RuntimeException var3 = null;
        tv[] stackIn_2_0 = null;
        lua[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 11995) {
            stackIn_4_0 = new lua[param1];
            return (tv[]) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (tv[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "lob.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_a = null;
          if (param0 <= 88) {
            lob.a(-76, (CharSequence) null);
          }
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "lob.E(" + param0 + ')');
        }
    }

    static {
        field_b = 256;
    }
}
