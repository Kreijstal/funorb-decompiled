/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    private IntrusiveNode cursor;

    final IntrusiveNode removeFirst(boolean param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel == var2) {
          return null;
        }
        if (param0) {
          var2.unlink(-3846);
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode[] toArray(int param0) {
        int var3 = 0;
        IntrusiveNode var4 = null;
        int incrementValue$0 = 0;
        int var5 = VoidHunters.field_G;
        IntrusiveNode[] var6 = new IntrusiveNode[this.size(3)];
        IntrusiveNode[] var2 = var6;
        if (param0 == -4872) {
          var3 = 0;
          var4 = this.sentinel.next;
          while (var4 != this.sentinel) {
            incrementValue$0 = var3;
            var3++;
            var6[incrementValue$0] = var4;
            var4 = var4.next;
          }
          return var2;
        }
        return (IntrusiveNode[]) null;
    }

    final IntrusiveNode startAt(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.sentinel.next;
          } else {
            var3 = param1;
          }
          if (param0 != 3) {
            this.size(111);
          }
          if (var3 == this.sentinel) {
            this.cursor = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.cursor = var3.next;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ij.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveNode removeLast(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 >= -102) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addFirst((IntrusiveNode) null, (byte) -49);
          var2 = this.sentinel.previous;
          if (this.sentinel != var2) {
            var2.unlink(-3846);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel != var2Lifetime1) {
          var2Lifetime1.unlink(-3846);
          return var2Lifetime1;
        }
        return null;
    }

    final void addLast(int param0, IntrusiveNode param1) {
        try {
          if (param0 != -10258) {
            this.clear(-27);
          }
          if (param1.previous != null) {
            param1.unlink(-3846);
          }
          param1.previous = this.sentinel.previous;
          param1.next = this.sentinel;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ij.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void clear(int param0) {
        IntrusiveNode var2 = null;
        int var3 = VoidHunters.field_G;
        while (true) {
          var2 = this.sentinel.next;
          if (this.sentinel == var2) {
            break;
          }
          var2.unlink(-3846);
        }
        if (param0 >= 89) {
          this.cursor = null;
          return;
        }
        this.sentinel = (IntrusiveNode) null;
        this.cursor = null;
    }

    final boolean isEmpty(int param0) {
        int var2 = 60 % ((59 - param0) / 37);
        return this.sentinel.next == this.sentinel ? true : false;
    }

    final void addFirst(IntrusiveNode param0, byte param1) {
        if (null != param0.previous) {
          param0.unlink(-3846);
        }
        param0.next = this.sentinel.next;
        param0.previous = this.sentinel;
        param0.previous.next = param0;
        if (param1 != -55) {
          return;
        }
        try {
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ij.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final IntrusiveNode next(byte param0) {
        if (param0 <= 6) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.cursor;
        if (var2 != this.sentinel) {
          this.cursor = var2.next;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final static int decodeBase64(byte[] param0, int param1, int param2, String param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param1 != -10388) {
            stackIn_3_0 = 104;
            return stackIn_3_0;
          }
          var4_int = param2;
          var5 = param3.length();
          for (var6 = 0; var6 < var5; var6 += 4) {
            var7 = SetThrusterParticleLife.a(param3.charAt(var6), -89);
            if (var5 > (var6 + 1)) {
              stackIn_9_0 = SetThrusterParticleLife.a(param3.charAt(1 + var6), -23);
            } else {
              stackIn_9_0 = -1;
            }
            var8 = stackIn_9_0;
            if (var6 + 2 < var5) {
              stackIn_12_0 = SetThrusterParticleLife.a(param3.charAt(2 + var6), -103);
            } else {
              stackIn_12_0 = -1;
            }
            var9 = stackIn_12_0;
            if (3 + var6 >= var5) {
              stackIn_15_0 = -1;
            } else {
              stackIn_15_0 = SetThrusterParticleLife.a(param3.charAt(var6 + 3), -84);
            }
            var10 = stackIn_15_0;
            incrementValue$0 = param2;
            param2++;
            param0[incrementValue$0] = (byte)SetAngularForceDownshift.orBits(var8 >>> 4, var7 << 2);
            if (var9 != -1) {
              incrementValue$1 = param2;
              param2++;
              param0[incrementValue$1] = (byte)SetAngularForceDownshift.orBits(dla.andBits(15, var8) << 4, var9 >>> 2);
              if (-1 != var10) {
                incrementValue$2 = param2;
                param2++;
                param0[incrementValue$2] = (byte)SetAngularForceDownshift.orBits(var10, dla.andBits(var9, 3) << 6);
                continue;
              }
            }
            break;
          }
          stackIn_19_0 = param2 - var4_int;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ij.N(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final IntrusiveNode first(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 0) {
          this.sentinel = (IntrusiveNode) null;
          var2 = this.sentinel.next;
          if (var2 == this.sentinel) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.next;
          return var2;
        }
        var2Lifetime1 = this.sentinel.next;
        if (var2Lifetime1 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode previous(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -1155566844) {
          this.isEmpty(-8);
          var2 = this.cursor;
          if (this.sentinel == var2) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.cursor;
        if (this.sentinel == var2Lifetime1) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    final IntrusiveNode last(byte param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (param0 < 115) {
          this.toArray(-72);
          if (var2 != this.sentinel) {
            this.cursor = var2.previous;
            return var2;
          }
          this.cursor = null;
          return null;
        }
        if (var2 != this.sentinel) {
          this.cursor = var2.previous;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    final int size(int param0) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        int var4 = VoidHunters.field_G;
        IntrusiveNode var3Lifetime1;
        int var2Lifetime1;
        if (param0 == 3) {
          var2 = 0;
          var3 = this.sentinel.next;
          while (var3 != this.sentinel) {
            var3 = var3.next;
            var2++;
          }
          return var2;
        }
        this.sentinel = (IntrusiveNode) null;
        var2Lifetime1 = 0;
        var3Lifetime1 = this.sentinel.next;
        while (var3Lifetime1 != this.sentinel) {
          var3Lifetime1 = var3Lifetime1.next;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    static {
    }
}
