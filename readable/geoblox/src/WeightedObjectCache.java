/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeightedObjectCache {
    private SecondaryNodeDeque field_e;
    static String loginUsernameEmailText;
    private int field_d;
    private IterableNodeHashTable field_f;
    static String[] ratingModeLongNames;
    static int field_g;
    private int field_b;

    private final void a(long param0, int param1) {
        CacheReference var4 = (CacheReference) ((Object) this.field_f.findByKey(param0, (byte) -72));
        this.a(param1 - 117, var4);
        if (param1 == 0) {
            return;
        }
        loginUsernameEmailText = (String) null;
    }

    private final void a(long param0, int param1, boolean param2, Object param3) {
        CacheReference var6 = null;
        StrongCacheReference var6_ref = null;
        int var7 = Geoblox.clientControlFlowFlag;
        try {
            if (!(param1 <= this.field_b)) {
                throw new IllegalStateException();
            }
            this.a(param0, 0);
            this.field_d = this.field_d - param1;
            while (0 > this.field_d) {
                var6 = (CacheReference) ((Object) this.field_e.removeFirst((byte) -41));
                this.a(114, var6);
            }
            var6_ref = new StrongCacheReference(param3, param1);
            this.field_f.put(param0, -99, var6_ref);
            if (param2) {
                WeightedObjectCache.clearAvatarSteering(-85);
            }
            this.field_e.addLast(-1, var6_ref);
            ((CacheReference) ((Object) var6_ref)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "jj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final Object a(byte param0, long param1) {
        CacheReference var7 = (CacheReference) ((Object) this.field_f.findByKey(param1, (byte) 61));
        if (var7 == null) {
            return null;
        }
        Object var5 = var7.e((byte) 120);
        if (param0 < 56) {
            return (Object) null;
        }
        if (!(var5 != null)) {
            var7.unlinkNode(false);
            var7.unlinkSecondaryNode((byte) 92);
            this.field_d = this.field_d + var7.field_n;
            return null;
        }
        if (!var7.g(13)) {
            this.field_e.addLast(-1, var7);
            var7.secondaryKey = 0L;
            return var5;
        }
        StrongCacheReference var6 = new StrongCacheReference(var5, var7.field_n);
        this.field_f.put(var7.nodeKey, -81, var6);
        this.field_e.addLast(-1, var6);
        ((CacheReference) ((Object) var6)).secondaryKey = 0L;
        var7.unlinkNode(false);
        var7.unlinkSecondaryNode((byte) 93);
        return var5;
    }

    final void a(int param0, long param1, Object param2) {
        try {
            int var5_int = 4 / ((param0 - 56) / 59);
            this.a(param1, 1, false, param2);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "jj.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void clearAvatarSteering(int methodGuard) {
        if (methodGuard > -96) {
            loginUsernameEmailText = (String) null;
            FullscreenSupport.avatarSteeringDirectionId = 0;
            return;
        }
        FullscreenSupport.avatarSteeringDirectionId = 0;
    }

    private final void a(int param0, CacheReference param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -56 % ((61 - param0) / 42);
          if (param1 == null) {
            return;
          }
          param1.unlinkNode(false);
          param1.unlinkSecondaryNode((byte) 75);
          this.field_d = this.field_d + param1.field_n;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("jj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        ratingModeLongNames = null;
        int var1 = -3 / ((81 - param0) / 41);
        loginUsernameEmailText = null;
    }

    private WeightedObjectCache() throws Throwable {
        throw new Error();
    }

    static {
        loginUsernameEmailText = "Login: ";
        ratingModeLongNames = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = 13;
    }
}
