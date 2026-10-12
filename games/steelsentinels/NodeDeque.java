/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeDeque {
    static int field_g;
    IntrusiveNode sentinel;
    static int field_d;
    static String field_b;
    static String field_f;
    static String field_h;
    static String field_a;
    private IntrusiveNode traversalCursor;
    static int[] field_c;

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_f = null;
          field_a = null;
          field_h = null;
          field_c = null;
          if (param0 != -29) {
            field_g = -1;
          }
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ul.L(" + param0 + ')');
        }
    }

    final static mn d(int param0) {
        int var1_int = 0;
        mn var2 = null;
        mn stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        RuntimeException var1_ref = null;
        try {
          try {
            var1_int = param0;
            while (true) {
              var2 = cd.field_e.a((byte) -13, var1_int);
              if (var2.field_B) {
                stackIn_5_0 = var2;
                return stackIn_5_0;
              }
              var1_int++;
            }
          } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
            stackIn_8_0 = null;
            return (mn) (stackIn_8_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "ul.E(" + param0 + ')');
        }
    }

    final void clear(int obfuscationGuard) {
        RuntimeException runtimeException = null;
        IntrusiveNode var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          scanLoop1: while (true) {
            var2 = this.sentinel.next;
            if (this.sentinel == var2) {
              if (var3 == 0) {
                break scanLoop1;
              }
            } else {
              var2.unlink(4);
            }
            if (var3 == 0) {
              continue;
            }
            break;
          }
          this.traversalCursor = null;
          if (obfuscationGuard != 6) {
            field_c = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ul.Q(" + obfuscationGuard + ')');
        }
    }

    final void addLast(int obfuscationGuard, IntrusiveNode node) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (node.previous != null) {
            node.unlink(4);
          }
          node.next = this.sentinel;
          if (obfuscationGuard != 3) {
            return;
          }
          node.previous = this.sentinel.previous;
          node.previous.next = node;
          node.next.previous = node;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ul.W(").append(obfuscationGuard).append(',');
          if (node == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static ArticulatedPart a(int param0, byte param1) {
        ArticulatedPart var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ArticulatedPart stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var2 = (ArticulatedPart) (ao.field_H.first(13058));
          if (param1 != 67) {
            NodeDeque.e((byte) 116);
          }
          while (var2 != null) {
            if (var2.componentId == param0) {
              stackIn_7_0 = var2;
              return stackIn_7_0;
            }
            var2 = (ArticulatedPart) (ao.field_H.next((byte) -87));
            if (var3 == 0) {
              continue;
            }
            break;
          }
          stackIn_10_0 = null;
          return (ArticulatedPart) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ul.U(" + param0 + ',' + param1 + ')');
        }
    }

    final static IndexedSprite d(byte param0) {
        IndexedSprite stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        IndexedSprite var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        try {
          var1 = new IndexedSprite(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], dl.field_L[0], ba.field_d);
          var2 = -124 % ((param0 + 33) / 62);
          NodeHashTable.a(9324);
          stackIn_1_0 = var1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "ul.M(" + param0 + ')');
        }
    }

    final int size(byte obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        IntrusiveNode var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          var2_int = 0;
          if (obfuscationGuard >= -127) {
            stackIn_3_0 = 32;
            return stackIn_3_0;
          }
          var3 = this.sentinel.next;
          while (var3 != this.sentinel) {
            var2_int++;
            var3 = var3.next;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          stackIn_8_0 = var2_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ul.I(" + obfuscationGuard + ')');
        }
    }

    final IntrusiveNode next(byte obfuscationGuard) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        IntrusiveNode stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -5) {
            NodeDeque.d(-99);
          }
          var2 = this.traversalCursor;
          if (var2 != this.sentinel) {
            this.traversalCursor = var2.next;
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          this.traversalCursor = null;
          stackIn_5_0 = null;
          return (IntrusiveNode) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ul.S(" + obfuscationGuard + ')');
        }
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        IntrusiveNode stackIn_5_0 = null;
        IntrusiveNode stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.sentinel.previous;
          if (var2 == this.sentinel) {
            stackIn_2_0 = null;
            return (IntrusiveNode) (stackIn_2_0);
          }
          if (param0 != -6533) {
            stackIn_5_0 = (IntrusiveNode) null;
            return stackIn_5_0;
          }
          var2.unlink(param0 ^ -6529);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ul.B(" + param0 + ')');
        }
    }

    final IntrusiveNode first(int obfuscationGuard) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        IntrusiveNode stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 13058) {
            stackIn_2_0 = (IntrusiveNode) null;
            return stackIn_2_0;
          }
          var2 = this.sentinel.next;
          if (var2 == this.sentinel) {
            this.traversalCursor = null;
            stackIn_7_0 = null;
            return (IntrusiveNode) (stackIn_7_0);
          }
          this.traversalCursor = var2.next;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ul.N(" + obfuscationGuard + ')');
        }
    }

    private final void a(NodeDeque param0, int param1, IntrusiveNode param2) {
        RuntimeException runtimeException = null;
        IntrusiveNode var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.sentinel.previous;
          this.sentinel.previous = param2.previous;
          param2.previous.next = this.sentinel;
          if (param1 != -16775) {
            this.a(2);
          }
          if (param2 != this.sentinel) {
            param2.previous = param0.sentinel.previous;
            param2.previous.next = param2;
            var4.next = param0.sentinel;
            param0.sentinel.previous = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ul.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        IntrusiveNode stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.sentinel.next;
          if (var2 == this.sentinel) {
            stackIn_4_0 = null;
            return (IntrusiveNode) (stackIn_4_0);
          }
          if (!param0) {
            stackIn_7_0 = (IntrusiveNode) null;
            return stackIn_7_0;
          }
          var2.unlink(4);
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ul.P(" + param0 + ')');
        }
    }

    final void a(IntrusiveNode param0, int param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != param0.previous) {
            param0.unlink(4);
          }
          param0.next = this.sentinel.next;
          param0.previous = this.sentinel;
          if (param1 != -21459) {
            NodeDeque.e((byte) 47);
          }
          param0.previous.next = param0;
          param0.next.previous = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ul.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean e(byte param0) {
        long var1_long = 0L;
        RuntimeException var1 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var1_long = mm.a(77);
          var3 = -sl.field_m + var1_long;
          if (var3 <= 30000L) {
            var5 = 3000;
            boolean decompiledSharedTail0 = !(sb.field_Z >= 7);
            if (!decompiledSharedTail0) {
              var5 = 12000;
              decompiledSharedTail0 = (var6 != 0);
            }
            if (decompiledSharedTail0) {
              if (sb.field_Z >= 5) {
                var5 = 9000;
                if (var6 != 0 &&
                  sb.field_Z >= 3) {
                  var5 = 6000;
                }
              } else {
                if (sb.field_Z >= 3) {
                  var5 = 6000;
                }
              }
            }
            if (var3 > (long)var5) {
              sl.field_m = var1_long;
              sb.field_Z = sb.field_Z + 1;
              return true;
            }
            if (var6 == 0) {
              if (param0 != 17) {
                NodeDeque.a(72, 96, 29, -125, false, -71, -107);
              }
              return false;
            }
          }
          sb.field_Z = 0;
          sl.field_m = var1_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ul.F(" + param0 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 7) {
            field_d = 34;
          }
          stackIn_7_0 = (this.sentinel.next == this.sentinel);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ul.T(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          var2_int = -66 / ((param0 - 30) / 32);
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3 < FunOrbClient.field_z.length)))) {
            stackIn_13_0 = param1;
            if (var4 == 0) {
              if (stackIn_13_0 == FunOrbClient.field_z[var3]) {
                stackIn_10_0 = var3;
                return stackIn_10_0;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = -1;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ul.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, byte param1, boolean param2, int[] param3, pe param4, boolean param5, int[] param6) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int stackIn_59_0Lifetime1;
        int stackIn_59_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        int var27Lifetime1Lifetime1;
        var31 = SteelSentinels.obfuscationControl;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param6[3] >> 2;
          var22 = param6[4] >> 2;
          var23 = param6[5] >> 2;
          var24 = param6[6] >> 2;
          var25 = param6[7] >> 2;
          var26 = param6[8] >> 2;
          var27 = param6[9] >> 2;
          var28 = param6[10] >> 2;
          var29 = param6[11] >> 2;
          var12 = var23 * param3[5] + param3[3] * var21 + param3[4] * var22 >> 14;
          var13 = var26 * param3[5] + var24 * param3[3] + var25 * param3[4] >> 14;
          var14 = var29 * param3[5] + var27 * param3[3] + var28 * param3[4] >> 14;
          var16 = param3[8] * var26 + (var24 * param3[6] + var25 * param3[7]) >> 14;
          var17 = var29 * param3[8] + var28 * param3[7] + param3[6] * var27 >> 14;
          var18 = var21 * param3[9] + (param3[10] * var22 + var23 * param3[11]) >> 14;
          var19 = param3[10] * var25 + var24 * param3[9] + var26 * param3[11] >> 14;
          var15 = var22 * param3[7] + (param3[6] * var21 + param3[8] * var23) >> 14;
          var20 = param3[10] * var28 + param3[9] * var27 + param3[11] * var29 >> 14;
          var21Lifetime1 = param3[0] - param6[0];
          var22Lifetime1 = param3[1] - param6[1];
          var23Lifetime1 = -param6[2] + param3[2];
          var9 = var23Lifetime1 * param6[5] + param6[4] * var22Lifetime1 + var21Lifetime1 * param6[3] >> 16 - cj.field_j;
          var11 = var21Lifetime1 * param6[9] - (-(param6[10] * var22Lifetime1) - param6[11] * var23Lifetime1) >> 16;
          var10 = var21Lifetime1 * param6[6] - (-(param6[7] * var22Lifetime1) - param6[8] * var23Lifetime1) >> 16 - cj.field_j;
          var21Lifetime2 = lf.field_d;
          var22Lifetime2 = 22 / ((param1 - 51) / 45);
          var23Lifetime2 = lf.field_b;
          var24Lifetime1 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var24Lifetime1 < param4.field_L) {
              var25Lifetime1 = param4.field_z[var24Lifetime1];
              var26Lifetime1 = param4.field_m[var24Lifetime1];
              var27Lifetime1 = param4.field_C[var24Lifetime1];
              var28Lifetime1 = (var18 * var27Lifetime1 + var26Lifetime1 * var15 + var25Lifetime1 * var12 >> -cj.field_j + 16) + var9;
              var29Lifetime1 = var10 + (var27Lifetime1 * var19 + var26Lifetime1 * var16 + var25Lifetime1 * var13 >> 16 - cj.field_j);
              var30 = (var26Lifetime1 * var17 + (var25Lifetime1 * var14 + var27Lifetime1 * var20) >> 16) + var11;
              stackIn_59_0 = 50;
              stackIn_59_1 = var30;
              if (var31 != 0) {
                if (stackIn_59_0 < stackIn_59_1) {
                  stackIn_68_0 = ~tc.field_A.length;
                  break scanLoop1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_59_0 <= stackIn_59_1) {
                  eh.field_d[var24Lifetime1] = var21Lifetime2 + var28Lifetime1 / var30;
                  FunOrbClient.field_p[var24Lifetime1] = var23Lifetime2 + var29Lifetime1 / var30;
                  if (var30 < var7_int) {
                    var7_int = var30;
                  }
                  if (var8 < var30) {
                    var8 = var30;
                  }
                  km.field_h[var24Lifetime1] = var30;
                } else {
                  km.field_h[var24Lifetime1] = -2147483648;
                }
                if (param5) {
                  ResourceArchive.field_l[var24Lifetime1] = var28Lifetime1 >> cj.field_j;
                  sb.field_V[var24Lifetime1] = var29Lifetime1 >> cj.field_j;
                  jd.field_lb[var24Lifetime1] = var30;
                }
                var24Lifetime1++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (param4.field_r != null &&
                param4.field_l != null &&
                null != param4.field_t &&
                null != param4.field_Z &&
                param4.field_S != null &&
                null != param4.field_Q &&
                param4.field_a != null &&
                param4.field_X != null &&
                param4.field_B != null) {
                var24Lifetime1 = 0;
                while (!(param4.field_w <= var24Lifetime1)) {
                  var25Lifetime1Lifetime1 = param4.field_r[var24Lifetime1];
                  var26Lifetime1Lifetime1 = param4.field_l[var24Lifetime1];
                  var27Lifetime1Lifetime1 = param4.field_t[var24Lifetime1];
                  uf.field_b[var24Lifetime1] = (var12 * var25Lifetime1Lifetime1 + var15 * var26Lifetime1Lifetime1 + var18 * var27Lifetime1Lifetime1 >> 16) + var9;
                  rn.field_w[var24Lifetime1] = (var16 * var26Lifetime1Lifetime1 + (var13 * var25Lifetime1Lifetime1 + var19 * var27Lifetime1Lifetime1) >> 16) + var10;
                  fm.field_l[var24Lifetime1] = var11 + (var14 * var25Lifetime1Lifetime1 + var17 * var26Lifetime1Lifetime1 + var27Lifetime1Lifetime1 * var20 >> 16);
                  var25Lifetime1Lifetime1 = param4.field_Z[var24Lifetime1];
                  var26Lifetime1Lifetime1 = param4.field_S[var24Lifetime1];
                  var27Lifetime1Lifetime1 = param4.field_Q[var24Lifetime1];
                  re.field_bb[var24Lifetime1] = var9 + (var27Lifetime1Lifetime1 * var18 + (var12 * var25Lifetime1Lifetime1 + var15 * var26Lifetime1Lifetime1) >> 16);
                  an.field_d[var24Lifetime1] = (var25Lifetime1Lifetime1 * var13 - (-(var26Lifetime1Lifetime1 * var16) - var27Lifetime1Lifetime1 * var19) >> 16) + var10;
                  kh.field_u[var24Lifetime1] = var11 + (var25Lifetime1Lifetime1 * var14 + var17 * var26Lifetime1Lifetime1 + var27Lifetime1Lifetime1 * var20 >> 16);
                  var25Lifetime1Lifetime1 = param4.field_a[var24Lifetime1];
                  var26Lifetime1Lifetime1 = param4.field_X[var24Lifetime1];
                  var27Lifetime1Lifetime1 = param4.field_B[var24Lifetime1];
                  rd.field_a[var24Lifetime1] = (var18 * var27Lifetime1Lifetime1 + var12 * var25Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var15 >> 16) + var9;
                  ci.field_c[var24Lifetime1] = var10 + (var27Lifetime1Lifetime1 * var19 + (var13 * var25Lifetime1Lifetime1 + var16 * var26Lifetime1Lifetime1) >> 16);
                  fm.field_e[var24Lifetime1] = var11 + (var14 * var25Lifetime1Lifetime1 - (-(var26Lifetime1Lifetime1 * var17) - var27Lifetime1Lifetime1 * var20) >> 16);
                  var24Lifetime1++;
                  if (var31 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param0))) {
                var9 = param3[3];
                var10 = param3[4];
                var11 = param3[5];
                var12 = param3[6];
                var13 = param3[7];
                var14 = param3[8];
                var15 = param3[9];
                var16 = param3[10];
                var17 = param3[11];
              }
              if (decompiledFrameRemainder0) {
                var18 = 0;
                while (true) {
                  stackIn_59_0Lifetime1 = var18;
                  stackIn_59_1Lifetime1 = param4.field_u;
                  if (stackIn_59_0Lifetime1 >= stackIn_59_1Lifetime1) {
                    break;
                  }
                  stackIn_68_0 = ~tc.field_A.length;
                  if (var31 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_68_0 >= ~var18) {
                    break;
                  }
                  var19 = param4.field_g[var18];
                  var20 = param4.field_H[var18];
                  var21Lifetime2 = param4.field_F[var18];
                  tc.field_A[var18] = var15 * var21Lifetime2 + var20 * var12 + var19 * var9 >> 16;
                  hm.field_c[var18] = var10 * var19 + var20 * var13 + var16 * var21Lifetime2 >> 16;
                  pi.field_e[var18] = var14 * var20 + (var19 * var11 + var17 * var21Lifetime2) >> 16;
                  var18++;
                }
              }
            }
            stackIn_68_0 = var8;
            break;
          }
          wi.a(stackIn_68_0, param4, var7_int, param2, 2147483647);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("ul.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param4 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    final static RgbSprite[] a(byte param0, int param1, int param2) {
        RuntimeException var3 = null;
        RgbSprite[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            NodeDeque.d(10);
          }
          stackIn_4_0 = bm.b(param1, -2, 1, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ul.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            field_h = (String) null;
          }
          if (NodeIterator.a(2)) {
            t.a((byte) 125, param5, param4, param6);
            if (null != an.field_i &&
              an.field_i.a(param4, param0 ^ 125, param3, param6, param1)) {
              rh.a(false);
              param4 = false;
            }
            bh.a(param6, param4, (byte) -49);
            cc.a(param2, (byte) 119, param4);
            param4 = false;
          }
          stackIn_13_0 = param4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var7), "ul.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final IntrusiveNode a(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        IntrusiveNode stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 124) {
            stackIn_2_0 = (IntrusiveNode) null;
            return stackIn_2_0;
          }
          if (param1 != null) {
            var3 = param1;
            if (SteelSentinels.obfuscationControl != 0) {
              var3 = this.sentinel.next;
            }
          } else {
            var3 = this.sentinel.next;
          }
          if (this.sentinel != var3) {
            this.traversalCursor = var3.next;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.traversalCursor = null;
          stackIn_8_0 = null;
          return (IntrusiveNode) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ul.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, NodeDeque param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, -16775, this.sentinel.next);
          if (param0 < 8) {
            field_d = 72;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ul.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final IntrusiveNode b(int param0) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1063677678) {
            this.traversalCursor = (IntrusiveNode) null;
          }
          var2 = this.sentinel.previous;
          if (var2 == this.sentinel) {
            this.traversalCursor = null;
            stackIn_7_0 = null;
            return (IntrusiveNode) (stackIn_7_0);
          }
          this.traversalCursor = var2.previous;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ul.R(" + param0 + ')');
        }
    }

    public NodeDeque() {
        this.sentinel = new IntrusiveNode();
        try {
          this.sentinel.previous = this.sentinel;
          this.sentinel.next = this.sentinel;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ul.<init>()");
        }
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        IntrusiveNode stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2137) {
            stackIn_2_0 = (IntrusiveNode) null;
            return stackIn_2_0;
          }
          var2 = this.traversalCursor;
          if (this.sentinel == var2) {
            this.traversalCursor = null;
            stackIn_7_0 = null;
            return (IntrusiveNode) (stackIn_7_0);
          }
          this.traversalCursor = var2.previous;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ul.G(" + param0 + ')');
        }
    }

    static {
        field_b = "unlimited";
        field_f = "<%1> was destroyed by <%0>";
        field_a = "Quit";
        field_c = new int[]{2, 20, 21, 6, 37, 45, 5, 9};
        field_h = "TRAINING MISSION <%0> <%1>";
    }
}
